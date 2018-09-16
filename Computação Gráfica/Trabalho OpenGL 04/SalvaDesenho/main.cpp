#include <windows.h>
#include <GL/glut.h>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
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

void saveFile(char path[]){
    ofstream arquivo;
    arquivo.open(path);
    arquivo<<"1"<<endl;
    arquivo<<pontos.size()<<endl;
    for(int i=0; i<(int)pontos.size(); i++){
        arquivo<<pontos.at(i)->getX()<<" "<<pontos.at(i)->getY()<<endl;
    }
    arquivo.close();
    cout<<"Arquivo salvo em: "<<path<<endl;
}

void loadFile(char path[]){
    int nPontos, nPolis;
    pontos.clear();

    ifstream arquivo;
    arquivo.open(path); //Abre o dino.dat

    if(arquivo.is_open()){ //Checa se arquivo está aberto
        arquivo>>nPolis; //Recebe a quantidade de núcleos
        cout<<nPolis<<endl;
        arquivo>>nPontos; //Recebe a quantidade de linhas por nucleo
        cout<<nPontos<<endl;

        for(int i=0; i<nPontos; i++){ //Percorre os núcleos
            int x, y;
            arquivo>>x>>y; //Ponto x>>y
            pontos.push_back(new Pixel(x,y)); //Adiciona o ponto ao vector
            cout<<x<<" "<<y<<endl;
        }
    }
    arquivo.close(); //Fecha o arquivo
    cout<<"Arquivo aberto: "<<path<<endl;
    DrawLines();
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

void Keyboard(unsigned char key, int x, int y){
    switch(key){
        case 's':
        case 'S':
            saveFile("C:\\Users\\rafae\\teste.txt");
            break;
        case 'o':
        case 'O':
            loadFile("C:\\Users\\rafae\\teste.txt");
            break;
        default:
            cout<<"Comando invalido!"<<endl;
            break;
    }
}

void init(){
    glutInitWindowSize(640, 480); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 03/1"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glutMouseFunc(Mouse);
    glutKeyboardFunc(Keyboard);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluOrtho2D(0,640,480,0);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
