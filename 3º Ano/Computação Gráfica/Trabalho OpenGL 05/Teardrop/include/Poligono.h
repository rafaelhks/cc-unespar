#ifndef POLIGONO_H
#define POLIGONO_H
#include "Pixel.h"
#include <vector>
using namespace std;

struct ponto{
    int x, y;
};

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
        vector<Pixel*> pontos;
        Pixel* p_nucleo;
        int angulo, nPontos;
};

#endif // POLIGONO_H
