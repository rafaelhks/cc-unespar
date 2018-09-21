#include "Vertex3D.h"
#include <math.h>

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

Vertex3D* Vertex3D::cross(Vertex3D* v){
    //Vetorial
    double X = (y*v->getZ()) - (v->getY()*z);
//    Y = -((x*v.z) - (v.x*z));
    double Y = (z*v->getX()) - (v->getZ()*x);
    double Z = (x*v->getY()) - (v->getX()*y);
    return new Vertex3D(X,Y,Z);
}

void Vertex3D::normalize(){
    double modulo, soma = 0;
    soma = pow(x, 2) + pow(y, 2) + pow(z, 2);
    modulo = sqrt(soma);
    x = x/modulo;
    y = y/modulo;
    z = z/modulo;
}

float Vertex3D::dot(Vertex3D* vec){
    //Escalar
    return ((x*vec->getX())+(y*vec->getY())+(z*vec->getZ()));
}

