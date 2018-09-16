#ifndef POLIGONO_H
#define POLIGONO_H
#include <vector>
using namespace std;

struct ponto{
    int x, y;
};

class Poligono
{
    public:
        Poligono();
        ponto nucleo;
        int angulo;
        vector<ponto> pontos;
        virtual ~Poligono();
};

#endif // POLIGONO_H
