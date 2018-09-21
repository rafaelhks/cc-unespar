#include <windows.h>
#include <GL/glut.h>
#include <math.h>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
#include "Mesh.h"
#include "Camera.h"
#include "Vertex3D.h"
#define W 640
#define H 480
#define PI 3.14159265
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

char sentidoRotacao = 'h';
Mesh* mesh = new Mesh();
Camera* cam = new Camera();

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
    cout<<"\nComandos:\n\nTecla i/j/k - Rotacionar obj no eixo X/Y/Z."<<endl;
    cout<<"Tecla E/e - Aumentar/Diminuir Escala do obj."<<endl;
    cout<<"Tecla h/a - Sent. de rotacao horario/anti-horario."<<endl;
    cout<<"Tecla Z/z - Zoom In/ Zoom Out"<<endl;
    cout<<"Tecla P/p - Camera pitch."<<endl;
    cout<<"Tecla R/r - Camera roll."<<endl;
    cout<<"Tecla Y/y - Camera yaw."<<endl;
}

void Keyboard(unsigned char key, int x, int y){
    if(key=='h') sentidoRotacao = 'h';
    else if(key=='a') sentidoRotacao = 'a';
    else if(key=='i') mesh->Rotate('X', sentidoRotacao);
    else if(key=='j') mesh->Rotate('Y', sentidoRotacao);
    else if(key=='k') mesh->Rotate('Z', sentidoRotacao);
    else if(key=='E') mesh->Scale('+');
    else if(key=='e') mesh->Scale('-');
    else if(key=='Z') cam->slide(0,0,10);
    else if(key=='z') cam->slide(0,0,-10);
    else if(key=='P') cam->pitch(5);
    else if(key=='p') cam->pitch(-5);
    else if(key=='R') cam->roll(5);
    else if(key=='r') cam->roll(-5);
    else if(key=='Y') cam->yaw(5);
    else if(key=='y') cam->yaw(-5);
    else cout<<"Comando invalido!"<<endl;
    DrawLines();
}

void initCamera(){
    Vertex3D* eye = new Vertex3D(0,0,200);
    Vertex3D* look = new Vertex3D(mesh->getCentro()->getX(),
                                  mesh->getCentro()->getY(),
                                  mesh->getCentro()->getZ());
    Vertex3D* up = new Vertex3D(0, look->getY()+1, 0);
    cam->Set(eye, look, up);
    cam->setShape(90, 1, 1, 1000);
}

void init(){
    glutInitWindowSize(W, H); //Define o tamanho da tela
    glutInitWindowPosition(300,100); //Posicionamento da janela na tela
    glutCreateWindow("Computação Gráfica - OpenGL C++ - Trabalho 07/1"); //Cria a janela
    abreArquivo(); //Abre o arquivo .obj
    menu(); //Mostra o menu de teclas de comando
    initCamera(); //Inicializa a Camera
    glutDisplayFunc(DrawLines); //Função que é chamada toda vez que houver uma iteração na tela
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(cam->viewAngle, cam->aspect, cam->nearDist, cam->farDist);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluLookAt(cam->getEye()->getX(), cam->getEye()->getY(), cam->getEye()->getZ(),
              cam->getLook()->getX(), cam->getLook()->getY(), cam->getLook()->getZ(),
              cam->getUp()->getX(), cam->getUp()->getY(), cam->getUp()->getZ());
    //glOrtho(-320, 320, -240, 240, 0, 640);
    glutKeyboardFunc(Keyboard);
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
