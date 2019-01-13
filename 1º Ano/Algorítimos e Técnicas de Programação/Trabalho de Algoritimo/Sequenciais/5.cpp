#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    float r, areac;
    
    printf("Raio: ");
    scanf("%f", &r);
    
    areac = M_PI * (r*r);
    
    printf("Area do círculo: %f \n", areac);
    system("pause");
    
}

