#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <fstream>
#include <vector>
#include "Pixel.h"
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computa��o Gr�fica - Ci�ncia da Computa��o - Unespar Apucarana

struct nucleo{
    vector<Pixel*> pontos;
};
vector<nucleo> nucleos; //Vetor de nucleos

//Fun��o criada para desenhar linhas
void DrawLine(void){
    nucleo n;

    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
        for(int i = 0; i<(int)nucleos.size(); i++){ //Percorre o vetor de nucleos
            n = nucleos.at(i); //bloco
            glBegin(GL_LINE_STRIP);
                glColor3f(0,0,0);
                for(int j=0; j<(int)n.pontos.size(); j++){  //Percorre o vetor de pontos
                    glVertex2i(n.pontos.at(j)->getX(), n.pontos.at(j)->getY());     //Ponto da linha
                }
            glEnd(); //Fecha o desenho de um bloco para impedir que todos os blocos sejam conectados.
        }
    glFlush();
}

void abreArquivo(){
    int nPontos, nPolis;

    ifstream arquivo;
    arquivo.open("dino.dat"); //Abre o dino.dat

    if(arquivo.is_open()){ //Checa se arquivo est� aberto
        arquivo>>nPolis; //Recebe a quantidade de n�cleos
        cout<<nPolis<<endl;
        for(int i=0; i<nPolis; i++){ //Percorre os n�cleos
            nucleo n;
            arquivo>>nPontos; //Recebe a quantidade de linhas por nucleo
            cout<<nPontos<<endl;
            for(int j=0; j<nPontos; j++){
                int x, y;
                arquivo>>x>>y; //Ponto x>>y
                n.pontos.push_back(new Pixel(x,y)); //Adiciona o ponto ao vector
                cout<<x<<" "<<y<<endl;
            }
            nucleos.push_back(n);
        }
    }
    arquivo.close(); //Fecha o arquivo
    DrawLine();
}

void init(){
    glutInitWindowSize(640, 480); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computa��o Gr�fica - OpenGL - Trab 03/1"); //Cria a janela
    glutDisplayFunc(DrawLine); //Fun��o que � chamada toda vez que houver uma itera��o na tela
    abreArquivo();
    gluOrtho2D(0,640,0,480);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um �nico plano, modelo RGB
    init(); //Fun��o de inicializa��o
    glutMainLoop();
    return 0;
}
