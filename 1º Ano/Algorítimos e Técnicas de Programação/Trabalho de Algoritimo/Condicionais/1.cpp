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
		printf("'O importante é ganhar. Tudo e sempre. Essa história de que o importante é \ncompetir não passa de pura demagogia. [...] No que diz respeito ao empenho, ao \ncompromisso, ao esforço, à dedicação, não existe meio termo. Ou você faz uma \ncoisa bem feita ou não faz.' - Ayrton Senna\n");
	    printf("-------------------------------------------------------------------------------\n");
	}else
	    printf("\nSenha de acesso incorreta.\n\n");    
    system("pause");
    return(0);
}

