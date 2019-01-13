#include <stdio.h> 
#include <stdlib.h>

int main()
{
    int n1, n2, p1 = 2, p2 = 3, mp;
    
    scanf("%d %d", &n1, &n2);
    
    mp = (((n1 * p1) + (n2 * p2)) / (p1 + p2));
    
    printf("Media Ponderada: %d \n", mp);
    system("pause");
    
}
