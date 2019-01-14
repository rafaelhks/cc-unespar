#include <iostream>
using namespace std;
void contador(int num);

int main(){
	contador(10);
	return 0;
}

void contador(int num){
	for(int i=0;i<=num;i++){
		cout<<i<<"\n";
	}
}
