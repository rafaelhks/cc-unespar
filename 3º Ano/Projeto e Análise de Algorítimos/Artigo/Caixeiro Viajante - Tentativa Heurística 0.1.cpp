#include<stdio.h>
#include<conio.h>
#include <algorithm>
#include<iostream>
using namespace std;
int custo, v=0, menor = 9999;
int cidades[] = {0, 1, 2, 3};
int inicial = cidades[0];
string visitados = "";

int grafo[4][4] = { {0, 10, 15, 1},
                	{10, 0, 35, 25},
                	{15, 35, 0, 30},
                	{1, 25, 30, 0}
                  };

void menorVizinho(int cAtual){
	int prox = cAtual;
	             
    for(int i=0; i<4; i++){
        if(grafo[cAtual][i] != 0 && !(visitados.find(i) != std::string::npos) && grafo[cAtual][i] < menor){
            menor = grafo[cAtual][i];
            visitados+=cAtual;
            prox = i;
        }
	}	
    custo+=menor;
    menor = 9999;
    v++;
	if(v < 4){
        //cout<<prox<<"-->";
        menorVizinho(prox);
	}else{
        custo+=grafo[cAtual][0];
    }
}

int main(){
	//cout<<inicial<<"-->";
	menorVizinho(0);
	//custo -= 9999;
	//cout<<inicial;
    //cout<<"\nCusto minimo: "<<custo<<endl;
	return 0;
}
