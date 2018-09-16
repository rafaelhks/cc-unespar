#ifndef VECTOR3_H
#define VECTOR3_H
#include <math.h>

class Vector3
{
    public:
        Vector3();
        Vector3(double x, double y, double z);
        virtual ~Vector3();
        double x, y, z;
        void Set(double X, double Y, double Z);
        Vector3 cross(Vector3 v);
        void normalize();
        float dot(Vector3 v);
};

#endif // VECTOR3_H
