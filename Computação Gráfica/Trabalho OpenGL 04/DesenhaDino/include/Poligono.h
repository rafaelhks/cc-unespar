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
        vector<ponto> pontos;
        ponto nucleo;
        virtual ~Poligono();
};

#endif // POLIGONO_H
