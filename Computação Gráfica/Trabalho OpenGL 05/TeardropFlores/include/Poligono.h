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
        void add(Pixel* p);
        void del(int pos);
        void angle(int a);
        void centro(Pixel* p);
        int angle();
        int total();
        Pixel* nucleo();
        Pixel* get(int pos);
        Pixel* centro();
        void nucleo(Pixel* p);
        virtual ~Poligono();

    private:
        Pixel* p_centro;
        int nPontos;
        vector<Pixel*> pontos;
        Pixel* p_nucleo;
        int angulo;
};

#endif // POLIGONO_H
