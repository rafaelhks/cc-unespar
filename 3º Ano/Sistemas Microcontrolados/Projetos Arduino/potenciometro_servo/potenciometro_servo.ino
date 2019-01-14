#include <Servo.h>

Servo servo;

void setup() {
  Serial.begin(9600);
  servo.attach(11);
}

void loop() {
  int angulo;
  for(angulo = 0; angulo<180; angulo++)
    servo.write(angulo);
  delay(1000);
  for(angulo = 180; angulo>=1; angulo-=5)
    servo.write(angulo);
  delay(1000);
}
