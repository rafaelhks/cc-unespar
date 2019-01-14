#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>
#include <ctype.h>

//RAFAEL FRANCISCO FERREIRA - UNESPAR

char look;	//Declara vari�vel do tipo char

/* Prot�tipos */
void init();	//Declara m�todo init  - sem retorno
void nextChar();	//Declara m�todo nextChar - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos vari�veis
void error(char *fmt, ...);	//Declara m�todo error - sem retorno  - utiliza como argumento um ponteiro de char com numero de arumentos vari�veis
void fatal(char *fmt, ...);	//Declara m�todo fatal - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos vari�veis 
void expected(char *fmt, ...);	//Declara m�todo expected - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos vari�veis
void match (char c);	//Declara m�todo match - sem retorno - utiliza um caracter como argumento
char getName();		//Declara m�todo getName - retorna um caracter
char getNum();		//Declara m�todo getNum - returna um caracter - - utiliza como argumento um ponteiro de char com numero de arumentos vari�veis
void emit(char *fmt, ...);	//Declara m�todo emit - sem retorno
void other();	//Reconhece e traduz um comando qualquer
void program();		//Analisa e traduz um programa completo
void block();	//Analisa e traduz um bloco de comandos

/* Programa Principal */
int main()	//Declara escopo para o m�todo main que ao final de sua execu��o returna um inteiro.
{	//In�cio do escopo.
	init();		//Chamada do m�todo init.
	program (); 
	return 0;	//Retorna o valor 0 se o c�digo for executado sem erros.
}	//Fim do escopo

/* Iniializa��o do Compilador */
void init()	//Declara escopo para o m�todo init que n�o possui um retorno ap�s sua execu��o.
{	//In�cio do escopo.
	nextChar();	//Chamada do m�todo nextChar().
}	//Fim do escopo.

/* L� o pr�ximo caracter da entrada */
void nextChar()		//Declara escopo para o m�todo nextChar()
{	//In�cio do escopo
	look = getchar();	//Armazena na vari�vel look um caracter lido (fun��o getchar()).
}	//Fim do escopo.

/* Exibe uma mensafem de erro formatada */
void error(char *fmt, ...)	//Declara escopo para o m�todo error.
{	//Inicio do escopo.
	va_list args;	//Declara um tipo de itera��o com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padr�o utilizando a fun��o stderr (retorna erro padr�o); 
	va_start(args, fmt);	//Come�a uma itera��o com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma sa�da formatada.
	va_end(args);	//Termina uma itera��o com a lista de arguementos.
	fputc('\n', stderr);	//Imprime uma sa�da formatada.
}	//Fim do escopo.

/* Exibe ensagem de rro formatada e sai */
void fatal(char *fmt, ...)	//Declara escopo para o m�todo fatal.
{	//In�cio do escopo.
	va_list args;	//Declara um tipo de itera��o com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padr�o utilizando a fun��o stderr (retorna erro padr�o); 
	va_start(args, fmt);	//Come�a uma itera��o com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma sa�da formatada.
	va_end(args);	//Termina uma itera��o com a lista de arguementos.
	fputc('\n', stderr);	//Imprime uma sa�da formatada.
	exit(1);	//Termina a execu��o do programa retornando o valor 1.
}	//Fim do escopo.

/* Alerta sobre alguma entrada esperada */
void expected(char *fmt, ...)	//Declara o escopo do m�todo expected.
{	//Inicio do escopo.
	va_list args;	//Declara um tipo de itera��o com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padr�o utilizando a fun��o stderr (retorna erro padr�o); 
	va_start(args, fmt);	//Come�a uma itera��o com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma sa�da formatada.
	va_end(args);	//Termina uma itera��o com a lista de arguementos.
	fputs(" expected\n", stderr); 	//Imprime uma sa�da formatada.
	exit(1);	//Termina a execu��o do programa retornando o valor 1.
}	//Fim do escopo.

/* Verifica se entrada combina com o esperado */
void match(char c)	//Declara o escopo para o m�todo match.
{	//In�cio do escopo.
	if (look != c)	//Verifica se o valor da vari�vel look � diferente de c
		expected("'%c''", c);	//Caso a condi��o seja verdadeira ela executa o m�todo expected usando o caracter de entrada como argumento.
	nextChar();	//Caso a condu��o seja falsa ela executa o m�todo nextChar();
}	//Fim do escopo.

/* Recebe o nome de um identificador */
char getName()	//Declara o escopo para o m�todo getName.
{	//In�cio do escopo.
	char name;	//Declara vari�vem name do tipo caractere
	
	if (!isalpha(look))	//Verifica se o valor da vari�vel look n�o � uma letra.
		expected("Name");	//Se a condi��o for verdadeira executa o m�oto expected.
	name = toupper(look);	//Transforma o valor da vari�vel name em caixa alta.
	nextChar();	//Executa m�todo nextChar;
	return name;	//Retorna o valor da vari�vel name.
}	//Fim do escopo.

/* Recebe n�mero inteiro */
char getNum()	//Declara o escopo para o m�todo getNum.
{	//In�cio do escopo.
	char num;	//Declara vari�vel num do tipo char 
	
	if (!isdigit(look))	//Verifica se o valor da vari�vel look n�o � um d�gito
		expected("Integer");	//Executa o m�todo expected;
	num = look;	//Atribui a vari�vel num o valor de look;
	nextChar();	//Executa o m�todo nextChar;
	return num;	//Retorna o valor de num;
}	//Fim do escopo.

/* Emite uma instru��o seguida por uma nova linha */
void emit(char *fmt, ...)	//Declara o escopo para o m�todo emit.
{	//In�cio do escopo.
	va_list args;	//Declara um tipo de itera��o com argumentos.
	putchar('\t');	//Imprime uma tabula��o.
	va_start(args, fmt);	//Come�a uma itera��o com a lista de argumentos.
	vprintf(fmt, args);	//Imprime uma sa�da formatada.
	va_end(args);	//Termina uma itera��o com a lista de argumentos.
	putchar('\n');	//Imprime uma quebra de linha.
}	//Fim do escopo.

//reconhece e traduz um comando qualquer
void other(){
	emit("# %c", getName());
}

//Analisa e traduz um programa completo
void program(){
	block();
	if(look != 'e'){
		expected("End");
	}
	emit("END");
}

//Analisa e traduz um bloco de comandos
void block(){
	while (look != 'e'){
		other();
	}
}
