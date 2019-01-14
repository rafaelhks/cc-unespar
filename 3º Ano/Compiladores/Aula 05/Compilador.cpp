#include <stdio.h>				//Inicializa��o de biblioteca
#include <stdlib.h>				//Inicializa��o de biblioteca
#include <stdarg.h>				//Inicializa��o de biblioteca
#include <ctype.h>				//Inicializa��o de biblioteca

#define MAXNAME 30
#define MAXNUM 5

char look; 						//O caracter lido "antecipadamente" (lookahead)

								//prot�tipos
void init();					//Declara��o de m�todo
void nextChar();				//Declara��o de m�todo
void error(char *fmt, ...);		//Declara��o de m�todo
void fatal(char *fmt,...);		//Declara��o de m�todo
void expected(char *fmt,...);	//Declara��o de m�todo
void match(char c);				//Declara��o de m�todo
void getName(char *name);		//Declara��o de m�todo
void getNum(char *num);			//Declara��o de m�todo
void emit(char *fmt,...);		//Declara��o de m�todo
void expression();				//Declara��o de m�todo
void term();					//Declara��o de m�todo
void add();						//Declara��o de m�todo	
void subtract();				//Declara��o de m�todo
void factor();
void multiply();
void divide();
void ident();
void assignment();
void skipWhite();
int isAddOp(char c);
								//Progama Principal
int main()						//Parte principal do programa
{
	init();	
	assignment();					//Chamada de m�todo
	if(look != '\n')
		expected("NewLine ");
	return 0;					//Retorna valor 0
}
								//inicializa��o do compilador
void skipWhite()
{
	while(look == ' ' || look == '\t')
	nextChar();
}

void assignment()
{
	char name[MAXNAME+1];
	getName(name);
	match('=');
	expression();
	emit("MOV [%s], AX", name);
}

void ident()
{
	char name[MAXNAME+1];
	getName(name);
	if(look == '(')
	{
		match('(');
		match(')');
		emit("CALL %s", name);
	}else
		emit("MOV AX, [%s]", name);
}

void factor()
{
	char num[MAXNUM+1];
	if(look=='(')
	{
		match('(');
		expression();
		match(')');
	}else if(isalpha(look))
	{
		ident();
	}else
	{
		getNum(num);
		emit("MOV AX,  %s", num);	
	}
}	
	
void multiply()
{
	match('*');
	factor();
	emit("POP BX");
	emit("IMUL BX");	
}	
	
void divide()
{
	match('/');
	factor();
	emit("POP BX");
	emit("XCHG AX, BX");
	emit("XWD");
	emit("IDIV BX");
}
								
void term()
		{
		factor();
		while(look == '*' || look == '/')
		{
			emit("PUSH AX");
			switch(look){
				case '*':
					multiply();
					break;
				case '/':
					divide();
					break;
				default:
					expected("MulOp");
					break;
			}
		}
		}								
								
void expression()
{
	if(isAddOp(look))
		emit("XOR AX, AX");
	else
		term();
	while(isAddOp(look))
	{
	emit("PUSH AX");
	switch(look){
		case '+':
			add();
			break;
		case '-':
			subtract();
			break;
		default:
			expected("AddOp");
			break;
		}
	}
}

int isAddOp(char c)
{
	return (c == '+' || c == '-');
}

void add()
{
	match('+');
	term();
	emit("POP BX");
	emit("ADD AX, BX");
}

void subtract()
{
	match('-');
	term();
	emit("POP BX");
	emit("SUB AX, BX");
	emit("NEG AX");
}

void init()						//M�todo
{
	nextChar();					//Chamada de m�todo
	skipWhite();
}
								//l� pr�ximo caracter da entrada
void nextChar()					//M�todo
{
	look = getchar();			//Recebe um caracter e atribui a uma vare�vel
}
								//exibe uma mensagem de erro formatada
void error(char *fmt,...)		//M�todo
{
	va_list args;				//Cria uma lista de argumentos
	fputs("Error: ", stderr);	//Realiza a grava�ao em um arquivo texto
	va_start(args, fmt);		//Inicia uma vareavel da lista de argumentos
	vfprintf(stderr, fmt, args);//Gravar dados formatados na lista de argumentos
	va_end(args);				//Finaliza a vareavel da lista de argumentos
	fputc('\n', stderr);		//Realiza a grava�ao de um caracter
}
								//exibe uma mensagem de erro formatada e sai
void fatal(char *fmt, ...)		//M�todo
{
	va_list args;				//Cria uma lista de argumentos
	fputs("Error: ", stderr);	//Realiza a grava�ao em um arquivo texto
	va_start(args, fmt);		//Inicia uma vareavel da lista de argumentos
	vfprintf(stderr, fmt, args);//Gravar dados formatados na lista de argumentos
	va_end(args);				//Finaliza a vareavel da lista de argumentos
	fputc('\n', stderr);		//Realiza a grava�ao de um caracter
	exit(1);					//Sai do programa
}
								//alerta sobre alguma entrada esperada
void expected(char *fmt,...)	//M�todo
{
	va_list args;				//Cria uma lista de argumentos
	fputs("Error: ", stderr);	//Realiza a grava�ao em um arquivo texto
	va_start(args, fmt);		//Inicia uma vareavel da lista de argumentos
	vfprintf(stderr, fmt, args);//Gravar dados formatados na lista de argumentos
	va_end(args);				//Finaliza a vareavel da lista de argumentos
	fputs("expected!\n",stderr);//Realiza a grava�ao de um caracter
	exit(1);					//Sai do programa
}
								//verifica se entrada combina com o esperado
void match(char c)				//M�todo
{
	if (look != c)				//Compara��o
		expected("%c", c);		//Alerta alguma entrada esperada
	nextChar();					//Chamada de M�todo
	skipWhite();
}
								//recebe o nome de um identificador
void getName(char *name)		//M�todo
{
	int i;
	if(!isalpha(look))
		expected("Name ");
	for (i = 0; isalnum(look); i++)
	{
		if(i >= MAXNAME)
			fatal("identifier too long! ");
		name[i] = toupper(look);
		nextChar();
		skipWhite();
	}
	name[i] = '\0';
}
								//recebe um numero inteiro
void getNum(char *num)			//M�todo				
{
	int i;
	if(!isdigit(look))
	expected("integer");
	for(i=0; isdigit(look); i++)
	{
		if(i > MAXNUM)
			fatal("integer too long! ");
		num[i] = look;
		nextChar();
		skipWhite();
	}
	num[i] = '\0';
}
								//emite uma instru��o seguida por uma nova linha
void emit(char *fmt,...)		//M�todo
{
	va_list args;				//Cria uma lista de argumentos
	putchar('\t');				//coloca um espa�o
	va_start(args, fmt);		//Inicia uma vareavel da lista de argumentos
	vprintf(fmt, args);			//Imprimir dados formatados da lista de argumentos
	va_end(args);				//Finaliza a vareavel da lista de argumentos
	putchar('\n');				//coloca um espa�o
}
