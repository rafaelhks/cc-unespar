#include "Poligono.h"
#include <iostream>
#include <vector>
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

void Poligono::Rotate(){
    double angulo = PI/3600; //Controla a velocidade do giro
    for(int i=0; i<(int)pontos.size(); i++){
        pontos.at(i).x -= nucleo.x;
        pontos.at(i).y -= nucleo.y;
        pontos.at(i).x = pontos.at(i).x*cos(-angulo)-pontos.at(i).y*sin(-angulo);
        pontos.at(i).y = pontos.at(i).x*sin(-angulo)+pontos.at(i).y*cos(-angulo);
        pontos.at(i).x += nucleo.x;
        pontos.at(i).y += nucleo.y;
    }
}
