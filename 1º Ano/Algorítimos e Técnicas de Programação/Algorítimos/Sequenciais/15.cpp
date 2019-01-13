#include <stdio.h>
#include <stdlib.h>

int main()
{
	float valor, cem, cinquenta, vinte, dez, cinco, dois, um;
	float cinquentaC, vintecincoC, dezC, cincoC, umC;
	
	printf("Digite o valor em R$: ");
	scanf("%f", &valor);
	
	cem = valor / 100;
	cinquenta = valor / 50;
	vinte = valor / 20;
	dez = valor / 10;
	cinco = valor / 5;
	dois = valor / 2;
	um = valor / 1.00;
	cinquentaC = valor / 0.50;
	vintecincoC = valor / 0.25;
	dezC = valor / 0.10;
	cincoC = valor / 0.05;
	umC = valor / 0.01;
		
	printf("\n%.0f nota(s) de R$ 100,00 \n", cem);
	printf("%.0f nota(s) de R$ 50,00 \n", cinquenta);
	printf("%.0f nota(s) de R$ 20,00 \n", vinte);
	printf("%.0f nota(s) de R$ 10,00 \n", dez);
	printf("%.0f nota(s) de R$ 5,00 \n", cinco);
	printf("%.0f nota(s) de R$ 2,00 \n", dois);
	printf("%.0f moeda(s) de R$ 1,00 \n", um);
	printf("%.0f moeda(s) de R$ 0,50 \n", cinquentaC);
	printf("%.0f moeda(s) de R$ 0,25 \n", vintecincoC);
	printf("%.0f moeda(s) de R$ 0,10 \n", dezC);
	printf("%.0f moeda(s) de R$ 0,05 \n", cincoC);
	printf("%.0f moeda(s) de R$ 0,01 \n\n", umC);
    system("pause");
}
	
