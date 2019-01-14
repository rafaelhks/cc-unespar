#include <Servo.h>
#include <Ultrasonic.h>
Servo servo;

void setup() {
  servo.attach(7);
}

void loop() {
  servo.write(0);
  servo.write(179);
}
