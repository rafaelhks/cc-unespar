#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <math.h>
#include <vector>
#include "Poligono.h"
#define PI 3.14159265359
#define W 1080
#define H 720
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

vector<Poligono*> polis;

void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT);
        for(int i=0; i<polis.size(); i++){ //Percorre o vector de Poligonos
            glBegin(GL_LINE_LOOP);
                glColor3f(0,0,0);
                glVertex2i(polis.at(i)->nucleo()->getX(), polis.at(i)->nucleo()->getY());
                for(int j=0; j<polis.at(i)->total(); j++){ //Percorre o vector de pontos de cada Poligono
                    glVertex2i(polis.at(i)->get(j)->getX(), polis.at(i)->get(j)->getY());
                }
            glEnd();
        }
    glFlush();

    cout<<"Clique em algum lugar para desenhar um TearDrop"<<endl;
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
    if(bt == GLUT_LEFT_BUTTON && state == GLUT_DOWN){
        polis.clear();
        int h = 250, r = h/3, angulo = -65;
        TearDrop(x, y, h, r, angulo);
        DrawLines();
    }
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(0,0); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 04/1"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glutMouseFunc(Mouse);
    gluOrtho2D(0, W, H, 0);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
