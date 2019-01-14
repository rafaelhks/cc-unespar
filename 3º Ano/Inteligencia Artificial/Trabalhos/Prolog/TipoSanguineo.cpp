#include <iostream>
using namespace std;

int main(){
	string tipo;
	inicio:
	cout<<"Informe o tipo sanguineo: ";
	cin>>tipo;
	system("CLS");
	cout<<"Tipo informado: "<<tipo<<endl;
	
	if(tipo == "A+"){
		cout<<"Doa para: A+, AB+."<<endl;
		cout<<"Recebe de: A+, A-, O+, O-."<<endl;
	}
	else if(tipo == "A-"){
		cout<<"Doa para: A+, A-, AB+, AB-."<<endl;
		cout<<"Recebe de: A-, O-."<<endl;
	}
	else if(tipo == "B+"){
		cout<<"Doa para: B+, AB+."<<endl;
		cout<<"Recebe de: B+, B-, O+, O-."<<endl;
	}
	else if(tipo == "B-"){
		cout<<"Doa para: B+, B-, AB+, AB-."<<endl;
		cout<<"Recebe de: B-, O-."<<endl;
	}
	else if(tipo == "AB+"){
		cout<<"Doa para: AB+."<<endl;
		cout<<"Recebe de: A+, A-, AB+, AB-, O+, O-."<<endl;
	}
	else if(tipo == "AB-"){
		cout<<"Doa para: AB+, AB-."<<endl;
		cout<<"Recebe de: A-, B-, AB-, O-."<<endl;
	}
	else if(tipo == "O+"){
		cout<<"Doa para: A+, B+, AB+, O+."<<endl;
		cout<<"Recebe de: O+, O-."<<endl;
	}
	else if(tipo == "O-"){
		cout<<"Doa para: A+, A-, B+, B-, AB+, AB-, O+, O-."<<endl;
		cout<<"Recebe de: O-."<<endl;
	}
	else{
		cout<<"Tipo inexistente!"<<endl;
		goto inicio;
	}
	
	char op;
	cout<<"\nChecar outro tipo? [S/N]: ";
	cin>>op;
	if(op == 'S') {
		system("CLS");
		goto inicio;
	}else goto fim;
	
	fim:
	return 0;
}
