#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int a, b, resto;
	
	printf("Digite um n�mero qualquer: ");
	scanf("%d", &a);
	printf("Digite um n�mero qualquer: ");
	scanf("%d", &b);
	
	resto = a % b;
	
	if (resto == 0)
	   printf("\nS�o m�ltiplos\n\n");
	else
	   printf("\nN�o s�o m�ltiplos\n\n");
	   
	system("pause");
	
}
