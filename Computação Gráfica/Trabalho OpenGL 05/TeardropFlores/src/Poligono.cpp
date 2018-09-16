#include "Poligono.h"
#include <iostream>
#include <math.h>
#define PI 3.14159265359

Poligono::Poligono()
{
    //CTOR
}

Poligono::~Poligono()
{
    //dtor
}

ponto Poligono::Centro(){
    ponto centro;
    double maiorX=-99999, menorX = 99999, maiorY=-99999, menorY = 99999;

    for(int i=0; i<(int)pontos.size(); i++){
        if(pontos.at(i).x>maiorX) maiorX = pontos.at(i).x;
        if(pontos.at(i).x<menorX) menorX = pontos.at(i).x;
        if(pontos.at(i).y>maiorY) maiorY = pontos.at(i).y;
        if(pontos.at(i).y<menorY) menorY = pontos.at(i).y;
    }
    centro.x = (maiorX+menorX)/2;
    centro.y = (maiorY+menorY)/2;

    cout<<"CM: "<<centro.x<<" "<<centro.y<<endl;
    return centro;
}

void Poligono::Rotate(char op){
    double angulo = PI/180; //Angulo de inclinação
    centro = Centro(); //Retorna o centro
    for(int i=0; i<(int)pontos.size(); i++){
        if(op=='h'){ //Sentido horário
            pontos.at(i).x -= centro.x;
            pontos.at(i).y -= centro.y;
            pontos.at(i).x = pontos.at(i).x*cos(angulo)-pontos.at(i).y*sin(angulo);
            pontos.at(i).y = pontos.at(i).x*sin(angulo)+pontos.at(i).y*cos(angulo);
            pontos.at(i).x += centro.x;
            pontos.at(i).y += centro.y;
        }
        if(op=='a'){ //Sentido anti-horário
            pontos.at(i).x -= centro.x;
            pontos.at(i).y -= centro.y;
            pontos.at(i).x = pontos.at(i).x*cos(-angulo)-pontos.at(i).y*sin(-angulo);
            pontos.at(i).y = pontos.at(i).x*sin(-angulo)+pontos.at(i).y*cos(-angulo);
            pontos.at(i).x += centro.x;
            pontos.at(i).y += centro.y;
        }
    }
}
