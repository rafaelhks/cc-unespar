#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <math.h>
#include <vector>
#include <fstream>
#include "Poligono.h"
#define W 720
#define H 480
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

vector<Poligono*> polis;
Pixel* vp = new Pixel();

void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT);

    int h = glutGet(GLUT_WINDOW_HEIGHT);
    int w = glutGet(GLUT_WINDOW_WIDTH);

    vp->setY(0);
    for(int i=0; i<=(h/100)+3; i++){ //Linhas da matriz de dinos
        vp->setX(0);
        for(int j=0; j<=(w/180)+2; j++){ //Colunas da matriz de dino
            glViewport(vp->getX(), vp->getY(), 180, 100);
            for(int k=0; k<polis.size(); k++){ //Percorre o vector de Poligonos
                Poligono* td = polis.at(k);
                glBegin(GL_LINE_STRIP);
                    glColor3f(0,0,0);
                    for(int l=0; l<td->total(); l++){ //Percorre o vector de pontos de cada Poligono
                        if(i%2==0){
                            glVertex2i(td->get(l)->getX(), td->get(l)->getY()); //Desenha o dino
                        }else{
                            glVertex2i(W-td->get(l)->getX()-80, H-td->get(l)->getY()); //Desenha o dino invertido
                        }
                    }
                glEnd();
            }
            vp->setX(vp->getX()+150); //Incrementa o x da viewPort
        }
        if(i%2==0){ //Incrementa o y da viewPort (a cada duas linhas o incremento é maior)
            vp->setY(vp->getY()+20);
        }else{
            vp->setY(vp->getY()+120);
        }
    }
    glFlush();
}

void abreArquivo(){
    int nPontos, nPolis;

    ifstream arquivo;
    arquivo.open("dino.dat"); //Abre o dino.dat

    if(arquivo.is_open()){ //Checa se arquivo está aberto
        arquivo>>nPolis; //Recebe a quantidade de núcleos
        //cout<<nPolis<<endl;
        for(int i=0; i<nPolis; i++){ //Percorre os núcleos
            Poligono* dino = new Poligono();
            arquivo>>nPontos; //Recebe a quantidade de linhas por nucleo
            //cout<<nPontos<<endl;
            for(int j=0; j<nPontos; j++){
                int x, y;
                arquivo>>x>>y; //Ponto x>>y
                dino->add(new Pixel(x,y)); //Adiciona o ponto ao vector
                //cout<<x<<" "<<y<<endl;
            }
            polis.push_back(dino);
        }
    }
    arquivo.close(); //Fecha o arquivo
    DrawLines();
}

void myReshape(GLsizei w, GLsizei h){
    DrawLines();
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 05/4"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glutReshapeFunc(myReshape);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluOrtho2D(0, W, 0, H);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
    abreArquivo();
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
