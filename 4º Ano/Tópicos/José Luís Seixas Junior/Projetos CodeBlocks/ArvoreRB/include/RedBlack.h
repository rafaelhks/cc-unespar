#ifndef REDBLACK_H
#define REDBLACK_H
#include <vector>
#include "Noh.h"

class RedBlack
{
    public:
        void insertRaiz(Noh* n);
        void RightRB();
        void LeftRB();
        int getNumPretos();
        Noh* getRaiz();
        vector<Noh*>* getNohs();
        RedBlack();
        virtual ~RedBlack();

    private:
        Noh* raiz;
        int pretos;
        vector<Noh*> nohs;
};

#endif // REDBLACK_H
