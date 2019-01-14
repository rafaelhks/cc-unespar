#include "Vertex3D.h"

Vertex3D::Vertex3D(){}
Vertex3D::Vertex3D(double X, double Y, double Z){
    this->x = X;
    this->y = Y;
    this->z = Z;
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

void Vertex3D::setX(double X){
    this->x = X;
}

void Vertex3D::setY(double Y){
    this->y = Y;
}

void Vertex3D::setZ(double Z){
    this->z = Z;
}

void Vertex3D::setPosition(double X, double Y, double Z){
    this->x = X;
    this->y = Y;
    this->z = Z;
}

