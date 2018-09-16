#include<glu.h>
#include <glui.h>
#include <glut.h>
#include <math.h>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
#include "Camera.h"
#include "Point3.h"
#include "Scene.h"
#define W 640
#define H 480
#define PI 3.14159265
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computa��o Gr�fica - Ci�ncia da Computa��o - Unespar Apucarana

Scene cena;
Camera cam = cena.cam;
Point3 eye, look;
Vector3 up;
int old_x=0;
int old_y=0;
int mouseBT = 0;
GLfloat light_position[4], spotlight_direction[3];

//Fun��o criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); //Limpa a tela
    cena.buildScene();
    glFlush();
    glutPostRedisplay();
}

void Light(){
    GLfloat luzAmbiente[4]={0.2,0.2,0.2,0};
	GLfloat luzDifusa[4]={1.0,1.0,1.0,1};	   // "cor"
	GLfloat luzEspecular[4]={0.7, 0.7, 0.7, 1};// "brilho"

    light_position[0] = cam.eye.x;
    light_position[1] = cam.eye.y;
    light_position[2] = cam.eye.z;
    light_position[3] = 1.0;

    spotlight_direction[0] = -cam.n.x;
    spotlight_direction[1] = -cam.n.y;
    spotlight_direction[2] = -cam.n.z;

    glLightfv(GL_LIGHT0, GL_AMBIENT, luzAmbiente);
	glLightfv(GL_LIGHT0, GL_DIFFUSE, luzDifusa );
	glLightfv(GL_LIGHT0, GL_SPECULAR, luzEspecular );

    glLightfv( GL_LIGHT0, GL_POSITION, light_position );
    glLightfv( GL_LIGHT0, GL_SPOT_DIRECTION, spotlight_direction);
    glLightf ( GL_LIGHT0, GL_SPOT_EXPONENT , 1.0);
    glLightf ( GL_LIGHT0, GL_SPOT_CUTOFF, 10.0);

	//Habilita a defini��o da cor do material a partir da cor corrente
	glEnable(GL_COLOR_MATERIAL);
	//Habilita o uso de ilumina��o
	glEnable(GL_LIGHTING);
	//Habilita a luz
	glEnable(GL_LIGHT0);
	//Habilita o depth-buffering
	glEnable(GL_DEPTH_TEST);
}

void menu(){
    cout<<"-------Key Control-------"<<endl;
    cout<<"Z/z - Zoom In/ Zoom Out"<<endl;
    cout<<"P/p - Camera pitch."<<endl;
    cout<<"R/r - Camera roll."<<endl;
    cout<<"Y/y - Camera yaw."<<endl<<endl;
    cout<<"-------Mouse Control-------"<<endl;
    cout<<"Left Click + Move - Move Camera look"<<endl;
    cout<<"Right Click + Move - Camera roll"<<endl;
    cout<<"Wheel Click + Move - Zoom In/Out"<<endl;
}

void Keyboard(unsigned char key, int x, int y){
    if(key=='Z') cam.slide(0,0,1);
    else if(key=='z') cam.slide(0,0,-1);
    else if(key=='P') cam.pitch(PI/6);
    else if(key=='p') cam.pitch(-PI/6);
    else if(key=='R') cam.roll(PI/6);
    else if(key=='r') cam.roll(-PI/6);
    else if(key=='Y') cam.yaw(PI/6);
    else if(key=='y') cam.yaw(-PI/6);
    else cout<<"Comando invalido!"<<endl;
}

void Mouse(int button, int state, int x, int y) {
    old_x=x;
    old_y=y;
    if(state == GLUT_DOWN) mouseBT = button;
}

void Motion(int x, int y) {
    if(mouseBT == GLUT_LEFT_BUTTON) {
        int dx = old_x - x;
        int dy = old_y - y;
        cam.yaw(-dx);
        cam.pitch(-dy);
        Light();
    }
    if(mouseBT == GLUT_RIGHT_BUTTON){
        if(x>old_x) cam.roll(-PI/6);
        if(x<old_x) cam.roll(PI/6);
        Light();
    }
    if(mouseBT == GLUT_MIDDLE_BUTTON){
        if(y>old_y) cam.slide(0,0,1);
        if(y<old_y) cam.slide(0,0,-1);
        Light();
    }

    old_x = x;
    old_y = y;
}

void initCamera(){
    eye.Set(0,8, -15);
    look.Set(0, 0, 0);
    up.Set(0,0.1,0);
    cam.Set(eye, look, up);
    cam.setShape(90, 1, 0.1, 1000);
    cena.cam = cam;
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computa��o Gr�fica - Prova 2� Bimestre - Exerc�cio 2 - Rafael Francisco Ferreira"); //Cria a janela
    menu(); //Mostra o menu de teclas de comando
    initCamera(); //Inicializa a Camera
    glutDisplayFunc(DrawLines); //Fun��o que � chamada toda vez que houver uma itera��o na tela
    glutMouseFunc(Mouse);
    glutMotionFunc(Motion);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(cam.viewAngle, cam.aspect, cam.nearDist, cam.farDist);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluLookAt(cam.eye.x, cam.eye.y, cam.eye.z, look.x, look.y, look.z, up.x, up.y, up.z);
    glutKeyboardFunc(Keyboard);
    Light();
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um �nico plano, modelo RGB
    init(); //Fun��o de inicializa��o
    glutMainLoop();
    return 0;
}
