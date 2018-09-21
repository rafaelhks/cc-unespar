#ifndef POLIGONO_H
#define POLIGONO_H
#include <vector>
#include <iostream>
#include <math.h>
#include "Pixel.h"
using namespace std;

class Poligono
{
    public:
        Poligono();
        void Translate(char dir);
        void Scale(char op);
        void Rotate(char op);
        int Area();
        int total();
        void Centro();
        Pixel* getPonto(int pos);
        void Remove(int pos);
        void add(Pixel* p);
        void clearAll();
        virtual ~Poligono();

    private:
        Pixel* centro;
        int nPontos;
        vector<Pixel*> pontos;
};

#endif // POLIGONO_H
