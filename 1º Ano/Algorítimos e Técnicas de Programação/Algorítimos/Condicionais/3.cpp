#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	float salario, nsalario, cargo, gerente, engenheiro, tecnico, outros, diferenca;
	
	printf("Digite seu salário atual: R$");
	scanf("%f", &salario);
	printf ("Digite o número referente ao seu cargo e tecle enter:\n\n");
    printf ("1. Gerente\n");
	printf ("2. Engenheiro\n");
	printf ("3. Técnico\n");
	printf ("4. Outros\n");
	printf("\nNúmero escolhido: ");
	scanf("%f", &cargo);
	getchar ();
	
	
	if(cargo==1){
	    printf("\nVocê recebeu um aumento de 10 porcento. \n\nSeu novo salário será: R$%.2f\n\n", nsalario = (((salario / 100) * 10) + salario));
	}
	else	
	if(cargo==2){
        printf("\nVocê recebeu um aumento de 20 porcento. \n\nSeu novo salário será: R$%.2f\n\n", nsalario = (((salario / 100) * 20) + salario));
	}
	else
    if(cargo==3){
        printf("\nVocê recebeu um aumento de 30 porcento. \n\nSeu novo salário será: R$%.2f\n\n", nsalario = (((salario / 100) * 30) + salario));
	}
	else
    if(cargo==4){
        printf("\nVocê recebeu um aumento de 40 porcento. \n\nSeu novo salário será: R$%.2f\n\n", nsalario = (((salario / 100) * 40) + salario));
	}
	system("pause");
   	            
   return(0);                                                                       
}

