#include <iostream>
#include <conio.h>
using namespace std;
void divide(int vetor[], int inicio, int fim, int meio); //Método que divide o vetor
void mergeSort (int X[], int inicio, int fim); //Método que define o meio e chama as funções em ordem
void imprimeMS(int * X, int tam ); //Método que imprime os passos da ordenação
  
//RAFAEL FRANCISCO FERREIRA - ANAL. E PROJ. DE SISTEMAS - 3º ANO CIÊNCIA DA COMPUTAÇÃO  
//UNESPAR

//IMPLEMENTAÇÃO DE MERGE SORT

int main()  
{  
    int vetor [] = {11,4,5,3,1,2,8,6,0,9};
    //Imprime o vetor inicial
    cout<<"{ ";
	for (int i = 0; i < 10; ++i){  
        cout <<vetor[i] << ", ";  
    }  
    cout<<"}";
    cout << "\n";  
    //chama a função mergeSort
    mergeSort (vetor, 0 ,9);  
    return 0;  
}  

void divide(int vetor[], int inicio, int fim, int meio){  
    int posLivre,inicioVetor1, inicioVetor2, i;  
    int aux[10];  //auxiliar
    inicioVetor1 = inicio;  
    inicioVetor2 = meio+1;  
    posLivre = inicio;  
    while(inicioVetor1 <= meio && inicioVetor2 <= fim){  
        if (vetor[inicioVetor1] <= vetor[inicioVetor2]){  
            aux[posLivre] = vetor[inicioVetor1];  
            inicioVetor1++;  
        }  
        else{  
            aux[posLivre] = vetor[inicioVetor2];  
            inicioVetor2++;  
        }  
        posLivre++;  
    }  
    //Se ainda existem numeros no primeiro vetor que nao foram intercalados  
    for (int i = inicioVetor1; i <= meio; ++i){  
        aux[posLivre] = vetor[i];  
        posLivre++;  
    }  
    //se ainda existem numeros no segundo vetor que nao foram intercalados  
    for (int i = inicioVetor2; i <= fim; ++i){  
        aux[posLivre] = vetor[i];  
        posLivre++;  
    }  
    //retorne os valores do vetor aux para o vetor X  
    for (int i = inicio; i <=fim; ++i)  
    {  
        vetor[i] = aux[i];  
	}
}  
void mergeSort (int vetor[], int inicio, int fim){  
    int meio;  
    if (inicio < fim) {  
        meio = (inicio+fim)/2;  
        mergeSort (vetor,inicio, meio);  
        mergeSort (vetor,meio+1, fim);  
        divide(vetor,inicio, fim, meio);  
        imprimeMS(vetor,10);  
    }  
} 

void imprimeMS(int * vetor, int tam ){  
    cout<<"{ ";
    for (int i = 0; i < tam; ++i){  
       cout <<vetor[i] << ", ";  
    }
    cout<<"}";
    cout << "\n";  
 }  
 
 
