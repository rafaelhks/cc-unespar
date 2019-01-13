#include <stdio.h>
#include <string.h>

int main() 
{
	char COD1, COD2;
	float NP1, NP2, VU1, VU2, total;
	
	scanf("%s %d/t %.2f/t", &COD1, &NP1, &VU1);
	scanf("%s %d/t %.2f/t", &COD2, &NP2, &VU2);
	
	total = VU1*NP1+VU2*NP2;
	
	printf("VALOR A PAGAR: R$ %.2f\n", total);

}
