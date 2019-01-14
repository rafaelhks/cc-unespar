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
        void inline Verificar();

        bool insere(Noh* n);
        Noh* removeNoh(int v);
        Noh* irmao(Noh* n);
        Noh* busca(int tgt);
        Noh* maisDir(Noh* raizSub);

        Noh(int value);
        virtual ~Noh();

    private:
        int valor;
        bool preto; //true = preto, false = vermelho
        Noh* pai;
        Noh* filhoEsq;
        Noh* filhoDir;
};

#endif // NOH_H

