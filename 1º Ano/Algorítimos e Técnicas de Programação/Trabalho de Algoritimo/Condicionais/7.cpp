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
	    printf("\nOs valores formam um tri�ngulo\n\n");
	else
	    printf("\nOs valores N�O formam um tri�ngulo\n\n");
    
    system("pause");
    return(0);
}
