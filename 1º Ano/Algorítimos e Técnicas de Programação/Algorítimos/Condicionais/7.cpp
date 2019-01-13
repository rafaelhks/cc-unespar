#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int a, b, c, area;
	
	printf("Valor A: ");
	scanf("%d", &a);
	printf("Valor B: ");
	scanf("%d", &b);
	printf("Valor C: ");
	scanf("%d", &c);
	
	if(a>(b+c) || b>(a+c) || c>(a+b))
	    printf("\nOs valores formam um triângulo\n\n");
	else
	    printf("\nOs valores NÃO formam um triângulo\n\n");
    
    system("pause");
    return(0);
}
