#include <iostream>
#include <conio.h>
#include <stdio.h>

//Rafael Francisco Ferreira - 3º ano C.C. Unespar - Segundo exercicio da prova bimestral de Organização de Arquivos e Dados

using namespace std;

const int tam = 1000;

struct hash
{
	int chave; //recebe o mes de aniversario
	string nome; //recebe a string nome
	int dia; //recebe o dia do aniversario
	int mes; //recebe o mes
	int ano; //recebe o ano de nascimento p/ calcular os maiores de 18
	char livre; //L=livre, O = ocupado, R = Removido
};

int funcao_hashing(int num)
{
	return num % tam;
}

void mostrar_hash(hash tabela[], int m)
{
	cout<<"\nAniversariantes do mes "<< m <<"\n";
	for (int i=0; i < tam; i++){
		if (tabela[i].livre =='O'&& tabela[i].chave == m){
			cout << "\nNome: "<< tabela[i].nome;
		}
	}
	cout<<"\n";
}

void inserir (hash tabela[], int pos, int mes, int dia, int ano, string nome)
{
	int i = 0;
	while (i < tam && tabela [(pos + i)%tam].livre !='L'&& tabela[(pos + i)%tam].livre !='R') 
		i = i + 1;
		if (i<tam)
		{
			tabela[(pos+i)%tam].chave = mes;
			tabela[(pos+i)%tam].nome = nome;
			tabela[(pos+i)%tam].dia = dia;
			tabela[(pos+i)%tam].mes = mes;
			tabela[(pos+i)%tam].ano = ano;
			tabela[(pos+i)%tam].livre = 'O';			
		}
		else
			cout <<"\nTabela Cheia!";
}

int buscar (hash tabela[], int n, string nome)
{
	int i=0;
	int pos=funcao_hashing(n);
	while (i < tam && tabela [(pos + i)%tam].livre !='L'&& tabela[(pos + i)%tam].chave !=n) 
		i=i+1;
	if (tabela[(pos+i)%tam].chave == n && tabela[(pos+i)%tam].nome == nome && tabela[(pos+i)%tam].livre != 'R')
		return (pos+i) % tam;
	else
		return tam; //não encontrado
}

void remover (hash tabela[], string n, int mes)
{
	int posicao = buscar(tabela, mes, n); //retorna a posicao de acordo com a chave mes e o nome
	if (posicao< tam){
		tabela[posicao].livre = 'R';
		cout<<"\nAmigo removido com sucesso!\n";
	}else
		cout << "\nElemento nao esta presente.";
		
}

void contar18(hash tabela[]){
	int qtde = 0;
	for (int i= 0; i < tam; i++){ //incrementa as variaveis de quantidade de cada tipo para cada ocorrencia do numero correspondente na tabela
		if(tabela[i].livre == 'O' && (2017 - tabela[i].ano) >= 18){
			qtde++;
		}
	}
	cout<<"A quantidade de pessoas com idade superior a 18 e': "<< qtde <<"\n";
}

main()
{
	hash tabela[tam];
	
	int op, pos;
	int dia, mes, ano, i;
	char nome[100];
	
	//inicialização da tabela
	for (i=0; i < tam; i++)
		tabela[i].livre='L';
	
	do
	{
		cout << "\n\tMENU DE OPCOES - Ex. 2 - Prova Bimestral de OAD\n";
		cout << "\n1 - Cadastrar amigo";
		cout << "\n2 - Consultar aniversariantes de um mes";
		cout << "\n3 - Contar as pessoas com idade superior a 18";
		cout << "\n4 - Excluir uma pessoa";
		cout << "\n5 - Sair";
		cout << "\n\nDigite sua opcao: ";
		cin >> op;
		
		switch(op)
		{
			case 1: 
				system("CLS");
				cout<<"\nDigite o nome do amigo: ";
				gets(nome); //recebe a string de nome co espaços
				gets(nome); //auxilia no recebimento da string
				cout<<"\nDigite o dia do aniversario (numero): ";
				cin>>dia; //recebe o dia
				cout<<"\nDigite o mes do aniversario (numero de 1 a 12): ";
				cin>>mes; //recebe o mes
				cout<<"\nDigite o ano de nascimento (Ex: 1997): ";
				cin>>ano; //recebe o ano
				pos = funcao_hashing(mes); //retorna a posicao a ser inserida
				inserir(tabela, pos, mes, dia, ano, nome); //insere na tabela
				system("CLS");
				cout<<"\nAmigo inserido com sucesso!\n";
				break;
			case 2:
				system("CLS");
				cout<<"\nInforme o mes desejado (numero de 1 a 12): ";
				cin>>mes;
				system("CLS");
				mostrar_hash(tabela, mes); //mostra as posicoes que tem o mes informado como chave
				break;
			case 3:
				system("CLS");
				contar18(tabela); //conta quantas ocorrencias de maiores de idade temos na tabela
				break;
			case 4:
				system("CLS");
				cout <<"\nDigite o nome (como foi cadastrado) do amigo a ser removido: ";
				gets(nome); //recebe o nome para nao ser removido todos os aniversariantes do mes
				gets(nome); //aux a receber o nome
				cout<<"\nDigite o mes de aniversario do amigo a ser removido (numero de 1 a 12): ";
				cin >> mes; //recebe o mes
				remover(tabela, nome, mes); //remove pelo nome && mes
				break;
			case 5:
				system("CLS");
				cout<<"Finalizando Sistema_";
				cout<<"\nSaindo...";
				return 0;
				break;
			default:
				cout<<"Opcao Invalida!";
				break;	
		}
	}
	while (op!=5);
}

