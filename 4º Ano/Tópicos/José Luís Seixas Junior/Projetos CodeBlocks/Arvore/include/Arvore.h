#ifndef ARVORE_H
#define ARVORE_H
#include <vector>
#include "Noh.h"

class Arvore
{
    public:
        void insertRaiz(Noh* n);
        Noh* getRaiz();
        vector<Noh*>* getNohs();
        void balanceamento();
        Arvore();
        virtual ~Arvore();

    private:
        Noh* raiz;
        vector<Noh*> nohs;
};

#endif // ARVORE_H
