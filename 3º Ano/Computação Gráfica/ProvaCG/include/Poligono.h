#ifndef POLIGONO_H
#define POLIGONO_H
#include <vector>
using namespace std;

struct ponto{
    double x, y;
};

class Poligono
{
    public:
        Poligono();
        int nPontos;
        ponto nucleo;
        vector<ponto> pontos;
        void Rotate();
        ponto Centro();
        virtual ~Poligono();
};

#endif // POLIGONO_H
