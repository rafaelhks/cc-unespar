#include <stdio.h>
#include <stdlib.h>
#define pi 3.14159

int main()
{
    float r, areac;
    
    printf("Raio: ");
    scanf("%f", &r);
    
    areac = pi * (r*r);
    
    printf("Area do c�rculo: %f \n", areac);
    system("pause");
    
}

