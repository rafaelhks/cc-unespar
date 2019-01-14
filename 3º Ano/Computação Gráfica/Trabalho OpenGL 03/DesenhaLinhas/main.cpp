#include <windows.h> //Necess�rio em algumas vers�es do GLUT
#include <GL/glut.h>
#include <vector>
#define Altura 480
#define Largura 640
#include "Pixel.h"
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computa��o Gr�fica - Ci�ncia da Computa��o - Unespar Apucarana

vector<Pixel*> pontos;

//Fun��o criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    glColor3f(0,0,0); //Cor dos pontos

    if(pontos.size()==1){ //Desenha um ponto caso s� tenha um
        glPointSize(5);
        glBegin(GL_POINTS);

        glVertex2i(pontos.at(0)->getX(), pontos.at(0)->getY());
    }else{
        glBegin(GL_LINES); //Desenha linhas caso tenha mais de 1 ponto
        for(int i=1; i<pontos.size(); i++){  //Percorre o vetor de pontos
            glVertex2i(pontos.at(i-1)->getX(), pontos.at(i-1)->getY());
            glVertex2i(pontos.at(i)->getX(), pontos.at(i)->getY());
        }
    }

    glEnd();
    glFlush();
}

void removeNearest(int x, int y){
    double menorDist = pontos.at(0)->getEuclideanDist(x, y);
    int menorPos = 0;
    for(int i=1; i<pontos.size(); i++){
        double dist = pontos.at(i)->getEuclideanDist(x, y);
        if(dist < menorDist){
            menorDist = dist;
            menorPos = i;
        }
    }
    pontos.erase(pontos.begin()+menorPos);
}

void Mouse(int botao, int estado, int x, int y) //Executa a��es referentes as entradas do teclado
{
    if(botao == GLUT_LEFT_BUTTON && estado == GLUT_DOWN){
        Pixel* pt = new Pixel(x,y);
        pontos.push_back(pt);
    }else if(botao == GLUT_RIGHT_BUTTON && estado == GLUT_DOWN){
        removeNearest(x,y);
    }
    DrawLines(); //Chamada expl�cita � fun��o de desenho
}

void init(){
    glutInitWindowSize(Largura, Altura); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computa��o Gr�fica - OpenGL - Trab 02"); //Cria a janela
    glutDisplayFunc(DrawLines); //Fun��o que � chamada toda vez que houver uma itera��o na tela
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0,Largura,Altura,0);
    glutMouseFunc(Mouse);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um �nico plano, modelo RGB
    init(); //Fun��o de inicializa��o
    glutMainLoop();
    return 0;
}
