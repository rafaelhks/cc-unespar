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
Poligono td;
bool mouse_pressed;

void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT);
        glBegin(GL_LINE_LOOP);
            glColor3f(0,0,0);
            glVertex2d(td.nucleo.x, td.nucleo.y);
            for(int i=0; i<td.pontos.size(); i++){ //Percorre o vector de pontos do Poligono
                glVertex2d(td.pontos.at(i).x, td.pontos.at(i).y);
            }
        glEnd();
    glFlush();
    if(mouse_pressed){
        td.Rotate();
        glutPostRedisplay();
    }
}

void TearDrop(int inc){
    int r = 47, altura = 125, npontos = 180;
    ponto n; //Nucleo do Teardrop
    n.x = W/2;
    n.y = H/2;
    td.nucleo = n;

    ponto centro; //Centro do semicirculo
    double angulo = 0;
    //Ajustes de centro e angulo do semi circulo conforme angulo do teardrop
    if(inc == 0){
        centro.x = n.x+altura;
        centro.y = n.y;
        angulo = -90;
    }else if(inc == 45){
        centro.x = n.x+altura-30;
        centro.y = n.y+altura-30;
        angulo = -70;
    }else if(inc == 90){
        centro.x = n.x;
        centro.y = n.y+altura;
        angulo = 6;
    }else if(inc == 135){
        centro.x = n.x-altura+30;
        centro.y = n.y+altura-30;
        angulo = 6.8;
    }else if(inc == 180){
        centro.x = n.x-altura;
        centro.y = n.y;
        angulo = 7.5;
    }else if(inc == 225){
        centro.x = n.x-altura+30;
        centro.y = n.y-altura+30;
        angulo = 8.2;
    }else if(inc == 270){
        centro.x = n.x;
        centro.y = n.y-altura;
        angulo = 9;
    }else if(inc == 315){
        centro.x = n.x+altura-30;
        centro.y = n.y-altura+30;
        angulo = 10;
    }

    for(int i = 1; i<npontos; i++){ //Cria os pontos do semi circulo
        ponto p; //Um ponto do circulo
        p.x = centro.x+r*cos(angulo);
        p.y = centro.y+r*sin(angulo);
        td.pontos.push_back(p);
        angulo+=PI/145;
        if(angulo>=360){
            angulo = 0;
        }
    }
    td.pontos.push_back(td.nucleo);
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
    for(int i=0; i<360; i+=45){
        TearDrop(i);
    }
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
