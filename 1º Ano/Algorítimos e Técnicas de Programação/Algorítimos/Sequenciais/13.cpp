#include <stdio.h>
#include <stdlib.h>

int main()
{
	double custofabrica, pdistribuidor, impostos, custoconsumidor, total;
	
	printf("Digite o custo de fabrica do automovel: ");
	scanf("%f", &custofabrica);
	
	pdistribuidor = (custofabrica / 100) * 28; //porcentagem
	impostos = (custofabrica / 100) * 45; //porcentagem
	total = custofabrica + pdistribuidor + impostos; //soma total
	
	printf("\nCusto ao consumidor: %d \n", total);
	system("pause");
	
}


