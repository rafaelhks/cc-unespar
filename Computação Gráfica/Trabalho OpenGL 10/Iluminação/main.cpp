#include <windows.h>
#include <gl/glut.h>
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
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

Scene cena;
Camera cam = cena.cam;
Point3 eye, look;
Vector3 up;
int old_x=0;
int old_y=0;
int mouseBT = 0;

//Função criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); //Limpa a tela
    cena.buildScene();
    glFlush();
    glutPostRedisplay();
}

void Light(){
    GLfloat luzAmbiente[4]={0.2,0.2,0.2,0.5};
	GLfloat luzDifusa[4]={0.7,0.7,0.7,0.5};	   // "cor"
	GLfloat luzEspecular[4]={0.5, 0.5, 0.5, 0.5};// "brilho"
    GLfloat posicaoLuz[4]={cam.viewAngle, cam.eye.x, cam.eye.y, cam.eye.z};

	// Capacidade de brilho do material
	GLfloat especularidade[4]={0.8,0.8,0.8,0.8};
	GLint especMaterial = 45;

 	// Especifica que a cor de fundo da janela será preta
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

	// Habilita o modelo de colorização
	glShadeModel(GL_SMOOTH);

	// Ativa o uso da luz
	glLightModelfv(GL_LIGHT_MODEL_AMBIENT, luzDifusa);

	// Define os parâmetros da luz
	glLightfv(GL_LIGHT0, GL_AMBIENT, luzAmbiente);
	glLightfv(GL_LIGHT0, GL_DIFFUSE, luzDifusa );
	glLightfv(GL_LIGHT0, GL_SPECULAR, luzEspecular );
    glLightfv(GL_LIGHT0, GL_POSITION, posicaoLuz );

	// Habilita a definição da cor do material a partir da cor corrente
	glEnable(GL_COLOR_MATERIAL);
	//Habilita o uso de iluminação
	glEnable(GL_LIGHTING);
	// Habilita a luz
	glEnable(GL_LIGHT0);
	// Habilita o depth-buffering
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
    }
    if(mouseBT == GLUT_RIGHT_BUTTON){
        if(x>old_x) cam.roll(-PI/6);
        if(x<old_x) cam.roll(PI/6);
    }
    if(mouseBT == GLUT_MIDDLE_BUTTON){
        if(y>old_y) cam.slide(0,0,1);
        if(y<old_y) cam.slide(0,0,-1);
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
    glutCreateWindow("Computação Gráfica - OpenGL C++ - Cena - Trabalho 09/1"); //Cria a janela
    menu(); //Mostra o menu de teclas de comando
    initCamera(); //Inicializa a Camera
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
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
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
