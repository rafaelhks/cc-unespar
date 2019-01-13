#include <stdio.h>
#include <stdlib.h>

int main()
{
	int C, F;
	
	printf("Temperatura em Celsius: ");
	scanf("%d", &C);
	
    F = (C * 1.8) + 32;
	
	printf("Temperatura em Fahrenheit: %d \n", F);
	system("pause");
	
}
