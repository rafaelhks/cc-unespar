#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<iostream>
#include<time.h>
#define N 5 //NUMERO DE CIDADES (Mudar para testes)
using namespace std;
int c = 0, custo = 9999, conta = 0;
int cidades[N] = {0,1,2,3,4};
int grafo[N][N];

void troca (int *x, int *y){
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

void copia_array(int *a, int n){

    int i, soma = 0;
    for(i = 0; i <= n; i++){
        soma += grafo[a[i % N]][a[(i + 1) % N]];
    }

    if (custo > soma){
        custo = soma;
    }
}  

void permuta(int *a, int i, int n) {
    int j, k; 
    if (i == n){
        copia_array(a, n);
    }else{
        for (j = i; j <= n; j++){
            troca((a + i), (a + j));
            permuta(a, i + 1, n);
            troca((a + i), (a + j));
        }
    }
} 

int main(){
	srand (time(NULL));
    int i, j;
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
        	if(i == j) grafo[i][j] == 0;
			else grafo[i][j] = (rand()% 10+1);
        }
    }
    permuta(cidades, 0, N-1);
	/*cout<<"Caixeiro Viajante - Forca Bruta"<<endl; 

	cout<<"\n\tGrafo de Distancias:"<<endl;
	
	for(i=0; i<N; i++){
		cout<<"\tCidade "<<i<<": ";
		for(j=0; j<N; j++){
			cout<<grafo[i][j]<<",";
		}
		cout<<endl;
	}

    cout<<"\nCusto minimo: "<<custo<<endl;*/
	return 0;
}
