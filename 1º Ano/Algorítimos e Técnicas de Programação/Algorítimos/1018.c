#include <stdio.h>

int main()
{
	int valor;
	int cem , cinquenta, vinte, dez, cinco, dois, um;
	
	scanf("%d", &valor);

    cem = valor / 100;
    valor = valor - (cem *100);

    cinquenta = valor / 50;
    valor = valor - (cinquenta * 50);

    vinte = valor / 20;
    valor = valor - (vinte * 20);

    dez = valor /10;
    valor = valor -(dez * 10);

    cinco = valor / 5;
    valor = valor - (cinco * 5);

    dois = valor / 2;
    valor = valor - (dois * 2);
    
    um = valor / 1;
    valor = valor - (um * 1);
    
    printf("%d nota(s) de R$ 100,00\n", cem);
    printf("%d nota(s) de R$ 50,00\n", cinquenta);
    printf("%d nota(s) de R$ 20,00\n", vinte);
    printf("%d nota(s) de R$ 10,00\n", dez);
    printf("%d nota(s) de R$ 5,00\n", cinco);
    printf("%d nota(s) de R$ 2,00\n", dois);
    printf("%d nota(s) de R$ 1,00\n", um);

}
