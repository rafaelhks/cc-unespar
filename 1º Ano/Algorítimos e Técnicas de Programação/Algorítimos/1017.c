#include <stdio.h>

int main()
{
	float consumo = 12, tempo, velocidade, litros, distancia;
	
	scanf("%f %f", &tempo, &velocidade);
	
	distancia = tempo * velocidade;
	litros = distancia/12;
	
	printf("%.3f\n", litros);
}
