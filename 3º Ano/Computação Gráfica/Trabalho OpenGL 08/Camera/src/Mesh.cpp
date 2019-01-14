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

Vertex3D* Mesh::getVertex(int pos){
    return this->vertices.at(pos);
}

Vertex3D* Mesh::getCentro(){
    return this->centro;
}

void Mesh::addVertex(double x, double y, double z){
    this->vertices.push_back(new Vertex3D(x, y, z));
    this->nVertices++;
}

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

int Mesh::totalVertices(){
    return this->nVertices;
}

int Mesh::faceTotal(){
    return this->nFaces;
}

void Mesh::Centro(){
    cout<<"CMI: "<<centro->getX()<<", "<<centro->getY()<<", "<<centro->getZ()<<endl;
    double maiorX=this->vertices.at(0)->getX(), menorX = this->vertices.at(0)->getX(),
           maiorY=this->vertices.at(0)->getY(), menorY = this->vertices.at(0)->getY(),
           maiorZ=this->vertices.at(0)->getZ(), menorZ = this->vertices.at(0)->getZ();

    for(int j=0; j<this->nVertices; j++){
        if(vertices.at(j)->getX()>maiorX) maiorX = vertices.at(j)->getX();
        if(vertices.at(j)->getX()<menorX) menorX = vertices.at(j)->getX();
        if(vertices.at(j)->getY()>maiorY) maiorY = vertices.at(j)->getY();
        if(vertices.at(j)->getY()<menorY) menorY = vertices.at(j)->getY();
        if(vertices.at(j)->getZ()>maiorZ) maiorZ = vertices.at(j)->getZ();
        if(vertices.at(j)->getZ()<menorZ) menorZ = vertices.at(j)->getZ();
    }
    this->centro->setX((maiorX+menorX)/2.0);
    this->centro->setY((maiorY+menorY)/2.0);
    this->centro->setZ((maiorZ+menorZ)/2.0);
    cout<<"CMO: "<<centro->getX()<<", "<<centro->getY()<<", "<<centro->getZ()<<endl;
}

void Mesh::Scale(char op){
    this->Centro(); //Calcula o centro de massa
        for(int j=0; j<this->nVertices; j++){
            //cout<<"Original: "<<vertices.at(j)->getX()<<", "<<vertices.at(j)->getY()<<", "<<vertices.at(j)->getZ()<<endl;
            double x = vertices.at(j)->getX() - this->centro->getX();
            double y = vertices.at(j)->getY() - this->centro->getY();
            double z = vertices.at(j)->getZ() - this->centro->getZ();

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
            vertices.at(j)->setPosition(x+this->centro->getX(), y+this->centro->getY(), z+this->centro->getZ());
            //cout<<"New: "<<vertices.at(j)->getX()<<", "<<vertices.at(j)->getY()<<", "<<vertices.at(j)->getZ()<<endl;
        }
}

void Mesh::Rotate(char eixo, char op){
    double angulo = (1*PI)/180; //Angulo de inclinação EM RADIANOS
    this->Centro(); //Retorna o centro de massa do objeto
        for(int j=0; j<this->nVertices; j++){
            double x = vertices.at(j)->getX() - centro->getX();
            double y = vertices.at(j)->getY() - centro->getY();
            double z = vertices.at(j)->getZ() - centro->getZ();
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
            vertices.at(j)->setPosition(x+centro->getX(), y+centro->getY(), z+centro->getZ());
        }
}
