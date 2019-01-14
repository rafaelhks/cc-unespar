int n = 0;

void setup() {
  pinMode(7, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(1, OUTPUT);
}

void acendeLeds(int l1, int l2, int l3, int l4, int l5, int l6, int l7){
    digitalWrite(1, l1);
    digitalWrite(2, l2);
    digitalWrite(3, l3);
    digitalWrite(4, l4);
    digitalWrite(5, l5);
    digitalWrite(6, l6);
    digitalWrite(7, l7);
}

void loop() {
   if(n==0)  acendeLeds(1,1,1,1,1,1,0);
   if(n==1)  acendeLeds(0,1,1,0,0,0,0);
   if(n==2)  acendeLeds(1,1,0,1,1,0,1);
   if(n==3)  acendeLeds(1,1,1,1,0,0,1);
   if(n==4)  acendeLeds(0,1,1,0,0,1,1);
   if(n==5)  acendeLeds(1,0,1,1,0,1,1);
   if(n==6)  acendeLeds(1,0,1,1,1,1,1);
   if(n==7)  acendeLeds(1,1,1,0,0,0,0);
   if(n==8)  acendeLeds(1,1,1,1,1,1,1);
   if(n==9)  acendeLeds(1,1,1,1,0,1,1);
   n++;
   delay(300);
   if(n>=10) n = 0;
}
