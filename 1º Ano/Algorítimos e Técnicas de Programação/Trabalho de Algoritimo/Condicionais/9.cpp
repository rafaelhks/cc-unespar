#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	float preco, npreco;
	
	printf("Preço do produto: R$");
	scanf("%f", &preco);
	
	if(preco<=50){
        npreco = preco + ((preco/100) * 15);
        printf("\nNovo preço: R$%.2f\n", npreco);}
    else
        if(preco > 50 && preco <= 100){
            npreco = preco + ((preco/100) * 10);
            printf("\nNovo preço: R$%.2f\n", npreco);}
        else
            if(preco>100){
                npreco = preco + ((preco/100) * 5);
                printf("\nNovo preço: R$%.2f\n", npreco);}
    
    if(npreco<=80)
        printf("\nBarato\n");
        else
            if(npreco>80 && npreco<=120)
                printf("\nNorma\n");
            else
                if(npreco>120 && npreco<=200)
                    printf("\nCaro\n");
                else
                    if(npreco>200)
                        printf("\nMuito Caro\n");
   system("pause");
   return(0);
}
