#include <iostream>
#include <stdio.h>
#include <conio.h>

//Rafael Francisco Ferreira - 3º ano C.C. Unespar - Primeiro exercicio da prova bimestral de Organização de Arquivos e Dados

using namespace std;

const int tam = 100; //tamanho da tabela

struct hash
{
	int chave; //recebe o numero de 1 a 4 referente a letra do tipo
	string descricao; //Recebe a descrição do produto
	char livre; //L = livre, O = ocupado, R = Removido
};

int funcao_hashing(int num)
{
	return num % tam;
}

void inserir (hash tabela[], int pos, int n, string d)
{
	int k = 1;
	while (k < tam && tabela [pos].livre != 'L' && tabela[pos].livre != 'R')
		pos = (pos+k%tam);
		k = k +1;
		if (k<tam)
		{
			tabela[pos].chave = n;
			tabela[pos].descricao = d;
			tabela[pos].livre = 'O';
		}
		else
			cout << "\nTabela Cheia";
			
}

void mostrar_hash(hash tabela[], int n)
{
	for (int i= 0; i < tam; i++)
	{
		if(tabela[i].livre == 'O' && tabela[i].chave == n)
			cout << "\nProduto " << i << ": " << tabela[i].descricao;
	}
	cout<<"\n";
}

void contar(hash tabela[]){
	int qtdA = 0, qtdH = 0, qtdL = 0, qtdV = 0;
	for (int i= 0; i < tam; i++){ //incrementa as variaveis de quantidade de cada tipo para cada ocorrencia do numero correspondente na tabela
		if(tabela[i].livre == 'O' && tabela[i].chave == 1){
			qtdA++;
		}
		if(tabela[i].livre == 'O' && tabela[i].chave == 2){
			qtdH++;
		}
		if(tabela[i].livre == 'O' && tabela[i].chave == 3){
			qtdL++;
		}
		if(tabela[i].livre == 'O' && tabela[i].chave == 4){
			qtdV++;
		}
	}
	cout<<"\nQuantidade de produtos do tipo A: "<<qtdA;
	cout<<"\nQuantidade de produtos do tipo H: "<<qtdH;
	cout<<"\nQuantidade de produtos do tipo L: "<<qtdL;
	cout<<"\nQuantidade de produtos do tipo V: "<<qtdV;
	cout<<"\n";
}

int main()
{
	hash tabela[tam];
	
	int op, pos, num, i;
	char tipo;
	char desc[100];
	
	//inicialização da tabela
	for (i=0; i < tam; i++)
		tabela[i].livre = 'L';
	do
	{
			cout << "\n\tMENU DE OPCOES - Ex. 1 - Prova Bimestral de OAD\n";
			cout << "\n1 - Inserir produto";
			cout << "\n2 - Consultar todos os produtos cadastrados de um tipo";
			cout << "\n3 - Contar quantos produtos estao cadastrados em cada tipo";
			cout << "\n4 - Sair";
			cout << "\n\nDigite sua opcao: ";
			cin >> op;
			
			switch(op)
			{
				case 1:
					system("CLS");
					cout<<"(A - Alimentacao | H - Higiene | L - Limpeza | V - Vestuario)";
					cout<<"\n\nDescricao do produto: ";
					gets(desc); //recebe o texto da descricao com os espaços e outros caracteres especiais
					gets(desc); //auxilia no recebimento do texto
					cout<<"\nTipo do produto: ";
					cin>>tipo; //recebe a letra referente ao tipo
					if(tipo == 'A' || tipo == 'a'){
						num = 1;
					}
					else if(tipo == 'H'|| tipo == 'h'){
						num = 2;
					}
					else if(tipo == 'L' || tipo == 'l'){
						num = 3;
					}
					else if(tipo == 'V' || tipo == 'v'){
						num = 4;
					}
					else{
						cout<<"Tipo invalido!";
						break;
					}
					pos = funcao_hashing(num); //retorna a posicao a ser inserida
					inserir(tabela, pos, num, desc); //insere na tabela
					break;
				case 2:
					system("CLS");
					char aux; //recebe a letra do tipo
					int n; //recebe o numero referente a letra digitada
					cout<<"(A - Alimentacao | H - Higiene | L - Limpeza | V - Vestuario)";
					cout<<"\n\nDigite a letra do tipo a ser consultado: ";
					cin>>aux;
					if(aux == 'A' || aux == 'a'){
						n = 1;
					}
					else if(aux == 'H'|| aux == 'h'){
						n = 2;
					}
					else if(aux == 'L' || aux == 'l'){
						n = 3;
					}
					else if(aux == 'V' || aux == 'v'){
						n = 4;
					}
					else{
						cout<<"Tipo invalido!";
						break;
					}
					cout<<"\nProdutos cadastrados do tipo "<<aux<<":\n";
					mostrar_hash(tabela, n); //mostra os produtos com chaves iguais a n
					break;
				case 3:
					system("CLS");
					contar(tabela); //conta quantas ocorrencias de cada chave temos na tabela
					break; 
				case 4:
					system("CLS");
					cout<<"Saindo...";
					return 0; // encerra a execução
					break;
				default:
					system("CLS");
					cout<<"Opcao Invalida!";
					break;
				}
	}while(op!=4);
}
