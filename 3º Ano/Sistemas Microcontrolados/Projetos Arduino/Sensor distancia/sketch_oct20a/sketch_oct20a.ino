#include <Ultrasonic.h>

Ultrasonic ultrasonic(3, 2);

void setup() {
  Serial.begin(9600);
  pinMode(7, OUTPUT);
}

void loop() {
  //Le as informacoes do sensor, em cm e pol
  float cm;
  cm = ultrasonic.Ranging(CM);
  //Exibe informacoes no serial
  Serial.print(cm);
  Serial.print(" cm\n");
  delay(100);
  if(cm < 30 && cm > 20){
    digitalWrite(7, HIGH);
    delay(600);
    digitalWrite(7, LOW);
  }

  if(cm < 15 && cm > 5){
    digitalWrite(7, HIGH);
    delay(300);
    digitalWrite(7, LOW);
  }

  if(cm <= 5){
    digitalWrite(7, HIGH);
    delay(10);
    digitalWrite(7, LOW);
  }
}
