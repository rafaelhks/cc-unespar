#include <windows.h>
#include "Camera.h"
#include <GL/glut.h>
#define PI 3.14159265

Camera::Camera()
{
    //ctor
}

Camera::~Camera()
{
    //dtor
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
    Vector3 eVec;
    eVec.Set(eye.x, eye.y, eye.z); //vector version of eye
    m[0] = u.x; m[4] = u.y; m[8] = u.z; m[12] = -eVec.dot(u);
    m[1] = v.x; m[5] = v.y; m[9] = v.z; m[13] = -eVec.dot(v);
    m[2] = n.x; m[6] = n.y; m[10] = n.z; m[14] = -eVec.dot(n);
    m[3] = 0; m[7] = 0; m[11] = 0; m[15] = 1.0;
    glMatrixMode(GL_MODELVIEW);
    glLoadMatrixf(m);
}

void Camera::Set(Point3 Eye, Point3 look, Vector3 up){
    eye.Set(Eye);
    n.Set(eye.x-look.x, eye.y-look.y, eye.z-look.z); //n
    u.Set(up.cross(n).x, up.cross(n).y, up.cross(n).z); //u = up X n
    n.normalize(); u.normalize();
    v.Set(n.cross(u).x, n.cross(u).y, n.cross(u).z); //v = n X u
    setModelViewMatrix();
}
//o quanto vai andar em u,v,n
void Camera::slide(float deIU, float deIV, float deIN){
    eye.x += deIU*u.x + deIV*v.x + deIN*n.x;
    eye.y += deIU*u.y + deIV*v.y + deIN*n.y;
    eye.z += deIU*u.z + deIV*v.z + deIN*n.z;
    setModelViewMatrix();
}

void Camera::roll(float angle){
    float cs = cos(PI/180.0*angle);
    float sn = sin(PI/180.0*angle);
    Vector3 t = u;
    u.Set(cs*t.x - sn*v.x, cs*t.y - sn*v.y, cs*t.z - sn*v.z);
    v.Set(sn*t.x + cs*v.x, sn*t.y + cs*v.y, sn*t.z + cs*v.z);
    setModelViewMatrix();
}

void Camera::pitch(float angle){
    float cs = cos(PI/180.0*angle);
    float sn = sin(PI/180.0*angle);
    Vector3 t = v;
    v.Set(cs*t.x - sn*n.x, cs*t.y - sn*n.y, cs*t.z - sn*n.z);
    n.Set(sn*t.x + cs*n.x, sn*t.y + cs*n.y, sn*t.z + cs*n.z);
    setModelViewMatrix();
}

void Camera::yaw(float angle){
    float cs = cos(PI/180.0*angle);
    float sn = sin(PI/180.0*angle);
    Vector3 t = n;
    n.Set(cs*t.x - sn*u.x, cs*t.y - sn*u.y, cs*t.z - sn*u.z);
    u.Set(sn*t.x + cs*u.x, sn*t.y + cs*u.y, sn*t.z + cs*u.z);
    setModelViewMatrix();
}
