#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int idade, cat;
	
	printf("Digite sua idade: ");
	scanf("%d", &idade);
	
	if (idade>=5 && idade<=7)
	    printf("\nVoc� pertence � categoria: Infantil A = 5-7 anos \n\n");
	if (idade>=8 && idade<=10)
	    printf("\nVoc� pertence � categoria: Infantil B = 8-10 anos \n\n");
	if (idade>=11 && idade<=13)
	    printf("\nVoc� pertence � categoria: Juvenil A = 11-13 anos \n\n");
	if (idade>=14 && idade<=17)
	    printf("\nVoc� pertence � categoria: Juvenil B = 14-17 anos \n\n"); 
	if (idade>=18)
	    printf("\nVoc� pertence � categoria: Adulto = Maiores de 18 anos \n\n"); 
    system("pause");
	return(0);     
}
	
