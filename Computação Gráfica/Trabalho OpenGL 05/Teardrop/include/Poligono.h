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
        int angle();
        int total();
        Pixel* nucleo();
        Pixel* get(int pos);
        void nucleo(Pixel* p);
        virtual ~Poligono();
    private:
        vector<Pixel*> pontos;
        Pixel* p_nucleo;
        int angulo, nPontos;
};

#endif // POLIGONO_H
