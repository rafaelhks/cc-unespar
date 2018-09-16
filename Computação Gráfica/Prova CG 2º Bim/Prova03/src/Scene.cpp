#include<glu.h>
#include <glui.h>
#include <glut.h>
#include <math.h>
#include <vector>
#include <iostream>
#include "Scene.h"
#include "Camera.h"
#include "Point3.h"
#define PI 3.14159265359
using namespace std;

Scene::Scene()
{
    //ctor
}

Scene::~Scene()
{
    //dtor
}

void Scene::Cube(double tX, double tY, double tZ, double sX, double sY, double sZ){
    glPushMatrix();
    //glColor3d(0.0, 1.0, 0.0);
    glScaled(sX,sY,sZ);
    glTranslated(tX, tY, tZ);
    glutSolidCube(1);
    glPopMatrix();
}

void Scene::Chair(){
    //(position, scale, rotation)
    //pés
    Cube(-2,0,0, 1,6,1);
    Cube(2,0,0, 1,6,1);
    Cube(2,0.25,3.8, 1,12,1);
    Cube(-2,0.25,3.8, 1,12,1);
    //fim pés
    //assento
    Cube(0,3,0.35, 5,1,5.5);
    //fim assento
    //encosto
    Cube(0,3,5, 4,2,0.8);
    Cube(0,4.2,5, 4,2,0.8);
    //fim encosto
}

void Scene::Table(){
    //pés
    Cube(-6,0,-3, 1,10,1);
    Cube(6,0,3, 1,10,1);
    Cube(-6,0,3, 1,10,1);
    Cube(6,0,-3, 1,10,1);
    //fim pés
    //topo
    Cube(0,5,0, 15,1,8);
    //fim topo
}

void Scene::buildScene(){
    //TeaPot
    glPushMatrix();
        glColor3f(0,0.653,0.653);
        glTranslated(-8,1,0);
        glutSolidTeapot(1);
    glPopMatrix();
    //Torus
    glPushMatrix();
        glColor3f(0,1.0,0.753);
        glTranslated(-4,1.5,0);
        glutSolidTorus(0.2,1,10,10);
    glPopMatrix();
    //Cube
    glPushMatrix();
        glColor3f(0,1.0,0.153);
        glTranslated(0,1.5,0);
        glScaled(1.3,1.3,1.3);
        glutSolidIcosahedron();
    glPopMatrix();
    //Dodecaedro
    glPushMatrix();
        glColor3f(1,0.753,0.253);
        glTranslated(4,2,0);
        glutSolidDodecahedron();
    glPopMatrix();
    //Esfera
    glPushMatrix();
        glColor3f(1,0.453,0.153);
        glTranslated(8,2,0);
        glutSolidSphere(1.7,45,45);
    glPopMatrix();
    //Piso
    glPushMatrix();
        glColor3f(0.8,0.8,0.8);
        Cube(0,0,0, 30,1,15);
    glPopMatrix();
}
