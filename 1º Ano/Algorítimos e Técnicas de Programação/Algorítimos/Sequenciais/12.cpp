#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
      int x1, y1, x2, y2, D;

      printf("Digite o X do primeiro ponto: ");
      scanf("%d", &x1);
      printf("Digite o Y do primeiro ponto: ");
      scanf("%d", &y1);
      printf("Digite o X do segundo ponto: ");
      scanf("%d", &x2);
      printf("Digite o Y do segundo ponto: ");
      scanf("%d", &y2);

      D = sqrt( pow((x2 - x1), 2) ) + ( pow((y2 - y1), 2) );

      printf("\nDistancia entre os pontos no Plano Cartesiano: %d \n\n", D);
      system("pause");

}

