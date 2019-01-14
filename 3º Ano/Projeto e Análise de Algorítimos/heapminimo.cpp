#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <conio.h>
using namespace std;

//RAFAEL FRANCISCO FERREIRA - 3º ANO C.C. UNESPAR

//OBS: codigos de algumas funções foram feitos em grupo

int tam = 11;

void insere(int heap[], int valor);
void remove(int heap[], int valor);
void printa(int heap[]);
int proxZero(int heap[]);
void preencheHeap(int heap[]);

int proxZero(int heap[]){
    
    int i = 1; 

    for(i; i <= tam; i++)
        if(heap[i] == 0)
           return i;
}

void insere(int heap[], int valor){
     
    int prox_zero = proxZero(heap);	
    int pai = prox_zero / 2; //indice do pai
    int vo;					
      
    if(pai == 0){
	    heap[prox_zero] = valor;
    }   
    else{
        if(valor < heap[pai]){
            heap[prox_zero] = heap[pai];
            heap[pai] = valor;
            vo = pai;
            while(vo != 1){               
                vo = pai/2;
                if(heap[pai] < heap[vo]){                   
    	            int aux = heap[vo];
                    heap[vo] = heap[pai];
                    heap[pai] = aux;
                }            
            }  
        }else
            heap[prox_zero] = valor;
    }        
}

void remove(int heap[]){

	int i, j, menor;
	int heap2[tam];

	for(i = 0; i<tam; i++)
		heap2[i] = heap[i];
	for(i = 0; i <= tam; i++){
		if(heap[i] < menor)
			menor = heap[i];
	}
	for(i = 0; i <= tam; i++){
		if(heap[i] == menor){
			heap[i] = 0;
			break;
		}
	}

	heap2[i] = heap2[proxZero(heap)-1];
	heap2[proxZero(heap2)-1] = 0;
	preencheHeap(heap);

	for(j = 1; j < tam; j++){
		insere(heap, heap2[j]);
	}

}

void preencheHeap(int heap[]){

    int i = 0; 
    for(i; i<tam; i++)
            heap[i] = 0; 
                 
}

void printa(int heap[]){
     
    int i = 1;
    cout<<"\n";
    for(i; i<tam; i++)
        cout<<"Posicao: "<<i<<" Valor: "<<heap[i]<<"\n";   
    cout<<"\n";
    
}
     

int main(void){
    
    int heap[tam];
    int i = 0, op;
    int valor;
    
    preencheHeap(heap);
    cout<<"HEAP MINIMO- Rafael Francisco Ferreira\n\n";
    
    do{
		cout<<"\n1. Inserir";
		cout<<"\n2. Remover elemento de maior prioridade";
		cout<<"\n3. Consultar";
		cout<<"\n4. Sair ";
		cout<<"\nDigite a opcao desejada: ";
		
		cin>>op;
		
		switch(op){
			case 1:
				system("CLS");
				printf("Digite o valor para inserir: ");
				cin>>valor;
				insere(heap, valor);
				system("CLS");
				cout<<"\nElemento inserido com sucesso!\n";
				break;
			case 2:
				system("CLS");
				remove(heap);
				cout<<"\nElemento de menor prioridade removido com sucesso!\n";
				break;
			case 3:
				system("CLS");
				printa(heap);
				break;
			case 4:
				system("CLS");
				cout<<"Saindo...\n";
				return 0;
				break;
			default:
				cout<<"\nOpcao invalida!";
		}
	}while(op!=4);
}

