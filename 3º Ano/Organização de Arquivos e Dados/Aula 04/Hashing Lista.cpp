#include <iostream>
#include <conio.h>
using namespace std;
const int tam = 8;
struct hash{
       int chave;
       hash* prox;
};
int funcao_hashing(int num){
    return num % tam;
}
void mostrar_hash(hash* tabela[]){
     hash* aux;
     for(int i=0; i<tam;i++){
             aux = tabela[i];
             while (aux != NULL){
                   cout<<"\nEntrada " << i << ": " << aux -> chave;
                   aux = aux -> prox;
             }
     }
}
void inserir(hash* tabela[], int pos, int n){
     hash* novo;
     novo = new hash();
     novo -> chave = n;
     novo -> prox = tabela[pos];
     tabela[pos] = novo;
}
void excluir_hash(hash* tabela[], int num){
    int pos = funcao_hashing(num);
    hash* aux;
    if (tabela[pos] != NULL){
        if (tabela[pos] -> chave == num){
            aux = tabela[pos];
            tabela[pos] = tabela[pos]->prox;
            delete aux;
        }else{
            aux = tabela[pos->prox;
            hash* ant = tabela[pos];
            while(aux != NULL){
                    ant = aux;
                    aux = aux -> prox;
            }
            if (aux != NULL){
                    ant -> prox = aux -> prox;
                    delete aux;
            }else{
                cout << "\nNumero nao encontrado.";
            }
        }
    }else{
        cout << "\nNumero nao encontrado.";
        }

main(){
        hash* tabela[tam];
        hash* aux;
        int op, pos;
        int num, i;
        //Inicialização da tabela
        for (i=0; i<tam; i++){
           tabela[i] = NULL;
			do{
				cout << "\nMENU DE OPCOES\n";
				cout << "\n1 - Inserir elemento";
				cout << "\n2 - Mostrar tabela hashing";
				cout << "\n3 - Excluir elemento";
				cout << "\n4 - Sair";
				cout << "\nDigite sua opcao: ";
				cin >> op;
				if (op < 1 || op > 4){
					cout << "\nOpcao invalida.";
				}else{
					switch(op){
						case 1:
							cout << "\nDigite um numero: ";
							cin >> num;
							pos = funcao_hashing(num);
							inserir(tabela, pos, num);
							break;
						case 2:
							mostrar_hash(tabela);
							getch();
							break;
						case 3:
							cout << "\nDigite um numero: ";
							cin >> num;
							excluir_hash(tabela, num);
							break;
					}				
				}
				getch();
			}while (op!=4)
		}
}
        
        
              


