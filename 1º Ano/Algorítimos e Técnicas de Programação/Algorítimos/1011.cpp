#include <stdio.h>
#include <math.h>
#define valor_de_PI 3.14159

int main() 
{
	double volume;
	int raio;
	
	scanf("%d", &raio);
	
	volume = (4/3.0) * valor_de_PI * pow(raio, 3);
	
	printf("VOLUME = %.3lf\n", volume);
}
