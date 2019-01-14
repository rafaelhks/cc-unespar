void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
}

void loop() {
  int luz;
  luz = analogRead(5);
  Serial.println(luz);
  delay(500);
  if(luz < 200){
    digitalWrite(13, HIGH);
    delay(100);
    digitalWrite(13, LOW);
  }else if(luz > 200 && luz < 400){
    digitalWrite(12, HIGH);
    delay(100);
    digitalWrite(12, LOW);
  }else if(luz > 400){
    digitalWrite(11, HIGH);
    delay(100);
    digitalWrite(11, LOW);
  }
}
