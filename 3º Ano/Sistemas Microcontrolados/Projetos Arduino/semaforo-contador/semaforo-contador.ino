int n = 9;

void setup() {
  //Portas do Display
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);

  //Portas do semaforo
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
}

void display7(int l1, int l2, int l3, int l4, int l5, int l6, int l7){
    digitalWrite(4, l1);
    digitalWrite(5, l2);
    digitalWrite(6, l3);
    digitalWrite(7, l4);
    digitalWrite(8, l5);
    digitalWrite(9, l6);
    digitalWrite(10, l7);
}

void semaforo(int r, int y, int g){
    digitalWrite(11, r);
    digitalWrite(12, y);
    digitalWrite(13, g);
}

void loop() {
   if(n==0){  
      display7(1,1,1,1,1,1,0);  
      semaforo(0,0,1); 
      delay(500);         
   }
   if(n==1){  display7(0,1,1,0,0,0,0);  }
   if(n==2){  display7(1,1,0,1,1,0,1);  } 
   if(n==3){  
    display7(1,1,1,1,0,0,1);  
    semaforo(0,1,0);          
   }
   if(n==4){  display7(0,1,1,0,0,1,1);  }
   if(n==5){  display7(1,0,1,1,0,1,1);  }
   if(n==6){  display7(1,0,1,1,1,1,1);  }
   if(n==7){  display7(1,1,1,0,0,0,0);  }
   if(n==8){  display7(1,1,1,1,1,1,1);  }
   if(n==9){
      display7(1,1,1,1,0,1,1);  
      semaforo(1,0,0);
   }
   n--;
   delay(500);
   if(n<0) n = 9;
}
