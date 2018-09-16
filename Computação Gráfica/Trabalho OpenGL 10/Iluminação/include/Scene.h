#ifndef SCENE_H
#define SCENE_H
#include "Camera.h"
#include "Point3.h"

class Scene
{
    public:
        Scene();
        virtual ~Scene();
        Point3 origem;
        void Cube(double tX, double tY, double tZ, double sX, double sY, double sZ);
        Camera cam;
        void Chair();
        void Table();
        void buildScene();

    protected:

    private:
};

#endif // SCENE_H
