#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	float codigo, quant, total;
	
	printf("Digite o código do produto: ");
	scanf("%f", &codigo);
	printf("\nDigite a quantidade pedida: ");
	scanf("%f", &quant);
	
	if(codigo==100){
		printf("\nValor total do pedido: %.2f\n", total = quant*7.50);
	}
	else
	if(codigo==101){
		printf("\nValor total do pedido: %.2f\n", total = quant*5.50);
    }
    else
	if(codigo==103){
		printf("\nValor total do pedido: %.2f\n", total = quant*10.50);
    }
    else
	if(codigo==104){
		printf("\nValor total do pedido: %.2f\n", total = quant*11.00);
    }
    else
	if(codigo==105){
		printf("\nValor total do pedido: %.2f\n", total = quant*13.50);
    }
    else
	if(codigo==106){
		printf("\nValor total do pedido: %.2f\n", total = quant*3.50);
    }
    else
	if(codigo<100 || codigo>106 || codigo==102){
		printf("\nProduto não encontrado.\n");
    }
    system("pause");
}
