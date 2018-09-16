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
        char angulo;
        ponto nucleo;
        vector<ponto> pontos;
        virtual ~Poligono();
};

#endif // POLIGONO_H
