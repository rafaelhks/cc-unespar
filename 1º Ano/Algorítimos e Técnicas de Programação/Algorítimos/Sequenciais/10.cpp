#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

int main()

{
	setlocale(LC_ALL, "Portuguese");
	int a, b, c, M1, M;
	
	printf("Valor A: ");
	scanf("%d", &a);
	printf("Valor B: ");
	scanf("%d", &b);
	printf("Valor C: ");
	scanf("%d", &c);
	printf("\nA: %d B: %d C: %d \n", a, b, c);
	
	M1 = (a + b + abs(a - b)) / 2;
	M = (M1 + c + abs(M1 - c)) / 2;
	
	printf("\n%d é o maior. \n \n", M);
	system("pause");
}

