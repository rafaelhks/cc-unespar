#include <stdio.h>
#include <stdlib.h> 

int main()
{
    int i = 0, S = 0, x;
    
    while(i<15)
    {
               scanf("%d", &x);
               if (x%2==0){                        
               S = S+x;}
               i++;
    }
    printf("Somatorio: %d\n", S);
    system("pause");
    return(0);
}
