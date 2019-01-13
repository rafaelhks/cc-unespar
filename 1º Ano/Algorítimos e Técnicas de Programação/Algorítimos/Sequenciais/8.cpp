#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()

{
	float A, B, C, D;
	
	printf("Valor A: ");
	scanf("%f", &A);
	printf("Valor B: ");
	scanf("%f", &B);
	printf("Valor C: ");
	scanf("%f", &C);
	
	D =( pow((A+B), 2) + pow((B+C), 2) ) / 2;
	
	printf("\nD = %0.f \n\n", D);
	system("pause");
	
}
