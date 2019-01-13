#include <stdio.h>
#include <stdlib.h>

int main() 
{
	float nh, vh, salary;
	int n, number;
	
	scanf("%d", &n);
	scanf("%f", &nh);
	scanf("%f", &vh);
	
	number = n;
	salary = nh*vh;
	
	printf("NUMBER = %d\n", number);
	printf("SALARY = U$ %.2f\n", salary);
    system("pause");
}
