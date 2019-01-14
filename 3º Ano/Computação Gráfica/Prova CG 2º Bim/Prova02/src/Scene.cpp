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
    //Cadeira
    glPushMatrix();
        glColor3f(1,0.5,0);
        glTranslated(0,-2.5,2);
        Chair();
    glPopMatrix();
    //Mesa
    glPushMatrix();
        glColor3f(1,0.9,0.5);
        glTranslated(0,-0.5,0);
        Table();
    glPopMatrix();
    //TeaPot
    glPushMatrix();
        glColor3f(0,0.653,0.653);
        glTranslated(-4,5.6,0);
        glutSolidTeapot(1);
    glPopMatrix();
    //Piso
    glPushMatrix();
        glColor3f(0.8,0.8,0.8);
        Cube(0,-6,0, 30,1,25);
    glPopMatrix();
    //Paredes
    glPushMatrix();
        glColor3f(0.0,0.7,0.7);
        Cube(-14.5,0.225,0, 1,20,25);
        Cube(14.5,0.225,0, 1,20,25);
        Cube(0,0.225,12, 28,20,1);
    glPopMatrix();

//    //OBJETO NA PAREDE
//    glPushMatrix();
//        glColor3f(0.2,1,0);
//        glTranslated(0,10,11.5);
//        glBegin(GL_QUAD_STRIP);
//            for(int i=0; i<32; i++){
//                glVertex3d(PI*cos(i), PI*sin(i), 0);
//            }
//        glEnd();
//    glPopMatrix();
//
//    //OBJETO MATEMÁTICO
//    double r = 3, theta;
//
//    glPushMatrix();
//    glColor3f(1,1,1);
//    glScaled(0.5,0.5,0.5);
//        for(int i=0; i<360; i++){
//            glColor3d(1,1,1);
//            glRotated(1, 0,-1,0.1);
//            glTranslated(0,0.02,0);
//            glBegin(GL_POLYGON);
//                for(int j=0; j<360; j++){
//                    theta = r*PI*j/360;
//                    double x = r*cos(theta);
//                    double y = r*sin(theta);
//                    glVertex2d(x+3,y+10);
//                }
//            glEnd();
//        }
//    glPopMatrix();
}
