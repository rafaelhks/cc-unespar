#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<iostream>
#include<time.h>
#define N 13 //NUMERO DE CIDADES (Mudar para testes)
using namespace std;
int c = 0, custo = 9999999, custo2, conta = 0, menor = 9999999, v=0;
int cidades[N] = {0,1,2,3, 4,5,6,7,8,9,10,11};
string visitados = "";
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

void menorVizinho(int cAtual){
	int prox = cAtual;

    for(int i=0; i<N; i++){
        if(grafo[cAtual][i] != 0 && !(visitados.find(i) != std::string::npos) && grafo[cAtual][i] < menor){
            menor = grafo[cAtual][i];
            visitados+=cAtual;
            prox = i;
        }
	}
    custo2+=menor;
    menor = 9999999;
    v++;
	if(v < N){
        //cout<<prox<<"-->";
        menorVizinho(prox);
	}else{
        custo2+=grafo[cAtual][0];
    }
}

int main(){
	srand (time(NULL));
    int i, j;
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
        	if(i == j) grafo[i][j] == 0;
			else grafo[i][j] = (rand()% 100000+1);
        }
    }
    permuta(cidades, 0, N-1);
	menorVizinho(0);
	custo2 -= 9999999;
    cout<<"\nCusto minimo FB: "<<custo<<endl;
    cout<<"\nCusto minimo VP: "<<custo2<<endl;
	return 0;
}
