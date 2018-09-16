#include <windows.h>
#include <gl\glut.h>
#include <iostream>
#include <vector>
#include "Pixel.h"
#define Altura 480
#define Largura 640
using namespace std;

int currentPos = 0, veloc = 10;
vector<Pixel*> points;
//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

//Função criada para desenhar pontos
void DrawPoints(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    glPointSize(5); //Define o tam anho do ponto como 5
    glBegin(GL_POINTS);
        for(int i=0; i<points.size(); i++){ //Percorre o vetor de pontos
            if(i==currentPos){
                glColor3f(0,1,0);
            }else{
                glColor3f(0,0,0);
            }
            glVertex2i(points.at(i)->getX(), points.at(i)->getY());
        }
    glEnd();
    glFlush();
}

void movimenta(char p){
    int cx = points.at(currentPos)->getX();
    int cy = points.at(currentPos)->getY();

    switch(p){
        case 'u':
            if(cy-veloc>0) points.at(currentPos)->setY(cy-veloc);
            break;
        case 'd':
            if(cy+veloc<Altura) points.at(currentPos)->setY(cy+veloc);
            break;
        case 'l':
            if(cx-veloc>0) points.at(currentPos)->setX(cx-veloc);
            break;
        case 'r':
            if(cx+veloc<Largura) points.at(currentPos)->setX(cx+veloc);
            break;
    }
    DrawPoints(); //Redesenha na tela
}

void removeNearest(int x, int y){
    double menorDist = points.at(0)->getEuclideanDist(x, y);
    int menorPos = 0;
    for(int i=1; i<points.size(); i++){
        double dist = points.at(i)->getEuclideanDist(x, y);
        if(dist < menorDist){
            menorDist = dist;
            menorPos = i;
        }
    }
    currentPos = menorPos;
}

void Mouse(int botao, int estado, int x, int y) //Executa ações referentes as entradas do teclado
{
    if(botao == GLUT_LEFT_BUTTON && estado == GLUT_DOWN){
        Pixel* pt = new Pixel(x,y);
        points.push_back(pt);
    }else if(botao == GLUT_RIGHT_BUTTON && estado == GLUT_DOWN){
        removeNearest(x,y);
    }
    DrawPoints(); //Chamada explícita à função de desenho
}

void Teclado(int tecla, int x, int y) //Executa ações referentes as entradas do teclado
{
    switch(tecla){
        case GLUT_KEY_PAGE_UP: //Aumenta velocidade
            veloc+=1;
            cout<<"Velocidade: "<<veloc<<endl;
            break;
        case GLUT_KEY_PAGE_DOWN: //Diminui a velocidade
            if(veloc-1>0)
                veloc-=1;
            cout<<"Velocidade: "<<veloc<<endl;
            break;
        case GLUT_KEY_UP:   //Para cima
            movimenta('u');
            break;
    	case GLUT_KEY_DOWN: //Para baixo
    	    movimenta('d');
            break;
    	case GLUT_KEY_LEFT:     //Para a esquerda
    	    movimenta('l');
            break;
        case GLUT_KEY_RIGHT:    //Para a direita
            movimenta('r');
            break;
    }
}

void init(){
    glutInitWindowSize(Largura, Altura); //Define o tamanho da tela
    glutInitWindowPosition(400,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 02"); //Cria a janela
    glutDisplayFunc(DrawPoints); //Função que é chamada toda vez que houver uma iteração na tela
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0,Largura,Altura,0);
    glutMouseFunc(Mouse);
    glutSpecialFunc(Teclado);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    cout<<"Utilize Page Up para aumentar a velocidade"<<endl;
    cout<<"Utilize Page Down para diminuir a velocidade"<<endl;
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
