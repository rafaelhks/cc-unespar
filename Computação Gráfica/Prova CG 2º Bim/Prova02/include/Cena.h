#ifndef CENA_H
#define CENA_H
#include "Mesh.h"
#include "Point3.h"
#include "Camera.h"

class Cena
{
    public:
        Cena();
        virtual ~Cena();
        vector<Mesh> objetos;
        Point3 origem;
        vector<Camera> cameras;

    protected:

    private:
};

#endif // CENA_H
