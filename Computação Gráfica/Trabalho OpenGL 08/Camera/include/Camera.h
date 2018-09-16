#ifndef CAMERA_H
#define CAMERA_H
#include "Vector3.h"
#include "Point3.h"

class Camera
{
    public:
        Camera();
        virtual ~Camera();
        double viewAngle, aspect, nearDist, farDist;
        void Set(Point3 eye, Point3 look, Vector3 up);
        void roll(float angle);
        void pitch(float angle);
        void yaw(float angle);
        void slide(float deIU, float deIV, float deIN);
        void Rotate(Vector3 axis, float angle);
        void setShape(float vAngle, float asp, float nearD, float farD);
        Point3 eye;
        Vector3 u,v,n;
        void setModelViewMatrix();
};

#endif // CAMERA_H
