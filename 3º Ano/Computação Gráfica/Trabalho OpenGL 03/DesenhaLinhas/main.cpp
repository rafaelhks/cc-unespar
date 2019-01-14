#include <windows.h> //Necessário em algumas versões do GLUT
#include <GL/glut.h>
#include <vector>
#define Altura 480
#define Largura 640
#include "Pixel.h"
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

vector<Pixel*> pontos;

//Função criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    glColor3f(0,0,0); //Cor dos pontos

    if(pontos.size()==1){ //Desenha um ponto caso só tenha um
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

void Mouse(int botao, int estado, int x, int y) //Executa ações referentes as entradas do teclado
{
    if(botao == GLUT_LEFT_BUTTON && estado == GLUT_DOWN){
        Pixel* pt = new Pixel(x,y);
        pontos.push_back(pt);
    }else if(botao == GLUT_RIGHT_BUTTON && estado == GLUT_DOWN){
        removeNearest(x,y);
    }
    DrawLines(); //Chamada explícita à função de desenho
}

void init(){
    glutInitWindowSize(Largura, Altura); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 02"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0,Largura,Altura,0);
    glutMouseFunc(Mouse);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
