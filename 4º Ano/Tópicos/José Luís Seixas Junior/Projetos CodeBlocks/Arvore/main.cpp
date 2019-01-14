#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>
#include "Noh.h"
#include "Arvore.h"
using namespace std;

Arvore* arvore = new Arvore();

void readFile(string Path){
    fstream arquivo;
    string line, readNoh;
    arquivo.open(Path);

    if(arquivo.is_open()){
        getline(arquivo, line); //Primeira linha

        //tratamento dos dados da primeira linha
        istringstream streamLine(line);

        while(!streamLine.eof()){
            getline(streamLine, readNoh, ',');

            //Adiciona o ptr do noh no vector de nohs da arvore
            arvore->getNohs()->push_back(new Noh(stoi(readNoh)));

            cout<<"\nLido: "<<readNoh<<endl;

            //insere o ultimo noh lido
            if(arvore->getRaiz()){
                arvore->getRaiz()->insere(arvore->getNohs()->back());
            }else{
                arvore->insertRaiz(arvore->getNohs()->back());
            }
            cout<<"\nBalanco da raiz: "<<arvore->getRaiz()->getBalanco()<<endl;
        }
    }

    arquivo.close();
}

void printTree(){
    cout<<"\nNohs na arvore: ";
    for(int i = 0; i<arvore->getNohs()->size(); i++){
        cout<<arvore->getNohs()->at(i)->getValor()<<", ";
    }
    cout<<endl;
}

void removeNoh(int target){
    Noh* tg = arvore->getRaiz()->removeNoh(target);
    if(tg!=nullptr){
        auto pos = find(arvore->getNohs()->begin(), arvore->getNohs()->end(), tg);
        arvore->getNohs()->erase(pos);
        tg=nullptr;
    }
}

void saveFile(string Path){
    ofstream arquivo;
    arquivo.open(Path);

    arquivo.close();
}

int main()
{
    cout << "As arvres somos nozes" << endl;
    readFile("C:/Users/Rafael/Desktop/teste.txt");
    printTree();
    removeNoh(30);
    printTree();
    return 0;
}
