#include "RedBlack.h"
#include <iostream>
#include <vector>

RedBlack::RedBlack()
{
    this->raiz = nullptr;
    this->pretos = 0;
}

RedBlack::~RedBlack()
{

}

Noh* RedBlack::getRaiz(){
    return this->raiz;
}

vector<Noh*>* RedBlack::getNohs(){
    return &nohs;
}

void RedBlack::insertRaiz(Noh* noh){
    this->raiz = noh;
    cout<<"Raiz inserida: "<<noh->getValor()<<endl;
}

void RedBlack::RightRB(){

}

void RedBlack::LeftRB(){

}
