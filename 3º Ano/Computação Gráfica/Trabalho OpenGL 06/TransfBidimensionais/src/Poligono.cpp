#include "Poligono.h"
#define PI 3.14159265359

Poligono::Poligono()
{
    this->nPontos=0;
    this->centro = new Pixel();
}

Poligono::~Poligono()
{
    //dtor
}

void Poligono::clearAll(){
    this->pontos.clear();
    this->nPontos = 0;
}

Pixel* Poligono::getPonto(int pos){
    return this->pontos.at(pos);
}

int Poligono::total(){
    return this->nPontos;
}

void Poligono::add(Pixel* p){
    this->pontos.push_back(p);
    this->nPontos++;
}

void Poligono::Remove(int pos){
    this->pontos.erase(this->pontos.begin()+pos);
    this->nPontos--;
}

void Poligono::Centro(){
    double maiorX = pontos.at(0)->getX(), menorX = pontos.at(0)->getX();
    double maiorY = pontos.at(0)->getY(), menorY = pontos.at(0)->getY();

    for(int i=0; i<(int)pontos.size(); i++){
        if(pontos.at(i)->getX()>maiorX) maiorX = pontos.at(i)->getX();
        if(pontos.at(i)->getX()<menorX) menorX = pontos.at(i)->getX();
        if(pontos.at(i)->getY()>maiorY) maiorY = pontos.at(i)->getY();
        if(pontos.at(i)->getY()<menorY) menorY = pontos.at(i)->getY();
    }
    centro->setX((maiorX+menorX)/2);
    centro->setY((maiorY+menorY)/2);

    cout<<"CM: "<<centro->getX()<<" "<<centro->getY()<<endl;
}

void Poligono::Translate(char dir){
    for(int i=0; i<(int)pontos.size(); i++){
        double x = pontos.at(i)->getX();
        double y = pontos.at(i)->getY();
        if(dir=='l')    pontos.at(i)->setX(x-7);
        else if(dir=='r')    pontos.at(i)->setX(x+7);
        else if(dir=='u')    pontos.at(i)->setY(y-7);
        else if(dir=='d')    pontos.at(i)->setY(y+7);
    }
}

void Poligono::Scale(char op){
    Centro(); //Retorna centro de massa
    for(int i=0; i<(int)pontos.size(); i++){
        double x = pontos.at(i)->getX() - centro->getX();
        double y = pontos.at(i)->getY() - centro->getY();
        if(op=='+'){ //Aumenta Escala
            x*=2;
            y*=2;
        }
        else if(op=='-' && x/2 != centro->getX() && y/2 != centro->getY()){ //Diminui Escala
            x /= 2;
            y /= 2;
        }
        pontos.at(i)->setX(x+centro->getX());
        pontos.at(i)->setY(y+centro->getY());
    }
}

void Poligono::Rotate(char op){
    double angulo = (5*PI)/180; //Angulo de inclinação EM RADIANOS
    Centro(); //Retorna o centro
    for(int i=0; i<(int)pontos.size(); i++){
        double x = pontos.at(i)->getX() - centro->getX();
        double y = pontos.at(i)->getY() - centro->getY();
        if(op=='h'){ //Sentido horário
            x = x*cos(angulo)-y*sin(angulo);
            y = x*sin(angulo)+y*cos(angulo);
        }
        else if(op=='a'){ //Sentido anti-horário
            x = x*cos(-angulo)-y*sin(-angulo);
            y = x*sin(-angulo)+y*cos(-angulo);
        }
        pontos.at(i)->setX(x+centro->getX());
        pontos.at(i)->setY(y+centro->getY());
    }
}
