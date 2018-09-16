#include <windows.h>
#include <GL/glut.h>
#include <math.h>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
#include "Poligono.h"
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

int c = 0;
Poligono* p = new Poligono();

//Função criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    glColor3f(0,0,0); //Cor dos pontos

    if(p->total()==1){ //Desenha um ponto caso só tenha um
        glPointSize(5);
        glBegin(GL_POINTS);
        glVertex2i(p->getPonto(0)->getX(), p->getPonto(0)->getY());
    }else{
        glBegin(GL_LINES); //Desenha linhas caso tenha mais de 1 ponto
        for(int i=1; i<p->total(); i++){  //Percorre o vetor de pontos
            glVertex2i(p->getPonto(i-1)->getX(), p->getPonto(i-1)->getY());
            glVertex2i(p->getPonto(i)->getX(), p->getPonto(i)->getY());
        }
    }

    glEnd();
    glFlush();
}


void showMenu(){
    cout<<"Utilize O/o para abrir o arquivo."<<endl;
    cout<<"Utilize s/S para salvar o desenho no arquivo"<<endl;
    cout<<"Utilize r/R para rotacionar o desenho"<<endl;
    cout<<"Utilize e/E para escalar o desenho"<<endl;
    cout<<"Utilize as setas do teclado para transladar o desenho"<<endl;
}

void salvaArquivo(){
    ofstream arquivo;
    arquivo.open("Imagem.dat");
    arquivo<<"1"<<endl;
    arquivo<<p->total()<<endl;
    cout<<"Salvando arquivo."<<endl;
    for(int i=0; i<p->total(); i++){
        arquivo<<p->getPonto(i)->getX()<<" "<<p->getPonto(i)->getY()<<endl;
        cout<<".";
    }
    arquivo.close();
    cout<<"\nArquivo salvo."<<endl;
}

void abreArquivo(){
    int nPontos, nPolis;
    int x, y;
    p->clearAll();

    ifstream arquivo;
    arquivo.open("Imagem.dat"); //Abre arquivo salvo
    //arquivo.open("dino.dat"); //Abre o dino.dat

    if (arquivo.is_open()){ //Checa se arquivo está aberto
        arquivo>>nPolis; //Recebe a quantidade de núcleos
        cout<<nPolis<<endl;

        arquivo>>nPontos; //Recebe a quantidade de linhas por nucleo
        cout<<nPontos<<endl;

        for(int j=0; j<nPontos; j++){
            arquivo>>x>>y; //Ponto x e y
            p->add(new Pixel(x,y)); //Adiciona o ponto ao poligono
            cout<<x<<" "<<y<<endl;
        }
    }
    DrawLines();
    arquivo.close(); //Fecha o arquivo
    showMenu();
}

void removeNearest(int x, int y){
    double menorDist = p->getPonto(0)->getEuclideanDist(x, y);
    int menorPos = 0;
    for(int i=1; i<p->total(); i++){
        double dist =p->getPonto(i)->getEuclideanDist(x, y);
        if(dist < menorDist){
            menorDist = dist;
            menorPos = i;
        }
    }
    p->Remove(menorPos);
}

void Mouse(int botao, int estado, int x, int y) //Executa ações referentes as entradas do teclado
{
    if(botao == GLUT_LEFT_BUTTON && estado == GLUT_DOWN){
        Pixel* pt = new Pixel(x,y);
        p->add(pt);
    }else if(botao == GLUT_RIGHT_BUTTON && estado == GLUT_DOWN){
        removeNearest(x,y);
    }
    DrawLines(); //Chamada explícita à função de desenho
}

void Keyboard(unsigned char key, int x, int y){
    switch(key){
        case 's':
        case 'S':
            salvaArquivo();
            break;
        case 'o':
        case 'O':
            abreArquivo();
            break;
        case 'r':
            p->Rotate('a');
            break;
        case 'R':
            p->Rotate('h');
            break;
        case 'e':
            p->Scale('-');
            break;
        case 'E':
            p->Scale('+');
            break;
        default:
            cout<<"Comando invalido!"<<endl;
            break;
    }
    DrawLines();
}

void Special_Keyboard(int key, int x, int y){
    switch(key){
        case GLUT_KEY_UP:
            p->Translate('u');
            break;
        case GLUT_KEY_DOWN:
            p->Translate('d');
            break;
        case GLUT_KEY_LEFT:
            p->Translate('l');
            break;
        case GLUT_KEY_RIGHT:
            p->Translate('r');
            break;
        default:
            cout<<"Comando invalido!"<<endl;
            break;
    }
    DrawLines();
}

void init(){
    glutInitWindowSize(640, 480); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL - Trab 03/1"); //Cria a janela
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glutMouseFunc(Mouse);
    glutKeyboardFunc(Keyboard);
    glutSpecialFunc(Special_Keyboard);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluOrtho2D(0,640,480,0);
    glClearColor(1.0f,1.0f,1.0f,1.0f); //Cor de fundo inicial da tela (RGBA)
    showMenu();
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
