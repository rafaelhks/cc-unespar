#ifndef CAMERA_H
#define CAMERA_H
#include "Vertex3D.h"

class Camera
{
    public:
        Camera();
        Camera(Vertex3D* Eye, Vertex3D* look, Vertex3D* up);
        virtual ~Camera();
        double viewAngle, aspect, nearDist, farDist;
        void Set(Vertex3D* eye, Vertex3D* look, Vertex3D* up);
        void roll(float angle);
        void pitch(float angle);
        void yaw(float angle);
        void slide(float deIU, float deIV, float deIN);
        void Rotate(Vertex3D* axis, float angle);
        void setShape(float vAngle, float asp, float nearD, float farD);
        void setModelViewMatrix();
        Vertex3D* getEye();
        Vertex3D* getLook();
        Vertex3D* getUp();
    private:
        Vertex3D* eye;
        Vertex3D* look;
        Vertex3D* up;
        Vertex3D* u;
        Vertex3D* v;
        Vertex3D* n;
};

#endif // CAMERA_H
