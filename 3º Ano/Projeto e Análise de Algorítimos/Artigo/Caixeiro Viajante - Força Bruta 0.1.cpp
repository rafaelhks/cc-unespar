#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;
int N = 4;
int c = 0, custo = 9999, conta = 0;

int grafo[4][4] = { {0, 10, 15, 1},
                	{10, 0, 35, 25},
                	{15, 35, 0, 30},
                	{1, 25, 30, 0}
                  };

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
    int i, j;
    int a[N] = {0, 1, 2, 3};
    permuta(a, 0, 3);
	cout<<"Caixeiro Viajante - Forca Bruta"<<endl; 

	cout<<"\n\tGrafo de Distancias:"<<endl;
	
	for(i=0; i<N; i++){
		cout<<"\tCidade "<<i<<": ";
		for(j=0; j<N; j++){
			cout<<grafo[i][j]<<",";
		}
		cout<<endl;
	}

    cout<<"\nCusto minimo: "<<custo<<endl;
	return 0;
}
