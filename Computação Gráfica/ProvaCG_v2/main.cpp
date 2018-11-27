#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <math.h>
#include <vector>
#include "Poligono.h"
#define PI 3.14159265359
#define H 480   //Altura da janela
#define W 640   //Largura da janela
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana
Poligono* td = new Poligono();
bool mouse_pressed;

void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT);
        for(int i=0; i<polis.size(); i++){ //Percorre o vector de Poligonos
            glBegin(GL_LINE_LOOP);
                glColor3f(0,0,0);
                glVertex2d(polis.at(i)->nucleo()->getX(), polis.at(i)->nucleo()->getY());
                for(int j=1; j<polis.at(i)->total(); j++){ //Percorre o vector de pontos de cada Poligono
                    glVertex2d(polis.at(i)->get(j)->getX(), polis.at(i)->get(j)->getY());
                }
            glEnd();
        }
    glFlush();
    if(mouse_pressed){
        td->Rotate();
        glutPostRedisplay();
    }
}

double DegreeToRad(double d){
    return (d*PI)/180;
}

void TearDrop(int x, int y, int h, int w, int inc){
    int r = w, altura = h;

    Poligono* td = new Poligono(); //TearDrop
    Pixel* nucleo = new Pixel(x, y);
    td->nucleo(nucleo);

    double cX = x+h*cos(DegreeToRad(inc));
    double cY = y+h*sin(DegreeToRad(inc));
    td->centro(new Pixel(cX, cY)); //Centro do semicirculo

    cout<<"Inclinação: "<<inc<<endl;

    for(int i = -110+inc; i<110+inc; i++){ //Cria os pontos do semi circulo
        double pX, pY;
        pX = cX+r*cos(DegreeToRad(i));
        pY = cY+r*sin(DegreeToRad(i));
        //cout<<p->getX()<<" "<<p->getY()<<endl;
        td->add(new Pixel(pX,pY));
    }

    polis.push_back(td);
}

void Mouse(int bt, int state, int x, int y){
    if(bt==GLUT_LEFT_BUTTON && state==GLUT_DOWN){
        mouse_pressed = true;
    }
    if(bt==GLUT_LEFT_BUTTON && state==GLUT_UP){
        mouse_pressed = false;
    }
    if(mouse_pressed) DrawLines();
}

void desenhaTear(){
    int h = 150, r = 55;

        for(int i=0; i<360; i+=45){
            TearDrop(x, y, h, r, i);
        }

        DrawLines();
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Prova"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    gluOrtho2D(0, W, 0, H);
    glutMouseFunc(Mouse);
    desenhaTear();
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
