#include <stdio.h>
#include <stdlib.h>

int main()

{
	int AnoN, AnoA, IdadeAnos, IdadeMeses, IdadeSemanas, IdadeDias;
	
	printf("Escreva o ano do seu nascimento: ");
	scanf("%d", &AnoN);
	printf("Escreva o ano atual: ");
	scanf("%d", &AnoA);
	
	IdadeAnos = AnoA - AnoN; //Idade em anos
	IdadeMeses = (AnoA - AnoN) * 12; //Idade em meses
	IdadeSemanas = (365 / 7) * (AnoA - AnoN); //Idade em semanas
	IdadeDias = (AnoA - AnoN) * 365; //Descartando os anos bissextos
	
	printf("Idade em anos: %d \n", IdadeAnos);
	printf("Idade em meses: %d \n", IdadeMeses);
	printf("Idade em semanas: %d \n", IdadeSemanas);
	printf("Idade em dias: %d \n", IdadeDias);
	system("pause");
}
