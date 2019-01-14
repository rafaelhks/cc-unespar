#include <stdio.h>
#include <stdlib.h>

int tam = 11;

int proxZero(int heap[]);
void insereHeapMax(int heap[], int valor);
void removeheapMax(int heap[], int valor);
void preencheHeap(int heap[]);
void printaHeap(int heap[]);

int proxZero(int heap[]){
    
    int i = 1; 

    for(i; i <= tam; i++)
        if(heap[i] == 0)
           return i;
}

void preencheHeap(int heap[]){

    int i = 0; 
    for(i; i<tam; i++)
            heap[i] = 0; 
                 
}

void insereHeapMax(int heap[], int valor){
     
    int prox_zero = proxZero(heap);		//proximo zero
    int pai = prox_zero / 2;			//indice do pai
    int vo;					
      
    if(pai == 0){
	    heap[prox_zero] = valor;
    }   
    else{
        if(valor > heap[pai]){
            heap[prox_zero] = heap[pai];
            heap[pai] = valor;
            vo = pai;
            while(vo != 1){               
                vo = pai/2;
                if(heap[pai] > heap[vo]){                   
    	            int aux = heap[vo];
                    heap[vo] = heap[pai];
                    heap[pai] = aux;
                }            
            }  
        }else
            heap[prox_zero] = valor;
    }        
}

void removeHeapMax(int heap[]){

	int i, j, maior;
	int heap2[tam];

	for(i = 0; i<tam; i++)
		heap2[i] = heap[i];
	for(i = 0; i <= tam; i++){
		if(heap[i] > maior)
			maior = heap[i];
	}
	for(i = 0; i <= tam; i++){
		if(heap[i] == maior){
			heap[i] = 0;
			break;
		}
	}

	heap2[i] = heap2[proxZero(heap)-1];
	heap2[proxZero(heap2)-1] = 0;
	preencheHeap(heap);

	for(j = 1; j < tam; j++){
		insereHeapMax(heap, heap2[j]);
	}

}

void printaHeap(int heap[]){
     
    int i = 1;
    printf("\n\n_____________________________\n\n");
    for(i; i<tam; i++)
        printf("Indice %d:\t%d\n", i, heap[i]);   
    printf("\n\n_____________________________\n\n");
    
}

int main(void){
    
    int heap[tam];
    int i = 0;
    int valor;
    
    preencheHeap(heap);
    printf("\tHeap Inicial");
    printaHeap(heap);
    
	while(i != 4){
		printf("Digite \n 1 para inserir \n 2 para excluir \n 3 para mostrar \n 4 para sair \n");
		scanf("%i", &i);
		if(i == 1){
			system("cls");
			printf("Digite o valor para inserir na arvore: ");
			scanf("%i", &valor);
			insereHeapMax(heap, valor);
			system("cls");
		}else if(i == 2){
			removeHeapMax(heap);
			system("cls");
		}else if(i == 3){
			system("cls");
			printaHeap(heap);
		}
	}
}
