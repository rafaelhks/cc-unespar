#include <stdio.h>
#include <stdlib.h>

int main()
{
    float preco, preco2;
    float desconto = 10;
    
    printf("Preco Inicial: ");
    scanf("%f", &preco);
    
    preco2 = preco - ((preco / 100) * desconto);
    
    printf("Novo Preco: %2.f \n", preco2);
    system("pause");
    
}
    
