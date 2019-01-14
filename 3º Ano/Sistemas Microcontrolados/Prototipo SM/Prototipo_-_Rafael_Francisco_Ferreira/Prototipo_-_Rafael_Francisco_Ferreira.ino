#include <Servo.h>
#define Farol1 6 //Luzes frontais
#define Farol2 7 //Luzes frontais
#define LuzFreio 8 //Luzes traseiras
#define Motor_PWM 10 //Porta do controle de velocidade do motor
#define Motor_DIR 11 //Porta qye define a direção do giro do motor

//AUTOR: Rafael Francisco Ferreira
//Sistemas Microcontrolados - Ciência da Computação
//Universidade Estadual do Paraná - Campus Apucarana - 2017

Servo servo;
char c; //Comando
int mSpeed = 255, speedCoef = 4; //Velocidade do motor

void setup() {
  Serial.begin(9600);
  servo.attach(3);
  servo.write(89);
  pinMode(Farol1, OUTPUT);
  pinMode(Farol2, OUTPUT);
  pinMode(LuzFreio, OUTPUT);
  pinMode( Motor_DIR, OUTPUT );
  pinMode( Motor_PWM, OUTPUT );
  digitalWrite( Motor_DIR, LOW );
  digitalWrite( Motor_PWM, LOW );
}

//Controle de direção
void direcao(char dir){
  if(dir=='R') servo.write(179);
  if(dir=='L') servo.write(0);
}

void luzes(char op){
  if(op=='W') {
    digitalWrite(Farol1, 1);
    digitalWrite(Farol2, 1);
  }
  if(op=='w') {
    digitalWrite(Farol1, 0);
    digitalWrite(Farol2, 0);
  }
  if(op=='U') digitalWrite(LuzFreio, 1);
  if(op=='u') digitalWrite(LuzFreio, 0);
}

void motor(char dir){
  if(c=='F'){
    digitalWrite(Motor_DIR, HIGH); 
    analogWrite(Motor_PWM, mSpeed/speedCoef);  
  }
  if(c=='B'){
    delay(100);
    digitalWrite(Motor_DIR, LOW); 
    analogWrite(Motor_PWM, 255);
  }
}

void stopRobot(){
  //Para o motor quando nenhuma tecla for acionada
  digitalWrite(Motor_DIR, LOW); 
  digitalWrite(Motor_PWM, LOW);
  //Coloca o servo na posição central quando nenhuma tecla for acionada
  servo.write(89);
}

void velocidade(char c){
  if(c=='0') mSpeed = 100;
  if(c=='1') mSpeed = 115;
  if(c=='2') mSpeed = 130;
  if(c=='3') mSpeed = 145;
  if(c=='4') mSpeed = 160;
  if(c=='5') mSpeed = 175;
  if(c=='6') mSpeed = 190;
  if(c=='7') mSpeed = 205;
  if(c=='8') mSpeed = 220;
  if(c=='9') mSpeed = 235;
  if(c=='q') mSpeed = 255;
}

void panic(){
  stopRobot();
  luzes('w');
  luzes('u');
}

void movDiagonal(char op){
  if(op=='I'){ 
    direcao('R'); 
    digitalWrite(Motor_DIR, HIGH); 
    analogWrite(Motor_PWM, mSpeed/speedCoef);
  }
  if(op=='G'){ 
    direcao('L'); 
    digitalWrite(Motor_DIR, HIGH); 
    analogWrite(Motor_PWM, mSpeed/speedCoef);
  }
  if(op=='J'){ 
    direcao('R'); 
    digitalWrite(Motor_DIR, LOW); 
    analogWrite(Motor_PWM, mSpeed);
    }
  if(op=='H'){ 
    direcao('L');
    digitalWrite(Motor_DIR, LOW); 
    analogWrite(Motor_PWM, mSpeed);
  }
}

void loop() {
  if(Serial.available()>0){
    //Comando recebido pela porta serial via módulo bluetooth HC-06
    c = Serial.read();
    //Controle da velocidade de giro do motor
    if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || 
       c=='6' || c=='7' || c=='8' || c=='9' || c=='q') velocidade(c);
       
    //Controle do servo
    if(c=='R' || c=='L') direcao(c);
    if(c=='I' || c=='G' || c=='H' || c=='J') movDiagonal(c);
    
    //Controle das luzes
    if(c=='W' || c=='w' || c=='U' || c=='u') luzes(c);
    
    //Controle do motor
    if(c=='F' || c=='B') motor(c);
    
    //Para quando as teclas estiverem soltas
    if(c=='S') stopRobot();
    
    //Para tudo
    if(c=='X') panic();
    
    Serial.print("Comando: ");
    Serial.println(c);
    Serial.print("Velocidade: ");
    Serial.println(mSpeed);
  } 
}
