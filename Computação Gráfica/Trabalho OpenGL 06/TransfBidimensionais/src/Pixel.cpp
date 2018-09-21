#include "Pixel.h"
#include <math.h>

Pixel::Pixel(){}

Pixel::Pixel(double x, double y)
{
    this->x = x;
    this->y = y;
}

Pixel::~Pixel()
{
    //dtor
}

double Pixel::getX(){
    return this->x;
}

double Pixel::getY(){
    return this->y;
}

void Pixel::setX(double x){
    this->x = x;
}

void Pixel::setY(double y){
    this->y = y;
}

double Pixel::getEuclideanDist(double x1, double y1){
    return sqrt(pow((x1-this->x),2)+pow((y1-this->y),2));
}
