#include <iostream>
#include <conio.h>
using namespace std;

int main(){
	int X[5], j, i, eleito, x;
	x=0; //1
	for(i=0;i<=4;i++){ //2n - PA(4n/2)
		cout<<"Digite o " <<i+1<<"º numero: ";//n - PA(2n/2)
		cin>>X[i];//n - PA(2n/2)
	}
	for(i=1; i<=4;i++){//2(n-1) = 2n-2 - PA(4n-4/2) 
		eleito = X[i];//n-1 - PA(2n-2/2)
		j=i-1;//n-1 - PA(2n-2/2)
		while (j>=0 && X[j]>=eleito){// 2n²-2n/2
			X[j+1] = X[j];// 2n²-2n/2
			j=j-1;// 2n²-2n/2
		}	
		X[j+i] = eleito; //n-1 - PA(2n-2/2)
	}
	for(i=0; i<=4; i++){//2n - PA(4n/2)
		cout<<i+1<<"º numero: "<<X[i]<<"\n";//n - PA(2n/2)
	}
	getch();
}
