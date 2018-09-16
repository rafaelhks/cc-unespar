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

struct point{
    int x, y;
};
vector<Poligono> polis;

void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT);
        for(int i=0; i<polis.size(); i++){ //Percorre o vector de Poligonos
            Poligono td = polis.at(i);
            glBegin(GL_LINE_LOOP);
                glColor3f(0,0,0);
                glVertex2i(td.nucleo.x, td.nucleo.y);
                for(int j=0; j<td.pontos.size(); j++){ //Percorre o vector de pontos de cada Poligono
                    glVertex2i(td.pontos.at(j).x, td.pontos.at(j).y);
                }
            glEnd();
        }
    glFlush();
}

void TearDropA(int x, int y, int angulo, ponto centro){
    int r = 47, altura = 125, npontos = 180;
    Poligono td; //TearDrop
    td.nucleo.x = x;
    td.nucleo.y = y;

    for(int i = 90; i<185; i+=6){ //Cria os pontos do semi circulo
        ponto p; //Um ponto do circulo
        p.x = centro.x+r*cos(i);
        p.y = centro.y+r*sin(i);
        td.pontos.push_back(p);
    }
    polis.push_back(td);
}

void TearDropB(int x, int y, int inc){
    int r = 50, altura = 125, npontos = 180;
    Poligono td; //TearDrop
    ponto n; //Nucleo do Teardrop
    ponto centro; //Centro do semicirculo
    double angulo = 0;

    if(inc == 0){
        centro.x = x+altura+r/2;
        centro.y = y-r;
        angulo = -90;
        n.x = x+r/2;
        n.y = y-r;
    }/*else if(inc == 45){
        centro.x = x+altura+r;
        centro.y = y+altura-r+25;
        angulo = -70;
        n.x = x+r;
        n.y = y-r+20;
    }*/else if(inc == 90){
        centro.x = x+r;
        centro.y = y+altura;
        angulo = 6;
        n.x = x+r;
        n.y = y;
    }/*else if(inc == 135){
        centro.x = x-altura+25;
        centro.y = y+altura-25;
        angulo = 6.8;
        n.x = x-r;
        n.y = y+r/2;
    }*/else if(inc == 180){
        centro.x = x-altura;
        centro.y = y+r/2;
        angulo = 7.5;
        n.x = x;
        n.y = y+r/2;
    }/*else if(inc == 225){
        centro.x = x-altura+25;
        centro.y = y-altura+25;
        angulo = 8.2;
        n.x = x-r;
        n.y = y-r;
    }*/else if(inc == 270){
        centro.x = x-r/2;
        centro.y = y-altura-r/2;
        angulo = 9;
        n.x = x-r/2;
        n.y = y-r/2;
    }/*else if(inc == 315){
        centro.x = x+altura-25;
        centro.y = y-altura+25;
        angulo = 10;
    }*/

    td.nucleo = n;

    for(int i = 1; i<npontos; i++){
        ponto p; //Um ponto do circulo
        p.x = centro.x+r*cos(angulo);
        p.y = centro.y+r*sin(angulo);
        td.pontos.push_back(p);
        angulo+=PI/145;
        if(angulo>=360){
            angulo = 0;
        }
    }
    polis.push_back(td);
    DrawLines();
}

void Mouse(int bt, int state, int x, int y){
    if(bt == GLUT_LEFT_BUTTON && state == GLUT_DOWN){
        polis.clear();
        ponto centro;
        for(int i=0; i<270; i+=45){
            centro.x = x+125*cos(i);
            centro.y = (H-y)+125*sin(i);
            TearDropA(x, H-y, i, centro);
        }
        DrawLines();
    }
    if(bt == GLUT_RIGHT_BUTTON && state == GLUT_DOWN){
        polis.clear();
        for(int i=0; i<360; i+=90){
            TearDropB(x, H-y, i);
        }
    }
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 04/1"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glutMouseFunc(Mouse);
    gluOrtho2D(0,W, 0, H);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
