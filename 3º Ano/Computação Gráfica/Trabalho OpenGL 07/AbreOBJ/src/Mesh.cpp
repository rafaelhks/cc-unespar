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
    cout<<"CMI: "<<centro->getX()<<", "<<centro->getY()<<", "<<centro->getZ()<<endl;
    double maiorX=this->faces.at(0)->get(0)->getX(), menorX = this->faces.at(0)->get(0)->getX(),
           maiorY=this->faces.at(0)->get(0)->getY(), menorY = this->faces.at(0)->get(0)->getY(),
           maiorZ=this->faces.at(0)->get(0)->getZ(), menorZ = this->faces.at(0)->get(0)->getZ();

    for(int i=0; i<this->faces.size(); i++){
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
    this->centro->setX((maiorX+menorX)/2.0);
    this->centro->setY((maiorY+menorY)/2.0);
    this->centro->setZ((maiorZ+menorZ)/2.0);
    cout<<"CMO: "<<centro->getX()<<", "<<centro->getY()<<", "<<centro->getZ()<<endl;
}

void Mesh::Scale(char op){
    this->Centro(); //Calcula o centro de massa
    for(int i=0; i<this->faces.size(); i++){
        Face* f = this->faces.at(i);
        for(int j=0; j<f->total(); j++){
            //cout<<"Original: "<<f->get(j)->getX()<<", "<<f->get(j)->getY()<<", "<<f->get(j)->getZ()<<endl;
            double x = f->get(j)->getX() - this->centro->getX();
            double y = f->get(j)->getY() - this->centro->getY();
            double z = f->get(j)->getZ() - this->centro->getZ();

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
            f->get(j)->setPosition(x+this->centro->getX(), y+this->centro->getY(), z+this->centro->getZ());
            //cout<<"New: "<<f->get(j)->getX()<<", "<<f->get(j)->getY()<<", "<<f->get(j)->getZ()<<endl;
        }
    }
}

void Mesh::Rotate(char eixo, char op){
    double angulo = (1*PI)/180; //Angulo de inclinação EM RADIANOS
    this->Centro(); //Retorna o centro de massa do objeto
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
