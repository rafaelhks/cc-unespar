#include "Arvore.h"
#include <iostream>
#include <vector>

Arvore::Arvore()
{
    this->raiz = nullptr;
}

Arvore::~Arvore()
{

}

Noh* Arvore::getRaiz(){
    return this->raiz;
}

vector<Noh*>* Arvore::getNohs(){
    return &nohs;
}

void Arvore::balanceamento(){
    Noh* atual = this->raiz;
    while(atual->getBalanco()>1){
        atual = atual->getFilhoDir();
    }
    while(atual->getBalanco()<1){
        atual = atual->getFilhoEsq();
    }
}

void Arvore::insertRaiz(Noh* noh){
    this->raiz = noh;
    cout<<"Raiz inserida: "<<noh->getValor()<<endl;
}
