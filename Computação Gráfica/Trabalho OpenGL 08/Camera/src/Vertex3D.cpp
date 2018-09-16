#include "Vertex3D.h"

Vertex3D::Vertex3D(){}
Vertex3D::Vertex3D(double x, double y , double z){
    this->x = x;
    this->y = y;
    this->z = z;
}

Vertex3D::~Vertex3D()
{
    //dtor
}

double Vertex3D::getX(){
    return this->x;
}

double Vertex3D::getY(){
    return this->y;
}

double Vertex3D::getZ(){
    return this->z;
}

void Vertex3D::setX(double x){
    this->x = x;
}

void Vertex3D::setY(double y){
    this->y = y;
}

void Vertex3D::setZ(double z){
    this->z = z;
}

void Vertex3D::setPosition(double x, double y, double z){
    this->x = x;
    this->y = y;
    this->z = z;
}
