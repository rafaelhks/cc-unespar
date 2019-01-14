#include "Noh.h"
#include <iostream>

Noh::Noh(int value)
{
    valor = value;
    preto = false;
    filhoDir = nullptr;
    filhoEsq = nullptr;
}

Noh::~Noh()
{
    delete(this);
}

bool Noh::insere(Noh* noh){
    if(this==nullptr){
        //this = &noh;
        Verificar();
    }
    if(this->valor > noh->getValor()){
        this->filhoEsq->insere(noh);
    }else{
        this->filhoDir->insere(noh);
    }
}

void inline Noh::Verificar(){
    if(!this->pai->preto){
        if(irmao(this->pai->pai)->preto){
            //Caso 1
            this->pai->preto = true; //pai preto
            this->irmao(this)->preto = true; //tio preto
            this->pai->pai->preto = false; //avo vermelho
        }
    }
}

Noh* Noh::irmao(Noh* n){
    Noh* pai = n->pai;
    if(pai->filhoDir && pai->filhoDir == n){
        return pai->filhoEsq;
    }else{
        return pai->filhoDir;
    }
}

Noh* Noh::removeNoh(int target){
    Noh aux = busca(target);

    if(aux==nullptr) return aux;

    Noh* dir = maisDir(aux->filhoEsq);
    if(!dir->preto){
        if(aux->preto) dir->preto = true;
        //Só copiar
        dir->pai->filhoDir = dir->filhoEsq;
    }else{
        //checar: talvez os dir->pai abaixo devam ser somente dir
        if(aux->preto){
            Noh* irmao = irmao(dir);
            if(dir->pai->preto && irmao->preto){
                irmao->preto = false;
                rotacionarDir(irmao);
                irmao->filhoDir->filhoEsq->preto = false;
            }
            if(!irmao->preto && dir->pai->preto){
                rotacionar(irmao); //direita
                irmao->filhoDir->filhoEsq->preto = false; //esq pode ser null testar
            }
            if(!dir->pai->preto && irmao->preto){
                if(irmao->filhoDir == nullptr){
                    rotacionarDir(irmao);
                }else{
                    rotacionarDir(irmao);
                    irmao->filhoDir->preto = true;
                    irmao->filhoEsq->preto = true;
                    irmao->preto = false;
                }
            }else{
                //Só copiar
            }
        }
    }

}

Noh* Noh::maisDir(Noh* raizSub){
    //retorna noh mais a direita da subarvore esquerda
}

Noh* Noh::busca(int tgt){

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
