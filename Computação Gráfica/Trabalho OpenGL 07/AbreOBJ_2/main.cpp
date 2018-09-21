#include <windows.h>
#include <GL/glut.h>
#include <math.h>
#include <cmath>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
#include <string>
#include "Mesh.h"
#define W 640
#define H 480

using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

char sentidoRotacao = 'h';
Mesh* mesh = new Mesh();

//Função criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    for(int i=0; i<mesh->faceTotal(); i++){
        Face* f = mesh->getFace(i);
        glBegin(GL_LINE_LOOP);
            glColor3f(0,1,0);
            for(int j=0; j<f->total(); j++){
                glVertex3d(mesh->getVertex(f->get(j))->getX(),
                           mesh->getVertex(f->get(j))->getY(),
                           mesh->getVertex(f->get(j))->getZ());
            }
        glEnd();
    }
    glFlush();
}

void abreArquivo(){
    string charInutil, aux, nomeArquivo = "dodge_viper.obj";
    string fname = "OBJfiles/"+nomeArquivo;

    ifstream arquivo;
    arquivo.open("OBJfiles\\dodge_viper.obj"); //Abre arquivo salvo

    if (arquivo.is_open()){ //Checa se arquivo está aberto
        cout<<"Arquivo "<<nomeArquivo<<" aberto com sucesso.\nObtendo dados..."<<endl;
        arquivo>>aux; //Inicia leitura dos dados do arquivo

        //vertices
        while(aux!="vt" && aux!="f"){
            if(aux=="v"){
                double x, y, z;
                arquivo>>x>>y>>z;
                mesh->addVertex(x,y,z);
                //cout<<"v "<<x<<" "<<y<<" "<<z<<endl;
            }else{
                getline(arquivo, charInutil);
            }
            arquivo>>aux;
        }
        cout<<"Leitura dos vertices 'v' concluida..."<<endl;

        //vertices de textura
        while(aux!="f"){
            if(aux=="vt"){
                double x, y, z;
                arquivo>>x>>y;
                mesh->addVertex(x,y,0.0);
                //cout<<"vt "<<x<<" "<<y<<" "<<z<<endl;
            }else{
                getline(arquivo, charInutil);
            }
            arquivo>>aux;
        }
        cout<<"Leitura dos vertices 'vt' concluida..."<<endl;

        //faces
        while(!arquivo.eof()){
            if(aux=="f") {
                Face* f = new Face();
                //cout<<"f ";
                arquivo>>aux;
                while(aux!="f" && !arquivo.eof()){
                    aux = aux.substr(0, aux.find("/"));
                    //cout<<stoi(aux)<<" ";
                    f->Add(stoi(aux)-1);
                    arquivo>>aux;
                }
                //cout<<endl;
                mesh->addFace(f);
                if(aux!="f"){
                    arquivo>>aux;
                }
            }else{
                getline(arquivo, charInutil);
            }
           // arquivo>>aux;
        }
        cout<<"Leitura das faces concluida..."<<endl;
    }
    arquivo.close(); //Fecha o arquivo

    mesh->Centro();
    cout<<"Arquivo "<<nomeArquivo<<" fechado."<<endl;

    DrawLines();
}

void menu(){
    cout<<"\nComandos:\n\nTecla X - Rotacionar no eixo X."<<endl;
    cout<<"Tecla Y - Rotacionar no eixo Y."<<endl;
    cout<<"Tecla Z - Rotacionar no eixo Z."<<endl;
    cout<<"Tecla E - Aumentar Escala."<<endl;
    cout<<"Tecla e - Diminuir Escala."<<endl;
    cout<<"Tecla h - Sentido de rotacao = horario."<<endl;
    cout<<"Tecla a - Sentido de rotacao = anti-horario."<<endl;
}

void Keyboard(unsigned char key, int x, int y){
    if(key=='h') sentidoRotacao = 'h';
    else if(key=='a') sentidoRotacao = 'a';
    else if(key=='X' || key=='x') mesh->Rotate('X', sentidoRotacao);
    else if(key=='Y' || key=='y') mesh->Rotate('Y', sentidoRotacao);
    else if(key=='Z' || key=='z') mesh->Rotate('Z', sentidoRotacao);
    else if(key=='E') mesh->Scale('+');
    else if(key=='e') mesh->Scale('-');
    else cout<<"Comando invalido!"<<endl;
    DrawLines();
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL C++ - Trabalho 07/1"); //Cria a janela
    abreArquivo(); //Abre o arquivo .obj
    menu(); //Mostra o menu de teclas de comando
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    glOrtho(-200, 200, -150, 150, 640, -640);
    glutKeyboardFunc(Keyboard);
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
