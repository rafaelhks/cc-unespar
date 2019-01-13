#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	float raio, esferaC, esferaA, esferaV;
	
	printf("Digite o raio da esfera: ");
	scanf("%f", &raio);
	
	esferaC = (2 * M_PI) * raio;
	esferaA = (M_PI * raio) * (M_PI * raio);
	esferaV = (4 / 3) * ((M_PI * raio) * (M_PI * raio) * (M_PI * raio));
	
	printf("Comprimento da esfera C: %2.f \n", esferaC);
	printf("Area do circulo da esfera A: %2.f \n", esferaA);
	printf("Volume da esfera V: %2.f \n", esferaV);
	system("pause");
}
