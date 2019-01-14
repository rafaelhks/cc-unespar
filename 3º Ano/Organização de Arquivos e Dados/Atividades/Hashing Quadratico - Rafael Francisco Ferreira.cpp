#include <iostream>
#include <conio.h>

//Rafael Francisco Ferreira - C.C. Unespar

using namespace std;

const int tam = 8;

struct hash
{
	int chave;
	char livre; //L = livre, O = ocupado, R = Removido
};

int funcao_hashing(int num)
{
	return num % tam;
}

void mostrar_hash(hash tabela[])
{
	for (int i= 0; i < tam; i++)
	{
		if(tabela[i].livre == 'O')
			cout << "\nEntrada " << i << ": " << tabela[i].chave;
	}
}

void inserir (hash tabela[], int pos, int n)
{
	int k = 1;
	while (k < tam && tabela [pos].livre != 'L' && tabela[pos].livre != 'R')
		pos = (pos+k%tam);
		k = k +1;
		if (k<tam)
		{
			tabela[pos].chave = n;
			tabela[pos].livre = 'O';
		}
		else
			cout << "\nTabela Cheia";
			
}

int buscar (hash tabela[], int n)
{
	int k = 1;
	int pos = funcao_hashing(n);
	while (k < tam && tabela [pos].livre != 'L' && tabela[pos].chave !=n)
		k = k+1;
	if (tabela[pos].chave == n && tabela[pos].livre == 'O')
		return pos;
	else
		return tam; //Não encontrado
}

void remover (hash tabela[], int n)
{
	int posicao = buscar(tabela, n);
	if (posicao < tam)
		tabela[posicao].livre = 'R';
	else
		cout << "\nElemento nao esta presente.";
}

main()
{
	hash tabela[tam];
	
	int op, pos;
	int num, i;
	
	//inicialização da tabela
	for (i=0; i < tam; i++)
		tabela[i].livre = 'L';
	do
	{
			//clrscr();
			cout << "\nMENU DE OPCOES\n";
			cout << "\n1 - Inserir elemento";
			cout << "\n2 - Mostrar tabela Hashing";
			cout << "\n3 - Excluir Elemento";
			cout << "\n4 - Sair";
			cout << "\nDigite sua opçao: ";
			cin >> op;
			
			if(op < 1 || op > 4)
				cout << "\nOpcao Invalida!";
			else
			{
				switch(op)
				{
					case 1:
						cout << "\nDigite um numero: ";
						cin >> num;
						pos = funcao_hashing(num);
						inserir(tabela, pos, num);
						break;
					case 2:
						mostrar_hash(tabela);
						break;
					case 3:
						cout << "\n Digite um numero: ";
						cin >> num;
						remover(tabela,num);
						break; 
				}
			}
			getch();	
	}
	while(op!=4);
}
