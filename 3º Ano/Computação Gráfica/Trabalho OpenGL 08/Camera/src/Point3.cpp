#include "Point3.h"

Point3::Point3()
{
    //ctor
}

Point3::~Point3()
{
    //dtor
}

void Point3::Set(Point3 aux){
    x = aux.x;  y = aux.y;  z = aux.z;
}

void Point3::Set(double X, double Y, double Z){
    x = X;  y = Y;  z = Z;
}
