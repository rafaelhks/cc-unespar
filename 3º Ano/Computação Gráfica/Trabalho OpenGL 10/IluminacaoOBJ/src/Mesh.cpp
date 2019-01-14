#include "Mesh.h"
#include <iostream>
#include <vector>
#include <math.h>
#define PI 3.14159265359

Mesh::Mesh()
{

}

Mesh::~Mesh()
{

}

void Mesh::Centro(){
    double maiorX=vertices.at(0).x, menorX = vertices.at(0).x,
           maiorY=vertices.at(0).y, menorY = vertices.at(0).y,
           maiorZ=vertices.at(0).z, menorZ = vertices.at(0).z;

    for(int i=0; i<(int)vertices.size(); i++){
        if(vertices.at(i).x>maiorX) maiorX = vertices.at(i).x;
        if(vertices.at(i).x<menorX) menorX = vertices.at(i).x;
        if(vertices.at(i).y>maiorY) maiorY = vertices.at(i).y;
        if(vertices.at(i).y<menorY) menorY = vertices.at(i).y;
        if(vertices.at(i).z>maiorZ) maiorZ = vertices.at(i).z;
        if(vertices.at(i).z<menorZ) menorZ = vertices.at(i).z;
    }
    centro.x = (maiorX+menorX)/2.0;
    centro.y = (maiorY+menorY)/2.0;
    centro.z = (maiorZ+menorZ)/2.0;
    //cout<<"CM: "<<centro.x<<" "<<centro.y<<" "<<centro.z<<endl;
}

void Mesh::Scale(char op){
    Centro(); //Retorna centro de massa
    for(int i=0; i<(int)vertices.size(); i++){
        vertices.at(i).x -= centro.x;
        vertices.at(i).y -= centro.y;
        vertices.at(i).z -= centro.z;
        if(op=='+'){ //Aumenta Escala
            vertices.at(i).x *= 1.1;
            vertices.at(i).y *= 1.1;
            vertices.at(i).z *= 1.1;
        }
        if(op=='-'){ //Diminui Escala
            vertices.at(i).x /= 1.1;
            vertices.at(i).y /= 1.1;
            vertices.at(i).z /= 1.1;
        }
        vertices.at(i).x += centro.x;
        vertices.at(i).y += centro.y;
        vertices.at(i).z += centro.z;
    }
}

void Mesh::Rotate(char eixo, char op){
    double angulo = PI/360; //Angulo de inclinação
    Centro(); //Retorna o centro de massa do objeto
    for(int i=0; i<(int)vertices.size(); i++){
        vertices.at(i).x -= centro.x;
        vertices.at(i).y -= centro.y;
        vertices.at(i).z -= centro.z;
        if(op=='h'){ //Sentido horário
            if(eixo=='Z'){
                vertices.at(i).x = vertices.at(i).x*cos(angulo)-vertices.at(i).y*sin(angulo);
                vertices.at(i).y = vertices.at(i).x*sin(angulo)+vertices.at(i).y*cos(angulo);
            }
            if(eixo=='X'){
                vertices.at(i).y = vertices.at(i).y*cos(angulo)-vertices.at(i).z*sin(angulo);
                vertices.at(i).z = vertices.at(i).y*sin(angulo)+vertices.at(i).z*cos(angulo);
            }
            if(eixo=='Y'){
                vertices.at(i).x = vertices.at(i).z*sin(angulo)+vertices.at(i).x*cos(angulo);
                vertices.at(i).z = vertices.at(i).z*cos(angulo)-vertices.at(i).x*sin(angulo);
            }
        }
        if(op=='a'){ //Sentido anti-horário
            if(eixo=='Z'){
                vertices.at(i).x = vertices.at(i).x*cos(-angulo)-vertices.at(i).y*sin(-angulo);
                vertices.at(i).y = vertices.at(i).x*sin(-angulo)+vertices.at(i).y*cos(-angulo);
            }
            if(eixo=='X'){
                vertices.at(i).y = vertices.at(i).y*cos(-angulo)-vertices.at(i).z*sin(-angulo);
                vertices.at(i).z = vertices.at(i).y*sin(-angulo)+vertices.at(i).z*cos(-angulo);
            }
            if(eixo=='Y'){
                vertices.at(i).x = vertices.at(i).z*sin(-angulo)+vertices.at(i).x*cos(-angulo);
                vertices.at(i).z = vertices.at(i).z*cos(-angulo)-vertices.at(i).x*sin(-angulo);
            }
        }
        vertices.at(i).x += centro.x;
        vertices.at(i).y += centro.y;
        vertices.at(i).z += centro.z;
    }
}
