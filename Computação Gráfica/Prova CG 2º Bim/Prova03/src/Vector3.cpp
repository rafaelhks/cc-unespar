#include "Vector3.h"
#include <math.h>

Vector3::Vector3(){}

Vector3::Vector3(double X, double Y, double Z){
    x = X;  y = Y;  z = Z;
}

Vector3::~Vector3(){}

void Vector3::Set(double X, double Y, double Z){
    x = X;
    y = Y;
    z = Z;
}

Vector3 Vector3::cross(Vector3 v){
    Vector3 aux;
    //Vetorial
    aux.x = (y*v.z) - (v.y*z);
//    aux.y = -((x*v.z) - (v.x*z));
    aux.y = (z*v.x) - (v.z*x);
    aux.z = (x*v.y) - (v.x*y);
    return aux;
}

void Vector3::normalize(){
    double modulo, soma = 0;
    soma = pow(x, 2) + pow(y, 2) + pow(z, 2);
    modulo = sqrt(soma);
    x = x/modulo;
    y = y/modulo;
    z = z/modulo;
}

float Vector3::dot(Vector3 vec){
    //Escalar
    return ((x*vec.x)+(y*vec.y)+(z*vec.z));
}

