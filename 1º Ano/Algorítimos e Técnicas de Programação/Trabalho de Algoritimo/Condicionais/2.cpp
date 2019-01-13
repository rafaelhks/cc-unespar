#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int a, b, resto;
	
	printf("Digite um número qualquer: ");
	scanf("%d", &a);
	printf("Digite um número qualquer: ");
	scanf("%d", &b);
	
	resto = a % b;
	
	if (resto == 0)
	   printf("\nSão múltiplos\n\n");
	else
	   printf("\nNão são múltiplos\n\n");
	   
	system("pause");
	
}
