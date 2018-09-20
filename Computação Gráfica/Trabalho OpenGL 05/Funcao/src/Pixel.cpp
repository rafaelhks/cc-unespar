#include "Pixel.h"
#include <math.h>

Pixel::Pixel(int x, int y)
{
    this->x = x;
    this->y = y;
}

Pixel::~Pixel()
{
    //dtor
}

int Pixel::getX(){
    return this->x;
}

int Pixel::getY(){
    return this->y;
}

void Pixel::setX(int x){
    this->x = x;
}

void Pixel::setY(int y){
    this->y = y;
}

double Pixel::getEuclideanDist(int x1, int y1){
    return sqrt(pow((x1-this->x),2)+pow((y1-this->y),2));
}
