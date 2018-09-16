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

vector<Poligono> polis;
ponto vp;

void DrawLines(void){
    glMatrixMode(GL_MODELVIEW);
    glClear(GL_COLOR_BUFFER_BIT);

    vp.y = 0;
    for(int i=0; i<=30; i++){ //Linhas da matriz de dinos
        vp.x = 0;
        for(int j=0; j<=30; j++){ //Colunas da matriz de dino
            glViewport(vp.x, vp.y, 180, 100);
            for(int k=0; k<polis.size(); k++){ //Percorre o vector de Poligonos
                Poligono td = polis.at(k);
                glBegin(GL_LINE_STRIP);
                    glColor3f(0,0,0);
                    for(int l=0; l<td.pontos.size(); l++){ //Percorre o vector de pontos de cada Poligono
                        if(i%2==0){
                            glVertex2i(td.pontos.at(l).x, td.pontos.at(l).y); //Desenha o dino
                        }else{
                            glVertex2i(W-td.pontos.at(l).x-80, H-td.pontos.at(l).y); //Desenha o dino invertido
                        }
                    }
                glEnd();
            }
            vp.x+=150; //Incrementa o x da viewPort
        }
        if(i%2==0){ //Incrementa o y da viewPort (a cada duas linhas o incremento é maior)
            vp.y+=20;
        }else{
            vp.y+=120;
        }
    }
    glFlush();
}

void abreArquivo(){
    int nPolis;
    ponto p;

    ifstream arquivo;
    arquivo.open("dino.dat"); //Abre o dino.dat

    if(arquivo.is_open()){ //Checa se arquivo está aberto
        arquivo>>nPolis; //Recebe a quantidade de núcleos
        cout<<nPolis<<endl;
        for(int i=0; i<nPolis; i++){
            Poligono n;
            arquivo>>n.nPontos; //Recebe a quantidade de linhas por nucleo
            cout<<n.nPontos<<endl;
            for(int j=0; j<n.nPontos; j++){
                arquivo>>p.x>>p.y; //Ponto x>>y
                n.pontos.push_back(p); //Adiciona o ponto ao vector
                cout<<p.x<<" "<<p.y<<endl;
            }
            polis.push_back(n);
        }
    }else{
        cout<<"Falha ao abrir o arquivo!";
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
