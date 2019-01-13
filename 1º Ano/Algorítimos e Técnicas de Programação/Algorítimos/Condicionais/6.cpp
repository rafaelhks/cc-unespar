#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int a, b, c, d;
	
	printf("Digite o numero A: ");
	scanf("%d", &a);
	printf("Digite o numero B: ");
	scanf("%d", &b);
	printf("Digite o numero C: ");
	scanf("%d", &c);
	printf("Digite o numero D: ");
	scanf("%d", &d);
	
	if(b>c && d>a && (c+d)>(a+b) && c>0 && d>0 && a%2==0)
	    printf("\nValores aceitos\n\n");
	else
	    printf("\nValores não aceitos\n\n");
	
	system("pause");
	return(0);
}
	
