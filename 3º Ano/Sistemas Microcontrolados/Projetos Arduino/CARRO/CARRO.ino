#include <Servo.h>

Servo servo;

void setup() {
  Serial.begin(9600);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  servo.attach(11);
}

void setas(int l, int r){
  digitalWrite(12, l);
  digitalWrite(13, r);
  delay(100);
  digitalWrite(12, 0);
  digitalWrite(13, 0);
}

void luzes(int f, int b){
  digitalWrite(10, f);
  digitalWrite(9, b);
}

void loop() {
  int x = Serial.available();
  if(x>0){
    char c = Serial.read();
    if(c == 'a') servo.write(0);
    if(c == 'd') servo.write(179);
    if(c == 'l') luzes(1,1);
    if(c == '1') setas(1,0);
    if(c == '3') setas(0,1);
    if(c == 'w') digitalWrite(8, 1);
    if(c == 's') digitalWrite(8, 0);
  }
}
