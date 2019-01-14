#include <iostream>
#include <conio.h>
using namespace std;

void troca(int X[], int i, int j)
{
	int aux;
	aux=X[i];
	X[i]=X[j];
	X[j]=aux;	
}

int particao(int X[], int p, int r) //f(n)
{
	int pivo, i, j;
	pivo = X[(p+r)/2];
	i=p-1;
	j=r+1;
	while (i<j)
	{
		do
		{
			j=j-1;
		}
		while (X[j]>pivo);
		do
		{
			i=i+1;
		}
		while (X[i]<pivo);
		if (i<j) troca(X,i,j);
	}
	return j;
}
void quicksort(int X[], int p, int r)
{
	int q;
	if (p<r)
	{
		q=particao(X,p,r); //
		quicksort(X, p, q); //1
		quicksort (X, q+1,r); //1
	}
}
int main()
{
	int X[5], i;
	
	for (i=0;i<=4;i++)
	{
		cout<<"Digite o " <<i+1<<"� n�mero: ";
		cin>>X[i];	
	}	
	
	quicksort(X,0,4);
	
	for (i=0; i<=4;i++)
	{
		cout<<i+1<<"� n�mero: "<<X[i]<<"\n";
	}

	getch();
}

//CUSTO

//AT(n/2) + f(n)
//2T(n/2) + n
