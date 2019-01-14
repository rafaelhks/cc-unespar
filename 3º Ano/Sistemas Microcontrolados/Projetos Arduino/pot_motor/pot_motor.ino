void setup() {
  Serial.begin(9600);
}

void loop() {
  int val = analogRead(0);
  Serial.println(val);
  int x = map(val, 0, 1023, 0, 255);
  analogWrite(5,x);
  delay(50);
}
