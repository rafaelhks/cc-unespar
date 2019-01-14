#ifndef NOH_H
#define NOH_H

using namespace std;

class Noh
{
    public:
        Noh* getPai();
        Noh* getFilhoEsq();
        Noh* getFilhoDir();
        int getValor();
        int getBalanco();

        void setPai(Noh* pai);
        void setFilhoDir(Noh* filho);
        void setFilhoEsq(Noh* filho);
        void setBalanco(int v);
        void balancear(Noh* raizSub);

        bool insere(Noh* n);
        Noh* removeNoh(int v);

        Noh(int value);
        virtual ~Noh();

    private:
        int valor;
        int balanco;
        Noh* pai;
        Noh* filhoEsq;
        Noh* filhoDir;
};

#endif // NOH_H
