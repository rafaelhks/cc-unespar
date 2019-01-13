#include <stdio.h>
#include <stdlib.h>

int main()
{
   int nsegundos, horas, segphr = 3600, minutos, segundos;
   
   printf("Numero de segundos: ");
   scanf("%d", &nsegundos);
   
   horas = (nsegundos / segphr); //resultado da hora
   minutos = (nsegundos - (segphr * horas)) / 60;
   segundos = (nsegundos - (segphr * horas) - (minutos*60));
   
   printf("Total em Horas, minutos e segundos: %d:%d:%d \n", horas, minutos, segundos);
   system("pause");
   
   return 0;
}
