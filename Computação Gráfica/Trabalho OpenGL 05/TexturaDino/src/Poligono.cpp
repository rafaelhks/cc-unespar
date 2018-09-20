#include "Poligono.h"

Poligono::Poligono()
{
    this->angulo = 0;
    this->nPontos = 0;
}

Poligono::~Poligono(){}

void Poligono::add(Pixel* p){
    this->pontos.push_back(p);
    this->nPontos++;
}

void Poligono::angle(int a){
    this->angulo = a;
}

void Poligono::del(int pos){
    this->pontos.erase(this->pontos.begin()+pos);
    this->nPontos--;
}

void Poligono::nucleo(Pixel* p){
    this->p_nucleo = p;
}

void Poligono::centro(Pixel* p){
    this->p_centro = p;
}

int Poligono::angle(){
    return this->angulo;
}

int Poligono::total(){
    return this->nPontos;
}

Pixel* Poligono::nucleo(){
    return this->p_nucleo;
}

Pixel* Poligono::get(int pos){
    return this->pontos.at(pos);
}

Pixel* Poligono::centro(){
    return this->p_centro;
}
