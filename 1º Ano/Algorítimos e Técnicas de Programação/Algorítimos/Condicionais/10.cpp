#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	float a, b, c, X1, X2;
	int Delta;
	
	printf("Digite o valor de A: ");
	scanf("%f", &a);
	printf("Digite o valor de B: ");
	scanf("%f", &b);
	printf("Digite o valor de C: ");
	scanf("%f", &c);
	
	Delta = pow(b, 2) * (4*a*c);
	
	if(Delta>0)
	{
		X1 = (-b + sqrt(Delta)) / (2 * a);
		printf("\nR1 = %.1f\n", X1);
		X2 = (-b - sqrt(Delta)) / (2 * a);
		printf("\nR2 = %.1f\n\n", X2);
	}else 
	    if(Delta = 0)
		{
	        X1 = ((-b) + sqrt(Delta)) / (2 * a);
	        printf("\nR1 = %.1f\n\n", X1);
		}else
	        if(Delta<0)
	           printf("Essa equação não possui raízes reais.");
    
    system("pause");	 
}
