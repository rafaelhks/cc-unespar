#include <iostream>
#include <conio.h>

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
	for (int i = 0; i < tam; i++)
	{
		if(tabela[i].livre == '0')
			cout << "\nEntrada " << i << ": " << tabela[i].chave;
	}
}

void inserir (hash tabela[], int pos, int n)
{
	int i = 0;
	while (i < tam && tabela [(pos + i)%tam].livre !='L' && tabela[(pos + i)].livre !='R')
            i = i + 1;
        if (i<tam)
        {
            tabela[(pos+i)%tam].chave = n;
            tabela[(pos+i)%tam].livre = 'O';
        }
        else
            cout <<"\nTabela Cheia!";
}

int buscar (hash tabela[], int n)
{
    int i=0;
    int pos = funcao_hashing(n);
    while (i < tam && tabela[(pos+i)%tam].livre != 'L' && tabela[(pos+i)%tam].chave != n)
        i=i+1;
    if (tabela[(pos+i)%tam].chave == n && tabela[(pos+i)%tam].livre != 'R')
        return (pos+i) % tam;
    else
        return tam; //não encontrado
}

void remover (hash tabela[], int n)
{
    int posicao = buscar(tabela, n);
    if (posicao < tam)
        tabela[posicao].livre = 'R';
    else
        cout << "\nElemento não está presente.";
}

int main()
{
    hash tabela[tam];
    int op, pos;
    int num, i;

    //inicialização da tabela
    for (i=0; i<tam;i++)
        tabela[i].livre='L';
    do
    {
        //clrscr();
        cout << "\nMENU DE OPCOES\n";
        cout << "\n1 - Inserir Elemento";
        cout << "\n2 - Mostrar tabela hashing";
        cout << "\n3 - Excluir elemento";
        cout << "\n4 - Sair";
        cout << "\nDigite sua opção";
        cin >> op;

        if (op < 1 || op > 4)
            cout << "\nOpcao Invalida";
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
                    cout << "\nDigite um numero: ";
                    cin >> num;
                    remover(tabela, num);
                    break;
            }
        }
        getch;
    }
    while (op!=4);
}
