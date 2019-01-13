#include <stdio.h>
#include <stdlib.h>

int main()

{
	int D, d, AreaLosango;
	
	printf("Diagonal maior: ");
	scanf("%d", &D);
	printf("Diagonal menor: ");
	scanf("%d", &d);
	
	AreaLosango = (D*d) / 2;
	
	printf("Area do Losango: %d \n", AreaLosango);
	system("pause");
	
}
