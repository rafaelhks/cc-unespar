#ifndef VERTEX3D_H
#define VERTEX3D_H


class Vertex3D
{
    public:
        Vertex3D();
        Vertex3D(double x, double y, double z);
        double getX();
        double getY();
        double getZ();
        void setPosition(double x, double y, double z);
        void setX(double x);
        void setY(double y);
        void setZ(double z);
        virtual ~Vertex3D();

    private:
        double x, y, z;
};

#endif // VERTEX3D_H

