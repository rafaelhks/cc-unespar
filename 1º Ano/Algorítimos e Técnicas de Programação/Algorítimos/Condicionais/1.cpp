#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
	setlocale(LC_ALL, "Portuguese");
	int senha;
	
	printf("Digite a senha: ");
	scanf("%d", &senha);
	if (senha == 489761){
		system("color 02");
	    printf("-------------------------------------------------------------------------------\n");
		printf("'O importante � ganhar. Tudo e sempre. Essa hist�ria de que o importante � \ncompetir n�o passa de pura demagogia. [...] No que diz respeito ao empenho, ao \ncompromisso, ao esfor�o, � dedica��o, n�o existe meio termo. Ou voc� faz uma \ncoisa bem feita ou n�o faz.' - Ayrton Senna\n");
	    printf("-------------------------------------------------------------------------------\n");
	}else
	    printf("\nSenha de acesso incorreta.\n\n");    
    system("pause");
    return(0);
}

