#include <windows.h>
#include <GL/glut.h>
#include <math.h>
#include <iostream>
#include <istream>
#include <fstream>
#include <vector>
#include "Mesh.h"
#include "Camera.h"
#include "Point3.h"
#define W 640
#define H 480
#define PI 3.14159265
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computação Gráfica - Ciência da Computação - Unespar Apucarana

char sentidoRotacao = 'h';
Mesh pl;
Camera *cam = new Camera();
Point3 eye, look;
Vector3 up;

//Função criada para desenhar linhas
void DrawLines(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela
    for(int i=0; i<pl.faces.size(); i++){ //Percorre o vector de faces
        face f = pl.faces.at(i); //face
        glBegin(GL_LINE_LOOP);
            glColor3f(0,1,0);
            for(int j=0; j<f.vertices.size(); j++){ //percorre os vertices da face
                //Pega os vertives correspondentes à face do vector de vertices da Mesh
                    glVertex3d(pl.vertices.at(f.vertices.at(j)).x,
                               pl.vertices.at(f.vertices.at(j)).y,
                               pl.vertices.at(f.vertices.at(j)).z);
            }
        glEnd();
    }
    //cout<<pl.centro.x<<" "<<pl.centro.y<<" "<<pl.centro.z<<endl ;
    glFlush();
    glutPostRedisplay();
}

void abreArquivo(){
    vertice v;
    face f;
    string charInutil, aux, nomeArquivo = "Cat.obj";

    ifstream arquivo;
    arquivo.open("OBJfiles/"+nomeArquivo); //Abre arquivo salvo

    if (arquivo.is_open()){ //Checa se arquivo está aberto
        cout<<"Arquivo "<<nomeArquivo<<" aberto com sucesso.\nObtendo dados..."<<endl;
        arquivo>>aux; //Inicia leitura dos dados do arquivo

        //vertices
        while(aux!="vt" && aux!="f"){
            if(aux=="v"){
                arquivo>>v.x>>v.y>>v.z;
                pl.vertices.push_back(v);
                //cout<<"v "<<v.x<<" "<<v.y<<" "<<v.z<<endl;
            }else{
                getline(arquivo, charInutil);
            }
            arquivo>>aux;
        }
        cout<<"Leitura dos vertices 'v' concluida..."<<endl;

        //vertices de textura
        while(aux!="f"){
            if(aux=="vt"){
                arquivo>>v.x>>v.y;
                v.z = 0.0;
                pl.vertices.push_back(v);
                //cout<<"vt "<<v.x<<" "<<v.y<<" "<<v.z<<endl;
            }else{
                getline(arquivo, charInutil);
            }
            arquivo>>aux;
        }
        cout<<"Leitura dos vertices 'vt' concluida..."<<endl;

        //faces
        while(!arquivo.eof()){
            if(aux=="f") {
                //cout<<"f ";
                arquivo>>aux;
                aux = aux.substr(0, aux.find("/"));
                f.vertices.push_back(stoi(aux)-1);
                //cout<<aux<<" ";

                arquivo>>aux;
                aux = aux.substr(0, aux.find("/"));
                f.vertices.push_back(stoi(aux)-1);
                //cout<<aux<<" ";

                arquivo>>aux;
                aux = aux.substr(0, aux.find("/"));
                f.vertices.push_back(stoi(aux)-1);
                //cout<<aux<<" "<<endl;

                pl.faces.push_back(f);
                f.vertices.clear();
            }else{
                getline(arquivo, charInutil);
            }
            arquivo>>aux;
        }
        cout<<"Leitura das faces concluida..."<<endl;
    }
    arquivo.close(); //Fecha o arquivo
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
    else if(key=='i') pl.Rotate('X', sentidoRotacao);
    else if(key=='j') pl.Rotate('Y', sentidoRotacao);
    else if(key=='k') pl.Rotate('Z', sentidoRotacao);
    else if(key=='E') pl.Scale('+');
    else if(key=='e') pl.Scale('-');
    else if(key=='Z') cam->slide(0,0,10);
    else if(key=='z') cam->slide(0,0,-10);
    else if(key=='P') cam->pitch(PI/6);
    else if(key=='p') cam->pitch(-PI/6);
    else if(key=='R') cam->roll(PI/6);
    else if(key=='r') cam->roll(-PI/6);
    else if(key=='Y') cam->yaw(PI/6);
    else if(key=='y') cam->yaw(-PI/6);
    else cout<<"Comando invalido!"<<endl;
}

void initCamera(){
    pl.Centro();
    eye.Set(0, 0, 200);
    look.Set(pl.centro.x, pl.centro.y, pl.centro.z);
    up.Set(0,look.y+1,0);
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
    gluLookAt(cam->eye.x, cam->eye.y, cam->eye.z, look.x, look.y, look.z, up.x, up.y, up.z);
    //glOrtho(-320, 320, -240, 240, 0, 640);
    glutKeyboardFunc(Keyboard);
}

int main(void){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um único plano, modelo RGB
    init(); //Função de inicialização
    glutMainLoop();
    return 0;
}
