#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <math.h>
#include <vector>
#include <fstream>
#include "Pixel.h"
#define W 1080
#define H 480
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computa��o Gr�fica - Ci�ncia da Computa��o - Unespar Apucarana

vector<Pixel*> pixels;

void DrawLines(void){
    glMatrixMode(GL_MODELVIEW);
    glClear(GL_COLOR_BUFFER_BIT);

    glBegin(GL_LINE_STRIP);
        glColor3f(1,0,0);
        for(int j=1; j<(int)pixels.size(); j++){  //Percorre o vetor de pontos
            glVertex2i(pixels.at(j-1)->getX(), pixels.at(j-1)->getY());     //Primeiro ponto da linha
            glVertex2i(pixels.at(j)->getX(), pixels.at(j)->getY());     //Primeiro ponto da linha
        }
    glEnd();

    glFlush();
}

void FuncPoints(){ //Cria os pontos da fun��o
    pixels.clear();

    for(int x=-W/2; x<=W/2; x++){ //Limita a fun��o � largura da tela
        Pixel* p = new Pixel(x, tan(pow(7*x,2))+cos(x+7));
        pixels.push_back(p);
        cout<<p->getX()<<" "<<p->getY()<<endl;
    }

    cout<<"Func: tan(7x^2)+cos(x+7)"<<endl;
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(200,100); //Posicionamento da janela na tela
    glutCreateWindow("Computa��o Gr�fica - OpenGL - Trab 05/3"); //Cria a janela
    FuncPoints(); //Cria um poligono com os pontos da fun��o
    glutDisplayFunc(DrawLines); //Fun��o que desenha na tela
    glLoadIdentity();
    gluOrtho2D(-W/2, W/2, -H/2, H/2);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um �nico plano, modelo RGB
    init(); //Fun��o de inicializa��o
    glutMainLoop();
    return 0;
}
