#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>
#include <ctype.h>

//Rafael Francisco Ferreira - Compiladores - 3 ano C.C. Unespar 

char look; //(lookahead)
int labelCount;

//Protótipos
void init();
void nextChar();
void error(char *fmt, ...);
void fatal(char *fmt,...);
void expected(char *fmt,...);
void match(char c);
char getName();
char getNum();
void emit(char *fmt,...);
void other(); 
void program();
void block();
int newLabel();
int postLabel (int lbl);
void doIf();
void condition();
void expression();
void doWhile();
void doLoop();
void doRepeat();
void doFor();
void doDo();

//Progama Principal
int main()
{
	init();
	program();
	return 0;
}

/* Gera um novo rótulo único */
int newLabel()
{
	return labelCount++;
}

/* Emite um rótulo*/
int postLabel (int lbl)
{
	printf("L%d: \n", lbl);
}

/* Analisa e traduz um REPEAT-UNTIL*/ 
void doRepeat()
{
	int l;
	match('r');
	l = newLabel(); 
	postLabel(l); 
	block(); 
	match('u'); 
	condition(); 
	emit("JZ L%d", l);
}

void expression()
{ 
	emit("#EXPR");
}

void condition()
{
	emit ("# condition");
}

/*Analisa e traduz um comando IF */
void doIf()
{
	int l1,l2;
	match ('i');
	condition();
	l1= newLabel();
	l2= l1;
	emit ("JZ L%d", l1);
	block();
	
	if (look == 'l'){
		match ('l');
		l2 = newLabel();
		emit ("JMP L%d", l2);
		postLabel(l1);
		block();
	}
	match('e');
	postLabel(l2);
}

/*Reconhece e traduz um comando qualquer */
void other ()
{
	emit ("# %c", getName());
}

/*Analisa e traduz um programa completo*/
void program()
{
	block();
	if (look != 'e' )
		expected ("End");
	emit ("END");	
}

/*Analisa e traduz um bloco de comandos */ 
void block()
{
	int follow;
	follow = 0;
	while (!follow) { 
		switch (look) {
		case 'i':
			doIf();
			break;
		case 'w':
			doWhile(); 
 			break;
		case 'p':
			doLoop(); 
			break; 
		case 'r':
			doRepeat(); 
			break;
		case 'f':
			doFor(); 
			break;
		case 'd':
			doDo(); 
			break;
		case 'e':
		case 'l':
		case 'u':
			follow = 1; 
			break;	
		default:
			other(); 
			break;
		}
	}
}

//Inicialização do compilador
void init()
{
	labelCount = 0;
	nextChar();
}

//Lê próximo caracter da entrada
void nextChar()
{
	look = getchar();
}

//Exibe uma mensagem de erro formatada
void error(char *fmt,...)
{
	va_list args;
	fputs("Error: ", stderr);
	va_start(args, fmt);
	vfprintf(stderr, fmt, args);
	va_end(args);
	fputc('\n', stderr);
}

//Exibe uma mensagem de erro formatada e sai
void fatal(char *fmt, ...)
{
	va_list args;
	fputs("Error: ", stderr);
	va_start(args, fmt);
	vfprintf(stderr, fmt, args); 
	va_end(args);
	fputc('\n', stderr);
	exit(1);
}

//Alerta sobre alguma entrada esperada
void expected(char *fmt,...)
{
	va_list args;
	fputs("Error: ", stderr);
	va_start(args, fmt);
	vfprintf(stderr, fmt, args);
	va_end(args);
	fputs("expected!\n", stderr);
	exit(1);
}

//Verifica se entrada combina com o esperado
void match(char c)
{
	if (look != c)
		expected("%c", c);
	nextChar();
}

//Recebe o nome de um identificador
char getName()
{
	char name;

	if(!isalpha(look))
		expected("Name");
	name=toupper(look);
	nextChar();
	return name;
}

//Recebe um numero inteiro
char getNum()
{
	char num;

	if(!isdigit(look))
		expected("Integer");
	num = look;
	nextChar();
	return num;
}

//Emite uma instrução seguida por uma nova linha
void emit(char *fmt,...)
{
	va_list args;
	putchar('\t');
	va_start(args, fmt);
	vprintf(fmt, args);
	va_end(args);
	putchar('\n');
}

/* Analisa e traduz um comando DO */ 
void doDo()
{
	int l;
	match('d');
	l = newLabel(); 
	expression(); 
	emit("MOV CX, AX");
	postLabel(l); 
	emit("PUSH CX");
	block();
	emit("POP CX");
	emit("LOOP L%d", l);
}

/* Analisa e traduz um comando FOR*/ 
void doFor()
{
int l1, l2; 
	char name;
	match('f');
	l1 = newLabel(); 
	l2 = newLabel();
	name = getName(); 
	match('='); 
	expression(); 
	emit("DEC AX");
	emit("MOV [%c], AX", name); 
	expression();
	emit("PUSH AX");
	postLabel(l1);
	emit("MOV AX, [%c]", name); 
	emit("INC AX");
	emit("MOV [%c], AX", name); 
	emit("POP BX");
	emit("PUSH BX");
	emit("CMP AX, BX");
	emit("JG L%d", l2); 
	block();
	match('e');
	emit("JMP L%d", l1); 
	postLabel(l2); 
	emit("POP AX");
}

/* Analisa e traduz um comando LOOP */ 
void doLoop(){
	int l; 
	match('p');
	l = newLabel(); 
	postLabel(l); 
	block(); 
	match('e');
	emit("JMP L%d", l);
}

/* Analisa e traduz um comando while*/
void doWhile()
{
	int l1, l2;
	match('w');
	l1 = newLabel();
	l2 = newLabel();
	postLabel(l1);
	condition();
	emit("JZ L%d", l2);
	block();
	match('e');
	emit("JMP L%d", l1);
	postLabel(l2);
}
