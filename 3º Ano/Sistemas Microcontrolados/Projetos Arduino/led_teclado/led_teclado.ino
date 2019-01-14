void setup() {
  Serial.begin(9600);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
}

void loop() {
  int x = Serial.available();
  if(x>0){
    char c = Serial.read();
    if(c=='1') digitalWrite(13,HIGH);
    if(c=='2') digitalWrite(12,HIGH);
    if(c=='3') digitalWrite(11,HIGH);
    if(c=='A') digitalWrite(13,LOW);
    if(c=='B') digitalWrite(12,LOW);
    if(c=='C') digitalWrite(11,LOW);
  }
}
