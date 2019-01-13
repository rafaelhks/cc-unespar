#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	int N1, N2, N3, ME;
	float MA, ID;
	
	printf("ID do aluno: ");
	scanf("%f", &ID);
	printf("Digite a Nota 1: ");
	scanf("%d", &N1);
	printf("Digite a Nota 2: ");
	scanf("%d", &N2);
	printf("Digite a Nota 3: ");
	scanf("%d", &N3);
	printf("Digite a média dos exercícios: ");
	scanf("%d", &ME);
	printf("\n\nNúmero do aluno: %0.f\n", ID);
	printf("\nNota 1: %d \nNota 2: %d \nNota 3: %d \nMédia dos exercícios: %d\n", N1, N2, N3, ME);
	
	
	MA = ((N1 + (N2 * 2)) + ((N3 * 3) + ME))/ 7;
	printf("\nA média de aproveitamento é: %0.f\n\n", MA);
	
	if(MA>9)
	    printf("Conceito A, aluno APROVADO\n\n");
	if(MA>=7.5 && MA<9)
	    printf("Conceito B, aluno APROVADO\n\n");
	if(MA>=6 && MA<7.5)
	    printf("Conceito C, aluno APROVADO\n\n");
	if(MA>=4 && MA<6)
	    printf("Conceito D, aluno REPROVADO\n\n");
	if(MA<4)
	    printf("Conceito E, aluno REPROVADO\n\n");
	system("pause");
	return(0);
}
