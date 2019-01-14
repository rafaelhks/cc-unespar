void setup() {
  Serial.begin(9600);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
}

void loop() {
  int val;
  val = map(analogRead(0), 0, 1023, 0, 6);
  Serial.println(val);
  if(val>=1) digitalWrite(13,HIGH);
  else digitalWrite(13, LOW);
  if(val>=3) digitalWrite(12,HIGH);
  else digitalWrite(12, LOW);
  if(val>=5) digitalWrite(11,HIGH);
  else digitalWrite(11, LOW);
  delay(100);
}
