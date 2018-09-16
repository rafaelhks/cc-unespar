#include "Mesh.h"
#include <iostream>
#include <math.h>
#include <vector>
#define PI 3.14159265359

Mesh::Mesh()
{
    this->nVertices = 0;
    this->nFaces = 0;
    this->centro = new Vertex3D(0,0,0);
}

Mesh::~Mesh(){}

void Mesh::addFace(Face* f){
    this->faces.push_back(f);
    this->nFaces++;
}

Face* Mesh::getFace(int pos){
    return this->faces.at(pos);
}

void Mesh::setFaces(vector<Face*> faces){
    this->faces = faces;
}

int Mesh::faceTotal(){
    return this->nFaces;
}

void Mesh::Centro(){
    double maiorX=faces.at(0)->get(0)->getX(), menorX = faces.at(0)->get(0)->getX(),
           maiorY=faces.at(0)->get(0)->getY(), menorY = faces.at(0)->get(0)->getY(),
           maiorZ=faces.at(0)->get(0)->getZ(), menorZ = faces.at(0)->get(0)->getZ();

    for(int i=0; i<this->nFaces; i++){
        Face* f = this->faces.at(i);
        for(int j=0; j<f->total(); j++){
            if(f->get(j)->getX()>maiorX) maiorX = f->get(j)->getX();
            if(f->get(j)->getX()<menorX) menorX = f->get(j)->getX();
            if(f->get(j)->getY()>maiorY) maiorY = f->get(j)->getY();
            if(f->get(j)->getY()<menorY) menorY = f->get(j)->getY();
            if(f->get(j)->getZ()>maiorZ) maiorZ = f->get(j)->getZ();
            if(f->get(j)->getZ()<menorZ) menorZ = f->get(j)->getZ();
        }
    }
    centro->setX((maiorX+menorX)/2.0);
    centro->setY((maiorY+menorY)/2.0);
    centro->setZ((maiorZ+menorZ)/2.0);
    //cout<<"CM: "<<centro.x<<" "<<centro.y<<" "<<centro.z<<endl;
}

void Mesh::Scale(char op){
    Centro(); //Calcula o centro de massa
    for(int i=0; i<this->nFaces; i++){
        Face* f = this->faces.at(i);
        for(int j=0; j<f->total(); j++){
            double x = f->get(j)->getX() - centro->getX();
            double y = f->get(j)->getY() - centro->getY();
            double z = f->get(j)->getZ() - centro->getZ();

            if(op=='+'){ //Aumenta Escala
                x *= 1.1;
                y *= 1.1;
                z *= 1.1;
            }
            if(op=='-'){ //Diminui Escala
                x /= 1.1;
                y /= 1.1;
                z /= 1.1;
            }
            f->get(j)->setPosition(x+centro->getX(), y+centro->getY(), z+centro->getZ());
        }
    }
}

void Mesh::Rotate(char eixo, char op){
    double angulo = PI/360; //Angulo de inclinação
    Centro(); //Retorna o centro de massa do objeto
    for(int i=0; i<this->nFaces; i++){
        Face* f = this->faces.at(i);
        for(int j=0; j<f->total(); j++){
            double x = f->get(j)->getX() - centro->getX();
            double y = f->get(j)->getY() - centro->getY();
            double z = f->get(j)->getZ() - centro->getZ();
            if(op=='h'){ //Sentido horário
                if(eixo=='Z'){
                    x = x*cos(angulo)-y*sin(angulo);
                    y = x*sin(angulo)+y*cos(angulo);
                }
                if(eixo=='X'){
                    y = y*cos(angulo)-z*sin(angulo);
                    z = y*sin(angulo)+z*cos(angulo);
                }
                if(eixo=='Y'){
                    x = z*sin(angulo)+x*cos(angulo);
                    z = z*cos(angulo)-x*sin(angulo);
                }
            }
            if(op=='a'){ //Sentido anti-horário
                if(eixo=='Z'){
                    x = x*cos(-angulo)-y*sin(-angulo);
                    y = x*sin(-angulo)+y*cos(-angulo);
                }
                if(eixo=='X'){
                    y = y*cos(-angulo)-z*sin(-angulo);
                    z = y*sin(-angulo)+z*cos(-angulo);
                }
                if(eixo=='Y'){
                    x = z*sin(-angulo)+x*cos(-angulo);
                    z = z*cos(-angulo)-x*sin(-angulo);
                }
            }
            f->get(j)->setPosition(x+centro->getX(), y+centro->getY(), z+centro->getZ());
        }
    }
}
