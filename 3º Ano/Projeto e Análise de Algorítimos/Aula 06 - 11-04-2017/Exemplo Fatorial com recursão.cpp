#include <iostream>
using namespace std;

int main(void){
	int fatorial(int x);
	int numero, resultado;
	cout << "Digite um numero inteiro: ";
	cin >> numero;
	resultado=fatorial(numero);
	printf("O fatorial eh: %i", resultado);
	return 0;
}

int fatorial(int x){
	int resultado;
	if (x==0){
		resultado = 1;
	}else{
		resultado = x*fatorial(x-1);
	}
	return resultado;
}
