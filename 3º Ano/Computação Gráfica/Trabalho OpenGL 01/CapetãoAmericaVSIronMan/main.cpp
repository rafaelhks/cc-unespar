#include <windows.h>
#include <GL/glut.h>
#include <iostream>
using namespace std;

//Autor: Rafael Francisco Ferreira
//Computa��o Gr�fica - Ci�ncia da Computa��o - Unespar Apucarana

//Fun��o criada para desenhar quadrados/ret�ngulos
void DrawQuad(int x1, int x2, int y1, int y2){
    glVertex2i(x1,y1);
    glVertex2i(x2,y1);
    glVertex2i(x2,y2);
    glVertex2i(x1,y2);
}

//Desenha na tela
void Desenha(void){
    glClear(GL_COLOR_BUFFER_BIT); //Limpa a tela

    glBegin(GL_QUADS); //Inicia o desenho do fundo
        glColor3f(0.4f, 0.6f, 0.9f); //C�u
        DrawQuad(0, 65, 0, 18);
        glColor3f(0.3f, 0.9f, 0.2f); //Grama
        DrawQuad(0, 65, 15, 24);
        glColor3f(1.0f, 0.6f, 0.0f); //Sol
        DrawQuad(27, 39 ,13 ,15);
        DrawQuad(28, 38 ,12 ,13);
        DrawQuad(29, 37 ,11 ,12);
        DrawQuad(30, 36 ,10 ,11);
    glEnd(); //fim fundo

    glBegin(GL_QUADS); //Inicia o desenho dos her�is
        glColor3f(0.0f,0.0f,0.0f); //Pretos
        DrawQuad(12, 18, 1, 2);
        DrawQuad(48, 54, 1, 2);
        DrawQuad(9, 12, 2, 3);
        DrawQuad(9, 12, 2, 3);
        DrawQuad(18, 19, 2, 3);
        DrawQuad(47, 48, 2, 3);
        DrawQuad(54, 55, 2, 3);
        DrawQuad(8, 9, 3, 4);
        DrawQuad(19, 20, 3, 4);
        DrawQuad(46, 47, 3, 4);
        DrawQuad(55, 56, 3, 5);
        DrawQuad(9, 10, 4, 8);
        DrawQuad(20, 21, 4, 10);
        DrawQuad(45, 46, 4, 11);
        DrawQuad(56, 57, 5, 8);
        DrawQuad(7, 9, 6, 7);
        DrawQuad(57, 59, 6, 7);
        DrawQuad(5, 7, 7, 8);
        DrawQuad(37, 39, 7, 8);
        DrawQuad(59, 61, 7, 8);
        DrawQuad(4, 5, 8, 9);
        DrawQuad(10, 11, 8, 10);
        DrawQuad(15, 17, 8, 9);
        DrawQuad(18, 19, 8, 9);
        DrawQuad(21, 24, 8, 9);
        DrawQuad(36, 37, 8, 9);
        DrawQuad(39, 40, 8, 9);
        DrawQuad(55, 56, 8, 10);
        DrawQuad(61, 62, 8, 9);
        DrawQuad(3, 4, 9, 12);
        DrawQuad(24, 25, 9, 10);
        DrawQuad(37, 38, 9, 13);
        DrawQuad(40, 45, 9, 10);
        DrawQuad(62, 63, 9, 12);
        DrawQuad(8, 9, 10, 11);
        DrawQuad(11, 12, 10, 11);
        DrawQuad(14, 18, 10, 11);
        DrawQuad(19, 20, 10, 11);
        DrawQuad(25, 26, 10, 11);
        DrawQuad(42, 43, 10, 13);
        DrawQuad(45, 47, 10, 11);
        DrawQuad(54, 55, 10, 11);
        DrawQuad(57, 58, 10, 11);
        DrawQuad(7, 8, 11, 13);
        DrawQuad(9, 10, 11, 12);
        DrawQuad(12, 13, 11, 12);
        DrawQuad(18, 19, 11, 12);
        DrawQuad(26, 27, 11, 16);
        DrawQuad(47, 48, 11, 12);
        DrawQuad(53, 54, 11, 12);
        DrawQuad(56, 57, 11, 12);
        DrawQuad(58, 59, 11, 13);
        DrawQuad(4, 5, 12, 13);
        DrawQuad(10, 11, 12, 14);
        DrawQuad(13, 18, 12, 13);
        DrawQuad(48, 53, 12, 13);
        DrawQuad(55, 56, 12, 14);
        DrawQuad(61, 62, 12, 13);
        DrawQuad(5, 6, 13, 14);
        DrawQuad(38, 48, 13, 14);
        DrawQuad(60, 61, 13, 14);
        DrawQuad(6, 7, 14, 15);
        DrawQuad(9, 10, 14, 15);
        DrawQuad(17, 18, 14, 15);
        DrawQuad(47, 48, 14, 15);
        DrawQuad(56, 57, 14, 15);
        DrawQuad(59, 60, 14, 15);
        DrawQuad(7, 9, 15, 16);
        DrawQuad(16, 18, 15, 16);
        DrawQuad(48, 49, 15, 18);
        DrawQuad(57, 59, 15, 16);
        DrawQuad(8, 11, 16, 17);
        DrawQuad(16, 18, 16, 17);
        DrawQuad(25, 26, 16, 17);
        DrawQuad(56, 57, 16, 17);
        DrawQuad(7, 8, 17, 18);
        DrawQuad(11, 13, 17, 18);
        DrawQuad(15, 17, 17, 18);
        DrawQuad(18, 19, 17, 18);
        DrawQuad(24, 25, 17, 18);
        DrawQuad(57, 58, 17, 18);
        DrawQuad(6, 7, 18, 19);
        DrawQuad(17, 18, 18, 19);
        DrawQuad(19, 20, 18, 19);
        DrawQuad(23, 24, 18, 19);
        DrawQuad(47, 48, 18, 19);
        DrawQuad(58, 59, 18, 19);
        DrawQuad(5, 6, 19, 20);
        DrawQuad(11, 13, 19, 20);
        DrawQuad(18, 19, 19, 21);
        DrawQuad(20, 23, 19, 20);
        DrawQuad(46, 47, 19, 21);
        DrawQuad(52, 54, 19, 20);
        DrawQuad(59, 60, 19, 20);
        DrawQuad(3, 5, 20, 21);
        DrawQuad(10, 11, 20, 21);
        DrawQuad(13, 14, 20, 21);
        DrawQuad(51, 52, 20, 22);
        DrawQuad(54, 55, 20, 21);
        DrawQuad(60, 62, 20, 21);
        DrawQuad(1, 3, 21, 22);
        DrawQuad(9, 10, 21, 22);
        DrawQuad(12, 13, 21, 23);
        DrawQuad(17, 20, 21, 22);
        DrawQuad(45, 48, 21, 22);
        DrawQuad(55, 56, 21, 22);
        DrawQuad(62, 64, 21, 22);
        DrawQuad(0, 1, 22, 23);
        DrawQuad(8, 9, 22, 23);
        DrawQuad(20, 21, 22, 23);
        DrawQuad(44, 45, 22, 23);
        DrawQuad(52, 53, 22, 23);
        DrawQuad(56, 57, 22, 23);
        DrawQuad(64, 65, 22, 23);
        DrawQuad(0, 9, 23, 24);
        DrawQuad(12, 21, 23, 24);
        DrawQuad(44, 53, 23, 24);
        DrawQuad(56, 65, 23, 24);

        glColor3f(0.0f,0.0f,1.0f); //Azul Cap
        DrawQuad(12, 18, 2, 3);
        DrawQuad(11, 17, 3, 4);
        DrawQuad(18, 19, 3, 4);
        DrawQuad(12, 16, 4, 5);
        DrawQuad(17, 18, 4, 5);
        DrawQuad(19, 20, 4, 7);
        DrawQuad(10, 16, 5, 8);
        DrawQuad(17, 18, 6, 7);
        DrawQuad(7, 9, 7, 8);
        DrawQuad(16, 20, 7, 8);
        DrawQuad(7, 10, 8, 9);
        DrawQuad(11, 14, 8, 9);
        DrawQuad(17, 18, 8, 9);
        DrawQuad(8, 10, 9, 10);
        DrawQuad(11, 20, 9, 10);
        DrawQuad(9, 11, 10, 11);
        DrawQuad(12, 13, 10, 11);
        DrawQuad(10, 12, 11, 12);
        DrawQuad(11, 13, 12, 13);
        DrawQuad(21, 23, 12, 13);
        DrawQuad(11, 14, 13, 14);
        DrawQuad(16, 18, 13, 14);
        DrawQuad(21, 22, 13, 14);
        DrawQuad(12, 17, 14, 15);
        DrawQuad(22, 23, 14, 15);
        DrawQuad(21, 23, 15, 16);
        DrawQuad(8, 11, 17, 18);
        DrawQuad(7, 17, 18, 19);
        DrawQuad(8, 11, 19, 20);
        DrawQuad(13, 16, 19, 20);
        DrawQuad(9, 10, 20, 21);

        glColor3f(1.0f,1.0f,1.0f); //Brancos
        DrawQuad(9, 11, 3, 4);
        DrawQuad(17, 18, 3, 4);
        DrawQuad(10, 12, 4, 5);
        DrawQuad(16, 17, 4, 5);
        DrawQuad(18, 19, 4, 5);
        DrawQuad(16, 19, 5, 6);
        DrawQuad(16, 17, 6, 7);
        DrawQuad(18, 19, 6, 7);
        DrawQuad(5, 7, 8, 9);
        DrawQuad(14, 15, 8, 9);
        DrawQuad(19, 20, 8, 9);
        DrawQuad(6, 8, 9, 10);
        DrawQuad(7, 8, 10, 11);
        DrawQuad(21, 24, 10, 11);
        DrawQuad(20, 21, 11, 12);
        DrawQuad(24, 25, 11, 16);
        DrawQuad(19, 20, 12, 17);
        DrawQuad(14, 16, 13, 14);
        DrawQuad(22, 23, 13, 14);
        DrawQuad(10, 11, 14, 15);
        DrawQuad(21, 22, 14, 15);
        DrawQuad(9, 10, 15, 16);
        DrawQuad(11, 12, 15, 17);
        DrawQuad(13, 14, 15, 17);
        DrawQuad(15, 16, 15, 17);
        DrawQuad(23, 24, 16, 17);
        DrawQuad(20, 23, 17, 18);

        glColor3f(0.5f,0.5f,0.5f); //Cinza
        DrawQuad(13, 15, 17, 18);

        glColor3f(0.9f, 0.7f, 0.5f); //Tom de Pele
        DrawQuad(13, 14, 10, 11);
        DrawQuad(18, 19, 10, 11);
        DrawQuad(13, 18, 11, 12);

        glColor3f(1.0f,1.0f,0.0f); //Amarelo
        DrawQuad(49, 52, 3, 6);
        DrawQuad(46, 47, 4, 9);
        DrawQuad(47, 53, 6, 7);
        DrawQuad(48, 49, 7, 8);
        DrawQuad(48, 49, 7, 8);
        DrawQuad(51, 53, 7, 8);
        DrawQuad(58, 59, 7, 8);
        DrawQuad(47, 53, 8, 9);
        DrawQuad(58, 61, 8, 9);
        DrawQuad(47, 52, 9, 10);
        DrawQuad(59, 61, 9, 10);
        DrawQuad(43, 45, 10, 12);
        DrawQuad(47, 48, 10, 11);
        DrawQuad(51, 52, 10, 11);
        DrawQuad(48, 52, 11, 12);
        DrawQuad(49, 50, 17, 18);
        DrawQuad(56, 57, 17, 18);
        DrawQuad(48, 51, 18, 19);
        DrawQuad(55, 58, 18, 19);
        DrawQuad(49, 52, 19, 20);
        DrawQuad(54, 58, 19, 20);
        DrawQuad(55, 57, 20, 21);

        glColor3f(1.0f,0.0f,0.0f); //Vermelhos
        DrawQuad(48, 54, 2, 3);
        DrawQuad(47, 49, 3, 6);
        DrawQuad(52, 55, 3, 6);
        DrawQuad(55, 56, 5, 8);
        DrawQuad(53, 55, 6, 10);
        DrawQuad(57, 58, 7, 10);
        DrawQuad(37, 39, 8, 9);
        DrawQuad(56, 57, 8, 11);
        DrawQuad(4, 6, 9, 12);
        DrawQuad(21, 24, 9, 10);
        DrawQuad(39, 40, 9, 10);
        DrawQuad(58, 59, 9, 11);
        DrawQuad(61, 62, 9, 12);
        DrawQuad(52, 53, 9, 12);
        DrawQuad(46, 47, 9, 10);
        DrawQuad(6, 7, 10, 14);
        DrawQuad(4, 7, 10, 12);
        DrawQuad(20, 21, 10, 11);
        DrawQuad(24, 25, 10, 11);
        DrawQuad(53, 54, 10, 11);
        DrawQuad(39, 42, 10, 13);
        DrawQuad(55, 56, 10, 12);
        DrawQuad(59, 61, 10, 13);
        DrawQuad(8, 9, 11, 15);
        DrawQuad(19, 20, 11, 12);
        DrawQuad(21, 24, 11, 12);
        DrawQuad(25, 26, 11, 16);
        DrawQuad(45, 47, 11, 12);
        DrawQuad(54, 55, 11, 12);
        DrawQuad(57, 58, 11, 15);
        DrawQuad(5, 6, 12, 13);
        DrawQuad(9, 10, 12, 14);
        DrawQuad(18, 19, 12, 17);
        DrawQuad(20, 21, 12, 17);
        DrawQuad(23, 24, 12, 16);
        DrawQuad(38, 39, 12, 13);
        DrawQuad(43, 48, 12, 13);
        DrawQuad(53, 55, 12, 13);
        DrawQuad(56, 57, 12, 14);
        DrawQuad(7, 8, 13, 15);
        DrawQuad(48, 49, 13, 15);
        DrawQuad(52, 55, 13, 19);
        DrawQuad(58, 60, 13, 14);
        DrawQuad(11, 12, 14, 15);
        DrawQuad(49, 50, 14, 17);
        DrawQuad(51, 52, 14, 19);
        DrawQuad(55, 56, 14, 18);
        DrawQuad(58, 59, 14, 15);
        DrawQuad(10, 11, 15, 16);
        DrawQuad(12, 13, 15, 17);
        DrawQuad(14, 15, 15, 17);
        DrawQuad(50, 51, 15, 18);
        DrawQuad(56, 57, 15, 16);
        DrawQuad(21, 23, 16, 17);
        DrawQuad(24, 25, 16, 17);
        DrawQuad(19, 20, 17, 18);
        DrawQuad(23, 24, 17, 18);
        DrawQuad(20, 23, 18, 19);
        DrawQuad(6, 8, 19, 20);
        DrawQuad(16, 18, 19, 20);
        DrawQuad(47, 49, 19, 20);
        DrawQuad(58, 59, 19, 20);
        DrawQuad(5, 9, 20, 21);
        DrawQuad(14, 18, 20, 21);
        DrawQuad(47, 51, 20, 21);
        DrawQuad(57, 60, 20, 21);
        DrawQuad(3, 9, 21, 22);
        DrawQuad(13, 17, 21, 22);
        DrawQuad(48, 51, 21, 22);
        DrawQuad(56, 62, 21, 22);
        DrawQuad(1, 8, 22, 23);
        DrawQuad(13, 20, 22, 23);
        DrawQuad(45, 52, 22, 23);
        DrawQuad(57, 64, 22, 23);

        glColor3f(0.0f,1.0f,1.0f); //Azul Iron
        DrawQuad(47, 48, 7, 8);
        DrawQuad(49, 51, 7, 8);
        DrawQuad(38, 39, 9, 12);
        DrawQuad(48, 51, 10, 11);
        DrawQuad(49, 52, 13, 14);
        DrawQuad(50, 51, 14, 15);
    glEnd(); //fim her�is

    glFlush(); //Solicita que os comandos sejam carregados no buffer
}

void Teclado(unsigned char tecla, int x, int y) //Executa a��es referentes as entradas do teclado
{
    switch (tecla) {
        case 'T':
        case 't':
            glBegin(GL_QUADS); //Inicia desenho do tiro
                glColor3f(0.7f,1.0f,1.0f); //Centro
                DrawQuad(22, 38, 10, 11);
                glColor3f(0.0f,1.0f,1.0f); //Laterais
                DrawQuad(24, 25, 7, 8);
                DrawQuad(23, 24, 8, 9);
                DrawQuad(37, 38, 8, 9);
                DrawQuad(23, 38, 9, 10);
                DrawQuad(39, 40, 10, 11);
                DrawQuad(23, 38, 11, 12);
                DrawQuad(23, 24, 12, 13);
                DrawQuad(37, 38, 12, 13);
                DrawQuad(24, 25, 13, 14);
                DrawQuad(22, 23, 9, 10);
                DrawQuad(22, 23, 11, 12);
                DrawQuad(21, 22, 10, 11);
                DrawQuad(21, 22, 12, 13);
                DrawQuad(22, 23, 6, 7);
                DrawQuad(26, 27, 14, 15);
            glEnd(); //fim tiro
            break;
    }
    glFlush(); //Solicita que os comandos sejam carregados no buffer
}

void TecladoUp(unsigned char tecla, int x, int y) //Executa a��es referentes as entradas do teclado
{
    switch (tecla) {
        case 'T':
        case 't':
            Desenha(); //Chama a fun��o que redesenha na tela
            break;
    }
}

void init(){
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //Um �nico plano, modelo RGB
    glutInitWindowSize(900,300); //Define o tamanho da tela
    glutInitWindowPosition(200,100); //Posicionamento da janela na tela
    glutCreateWindow("Capet�o Am�rica VS. Iron Man"); //Cria a janela
    glutDisplayFunc(Desenha); //Fun��o que � chamada toda vez que houver uma itera��o na tela
    glutKeyboardFunc(Teclado); //
    //Fun��o que controla quando uma tecla for pressionada
    glutKeyboardUpFunc(TecladoUp); //Fun��o que controla quando uma tecla n�o estiver pressionada
    glMatrixMode(GL_PROJECTION); //Previne a modifica��o de tamanho da matriz ao redimensionar a tela
    glLoadIdentity(); //Substitui a matriz atual pela matriz identidade
    gluOrtho2D(0,65,24,0); //Plano cartesiano

    glClearColor(0.2f,0.6f,0.9f,1.0f); //Cor de fundo inicial da tela (RGBA)
}

int main(void){
    init(); //Fun��o de inicializa��o
    cout<<"Pressione t para atirar"<<endl;
    glutMainLoop();
    return 0;
}
