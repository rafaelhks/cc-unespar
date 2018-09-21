#include <windows.h>
#include "Camera.h"
#include <GL/glut.h>
#include <math.h>
#define PI 3.14159265

Camera::Camera(){}

Camera::Camera(Vertex3D* Eye, Vertex3D* look, Vertex3D* up)
{
    this->Set(Eye, look, up);
}

Camera::~Camera()
{
    //dtor
}

Vertex3D* Camera::getEye(){
    return this->eye;
}

Vertex3D* Camera::getLook(){
    return this->look;
}

Vertex3D* Camera::getUp(){
    return this->up;
}

void Camera::setShape(float vAngle, float asp, float nr, float fr){
    viewAngle = vAngle;
    aspect = asp;
    nearDist = nr;
    farDist = fr;
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(viewAngle, aspect, nearDist, farDist);
    glMatrixMode(GL_MODELVIEW);
}

void Camera::setModelViewMatrix(){
    float m[16];
    Vertex3D* eVec = new Vertex3D(eye->getX(), eye->getY(), eye->getZ()); //vector version of eye
    m[0] = u->getX(); m[4] = u->getY(); m[8] = u->getZ(); m[12] = -eVec->dot(u);
    m[1] = v->getX(); m[5] = v->getY(); m[9] = v->getZ(); m[13] = -eVec->dot(v);
    m[2] = n->getX(); m[6] = n->getY(); m[10] = n->getZ(); m[14] = -eVec->dot(n);
    m[3] = 0; m[7] = 0; m[11] = 0; m[15] = 1.0;
    glMatrixMode(GL_MODELVIEW);
    glLoadMatrixf(m);
}

void Camera::Set(Vertex3D* Eye, Vertex3D* Look, Vertex3D* Up){
    this->eye = Eye;
    this->look = Look;
    this->up = Up;
    this->n = new Vertex3D(eye->getX()-look->getX(), eye->getY()-look->getY(), eye->getZ()-look->getZ()); //n
    this->u = new Vertex3D(up->cross(n)->getX(), up->cross(n)->getY(), up->cross(n)->getZ()); //u = up X n
    n->normalize(); u->normalize();
    this->v = new Vertex3D(n->cross(u)->getX(), n->cross(u)->getY(), n->cross(u)->getZ()); //v = n X u
    //setModelViewMatrix();
}
//o quanto vai andar em u,v,n
void Camera::slide(float deIU, float deIV, float deIN){
    eye->setX(eye->getX() + (deIU*u->getX() + deIV*v->getX() + deIN*n->getX()));
    eye->setY(eye->getY() + (deIU*u->getY() + deIV*v->getY() + deIN*n->getY()));
    eye->setZ(eye->getZ() + (deIU*u->getZ() + deIV*v->getZ() + deIN*n->getZ()));
    setModelViewMatrix();
}

void Camera::roll(float angle){
    float cs = cos((angle*PI)/180.0);
    float sn = sin((angle*PI)/180.0);
    Vertex3D* t = u;
    u->setPosition(cs*t->getX() - sn*v->getX(), cs*t->getY() - sn*v->getY(), cs*t->getZ() - sn*v->getZ());
    v->setPosition(sn*t->getX() + cs*v->getX(), sn*t->getY() + cs*v->getY(), sn*t->getZ() + cs*v->getZ());
    setModelViewMatrix();
}

void Camera::pitch(float angle){
    float cs = cos((angle*PI)/180.0);
    float sn = sin((angle*PI)/180.0);
    Vertex3D* t = v;
    v->setPosition(cs*t->getX() - sn*n->getX(), cs*t->getY() - sn*n->getY(), cs*t->getZ() - sn*n->getZ());
    n->setPosition(sn*t->getX() + cs*n->getX(), sn*t->getY() + cs*n->getY(), sn*t->getZ() + cs*n->getZ());
    setModelViewMatrix();
}

void Camera::yaw(float angle){
    float cs = cos((angle*PI)/180.0);
    float sn = sin((angle*PI)/180.0);
    Vertex3D* t = n;
    n->setPosition(cs*t->getX() - sn*u->getX(), cs*t->getY() - sn*u->getY(), cs*t->getZ() - sn*u->getX());
    u->setPosition(sn*t->getX() + cs*u->getX(), sn*t->getY() + cs*u->getY(), sn*t->getZ() + cs*u->getX());
    setModelViewMatrix();
}
