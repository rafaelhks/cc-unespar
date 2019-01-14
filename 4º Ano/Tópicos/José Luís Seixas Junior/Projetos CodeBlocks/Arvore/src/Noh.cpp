#include "Noh.h"
#include <iostream>

Noh::Noh(int value)
{
    valor = value;
    balanco = 0;
    filhoDir = nullptr;
    filhoEsq = nullptr;
}

Noh::~Noh()
{
    delete(this);
}

bool Noh::insere(Noh* noh){
    if(this->valor < noh->getValor()){
        if(filhoDir == nullptr){
            cout<<"Noh inserido a direita de "<<this->valor<<" : "<<noh->getValor()<<endl;
            this->filhoDir = noh;
            this->filhoDir->setPai(this);
        }else{
            cout<<"Desceu para a direita de "<<this->valor<<endl;
            this->filhoDir->insere(noh);
        }

        this->balanco++;
        return true;
    }

    else if(this->valor > noh->getValor()){
        if(filhoEsq == nullptr){
            cout<<"Noh inserido a esquerda de "<<this->valor<<" : "<<noh->getValor()<<endl;
            this->filhoEsq = noh;
            this->filhoEsq->setPai(this);
        }else{
            cout<<"Desceu para a esquerda de "<<this->valor<<endl;
            this->filhoEsq->insere(noh);
        }

        this->balanco--;
        return true;
    }

    else{
        cout<<"\nO Noh nao pode ser inserido na arvore."<<endl;
        return false;
    }
}

Noh* Noh::removeNoh(int target){
    //Se for o noh a ser removido
    if(this->valor == target){
        cout<<"\nRemovido o noh: "<<this->valor<<endl;

        //Se não tiver filhos
        if(this->filhoDir == nullptr && this->filhoEsq == nullptr){
            return this;
        }

        //Se tiver só o filho direito
        if(this->filhoDir && !this->filhoEsq){
            this->pai->setFilhoDir(this->filhoDir);
            this->filhoDir->setPai(this->pai);
        }

        //Se tiver só o filho esquerdo
        else if(!this->filhoDir && this->filhoEsq){
            this->pai->setFilhoEsq(this->filhoEsq);
            this->filhoEsq->setPai(this->pai);
        }

        //Se tiver os dois filhos
        else if(this->filhoDir && this->filhoEsq){

            //Raiz da sub-arvore esquerda
            Noh* raizSub = this->filhoEsq;
            //Noh mais à direita da sub-arvore esquerda
            while(raizSub->filhoDir){
                raizSub = raizSub->filhoDir;
            }
            this->pai->setFilhoEsq(raizSub);
            raizSub->setFilhoDir(this->filhoDir);
            raizSub->setFilhoEsq(this->filhoEsq);

            //balancear os nohs da subarvore
            //Noh mais a direita ainda pode ter filhos na esquerda (setar como filho esquerda do pai dele)
            cout<<"Novo noh no lugar de "<<target<<" :"<<raizSub->getValor()<<endl;
        }
        return this;
    }
    else if(this->valor < target){
        if(this->filhoDir){
            this->filhoDir->removeNoh(target);
        }
        else{
            cout<<"Nao existe um noh de valor "<<target<<" nesta arvore!"<<endl;
            return nullptr;
        }
    }
    else if(this->valor > target){
        if(this->filhoEsq){
            this->filhoEsq->removeNoh(target);
        }
        else{
            cout<<"Nao existe um noh de valor "<<target<<" nesta arvore!"<<endl;
            return nullptr;
        }
    }
}

void Noh::balancear(Noh* raizSub){

}

void Noh::setFilhoDir(Noh* filho){
    this->filhoDir = filho;
}

void Noh::setFilhoEsq(Noh* filho){
    this->filhoEsq = filho;
}

void Noh::setPai(Noh* p){
    this->pai = p;
}

int Noh::getValor(){
    return valor;
}

Noh* Noh::getPai(){
    return this->pai;
}

Noh* Noh::getFilhoDir(){
    return this->filhoDir;
}

Noh* Noh::getFilhoEsq(){
    return this->filhoEsq;
}

int Noh::getBalanco(){
    return this->balanco;
}
