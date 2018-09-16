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
        ponto centro;
        int nPontos;
        ponto nucleo;
        vector<ponto> pontos;
        void Translate(char dir);
        void Scale(char op);
        void Rotate(char op);
        int Area();
        ponto Centro();
        virtual ~Poligono();
};

#endif // POLIGONO_H
