#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	float salario, nsalario, cargo, gerente, engenheiro, tecnico, outros, diferenca;
	
	printf("Digite seu sal�rio atual: R$");
	scanf("%f", &salario);
	printf ("Digite o n�mero referente ao seu cargo e tecle enter:\n\n");
    printf ("1. Gerente\n");
	printf ("2. Engenheiro\n");
	printf ("3. T�cnico\n");
	printf ("4. Outros\n");
	printf("\nN�mero escolhido: ");
	scanf("%f", &cargo);
	getchar ();
	
	
	if(cargo==1){
	    printf("\nVoc� recebeu um aumento de 10 porcento. \n\nSeu novo sal�rio ser�: R$%.2f\n\n", nsalario = (((salario / 100) * 10) + salario));
	}
	else	
	if(cargo==2){
        printf("\nVoc� recebeu um aumento de 20 porcento. \n\nSeu novo sal�rio ser�: R$%.2f\n\n", nsalario = (((salario / 100) * 20) + salario));
	}
	else
    if(cargo==3){
        printf("\nVoc� recebeu um aumento de 30 porcento. \n\nSeu novo sal�rio ser�: R$%.2f\n\n", nsalario = (((salario / 100) * 30) + salario));
	}
	else
    if(cargo==4){
        printf("\nVoc� recebeu um aumento de 40 porcento. \n\nSeu novo sal�rio ser�: R$%.2f\n\n", nsalario = (((salario / 100) * 40) + salario));
	}
	system("pause");
   	            
   return(0);                                                                       
}

