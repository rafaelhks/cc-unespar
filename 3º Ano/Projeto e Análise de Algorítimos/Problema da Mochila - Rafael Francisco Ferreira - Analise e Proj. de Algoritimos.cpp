#include<stdio.h>
#include <iostream>
#include<conio.h>
using namespace std;

//Rafael Francisco Ferreira - Algoritimo de Implementação do Problema da Mochila
//Analise e Projeto de Algoritimos - Unespar, 2017

int peso[100],beneficio[100];
int v[100][100],n,i,j,cap,x[100]={0};

int max(int i,int j)
{
	return ((i>j)?i:j);
}

int mochila(int i,int j)
{
	int valor;
	if(v[i][j]<0)
	{
		if(j<peso[i])
			valor = mochila(i-1,j);
		else
			valor = max(mochila(i-1,j),beneficio[i]+mochila(i-1,j-peso[i]));
		v[i][j]=valor;
	}
	return(v[i][j]);
}

int main()
{
	int bTotal,count=0;
	cout<<"| Implementacao do Problema da Mochila - Rafael Francisco Ferreira |\n\n";
	cout<<"Informe a quantidade de itens: ";
	cin>>n;
	
	cout<<"\nInforme o beneficio e o peso de cada item "<<endl;
	for(i=1;i<=n;i++){
		cout<<"\n";
		cout << "Para o item "<<i<<endl;
		cout << "Informe o Beneficio: ";
		cin >> beneficio[i];
		cout << "Informe o Peso: ";
		cin >> peso[i];
	}
	
 	cout << "\nInforme a capacidade maxima da Mochila: ";
	cin >> cap;
	for(i=0;i<=n;i++)
		for(j=0;j<=cap;j++)
			if((i==0)||(j==0))
				v[i][j]=0;
			else
				v[i][j]=-1;
	bTotal = mochila(n,cap);
	i=n;	
	j=cap;
	while(j!=0&&i!=0)
	{
		if(v[i][j]!=v[i-1][j])
		{
			x[i]=1;
			j=j-peso[i];
			i--;
  		}
  		else
   			i--;
 	}
	cout<<"\nItens incluidos na mochila foram:\n";
	cout<<"\nItem\tPeso\tBeneficio\n";
	for(i=1;i<=n;i++)
		if(x[i])
			printf("%d\t%d\t%d\n",++count,peso[i],beneficio[i]);
	cout<<"\nBeneficio Total = "<< bTotal;
	getch();
}
