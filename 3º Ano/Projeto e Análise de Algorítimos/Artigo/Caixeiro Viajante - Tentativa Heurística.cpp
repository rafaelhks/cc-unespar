#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<conio.h>
#include<algorithm>
#include<iostream>
#define N 5 //NUMERO DE CIDADES (Mudar para testes)
using namespace std;
int custo, v=0, menor = 9999999;
int cidades[N];
int inicial = cidades[0];
string visitados = "", rota;

int grafo[N][N];

void menorVizinho(int cAtual){
	int prox = cAtual;

    for(int i=0; i<N; i++){
        if(grafo[cAtual][i] != 0 && !(visitados.find(i) != std::string::npos) && grafo[cAtual][i] < menor){
            menor = grafo[cAtual][i];
            visitados+=cAtual;
            prox = i;
        }
	}
    custo+=menor;
    menor = 9999999;
    v++;
	if(v < N){
        //cout<<prox<<"-->";
        menorVizinho(prox);
	}else{
        custo+=grafo[cAtual][0];
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

	//cout<<"Rota = "<<inicial<<"-->";
	menorVizinho(0);
	custo -= 9999999;
	/*cout<<inicial<<endl;

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
