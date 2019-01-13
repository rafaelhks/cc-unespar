#include <stdio.h>
#include <stdlib.h>

int main() 
{
    char nome;
	double salario, vendas, porc;
	
	scanf("%s", &nome);
	scanf("%lf %lf", &salario, &vendas);
	
	porc = (vendas/100*15) + salario;
	
	printf("TOTAL = R$ %.2f\n", porc);
	
}
