#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>
#include <ctype.h>

//RAFAEL FRANCISCO FERREIRA - UNESPAR

char look;	//Declara variável do tipo char

/* Protótipos */
void init();	//Declara método init  - sem retorno
void nextChar();	//Declara método nextChar - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos variáveis
void error(char *fmt, ...);	//Declara método error - sem retorno  - utiliza como argumento um ponteiro de char com numero de arumentos variáveis
void fatal(char *fmt, ...);	//Declara método fatal - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos variáveis 
void expected(char *fmt, ...);	//Declara método expected - sem retorno - utiliza como argumento um ponteiro de char com numero de arumentos variáveis
void match (char c);	//Declara método match - sem retorno - utiliza um caracter como argumento
char getName();		//Declara método getName - retorna um caracter
char getNum();		//Declara método getNum - returna um caracter - - utiliza como argumento um ponteiro de char com numero de arumentos variáveis
void emit(char *fmt, ...);	//Declara método emit - sem retorno
void other();	//Reconhece e traduz um comando qualquer
void program();		//Analisa e traduz um programa completo
void block();	//Analisa e traduz um bloco de comandos

/* Programa Principal */
int main()	//Declara escopo para o método main que ao final de sua execução returna um inteiro.
{	//Início do escopo.
	init();		//Chamada do método init.
	program (); 
	return 0;	//Retorna o valor 0 se o código for executado sem erros.
}	//Fim do escopo

/* Iniialização do Compilador */
void init()	//Declara escopo para o método init que não possui um retorno após sua execução.
{	//Início do escopo.
	nextChar();	//Chamada do método nextChar().
}	//Fim do escopo.

/* Lê o próximo caracter da entrada */
void nextChar()		//Declara escopo para o método nextChar()
{	//Início do escopo
	look = getchar();	//Armazena na variável look um caracter lido (função getchar()).
}	//Fim do escopo.

/* Exibe uma mensafem de erro formatada */
void error(char *fmt, ...)	//Declara escopo para o método error.
{	//Inicio do escopo.
	va_list args;	//Declara um tipo de iteração com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padrão utilizando a função stderr (retorna erro padrão); 
	va_start(args, fmt);	//Começa uma iteração com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma saída formatada.
	va_end(args);	//Termina uma iteração com a lista de arguementos.
	fputc('\n', stderr);	//Imprime uma saída formatada.
}	//Fim do escopo.

/* Exibe ensagem de rro formatada e sai */
void fatal(char *fmt, ...)	//Declara escopo para o método fatal.
{	//Início do escopo.
	va_list args;	//Declara um tipo de iteração com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padrão utilizando a função stderr (retorna erro padrão); 
	va_start(args, fmt);	//Começa uma iteração com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma saída formatada.
	va_end(args);	//Termina uma iteração com a lista de arguementos.
	fputc('\n', stderr);	//Imprime uma saída formatada.
	exit(1);	//Termina a execução do programa retornando o valor 1.
}	//Fim do escopo.

/* Alerta sobre alguma entrada esperada */
void expected(char *fmt, ...)	//Declara o escopo do método expected.
{	//Inicio do escopo.
	va_list args;	//Declara um tipo de iteração com argumentos.
	fputs("Error: ", stderr);	//Imprime mensagem de erro padrão utilizando a função stderr (retorna erro padrão); 
	va_start(args, fmt);	//Começa uma iteração com a lista de argumentos.
	vfprintf(stderr, fmt, args);	//Utilizando uma lista de argumentos, imprime uma saída formatada.
	va_end(args);	//Termina uma iteração com a lista de arguementos.
	fputs(" expected\n", stderr); 	//Imprime uma saída formatada.
	exit(1);	//Termina a execução do programa retornando o valor 1.
}	//Fim do escopo.

/* Verifica se entrada combina com o esperado */
void match(char c)	//Declara o escopo para o método match.
{	//Início do escopo.
	if (look != c)	//Verifica se o valor da variável look é diferente de c
		expected("'%c''", c);	//Caso a condição seja verdadeira ela executa o método expected usando o caracter de entrada como argumento.
	nextChar();	//Caso a condução seja falsa ela executa o método nextChar();
}	//Fim do escopo.

/* Recebe o nome de um identificador */
char getName()	//Declara o escopo para o método getName.
{	//Início do escopo.
	char name;	//Declara variávem name do tipo caractere
	
	if (!isalpha(look))	//Verifica se o valor da variável look não é uma letra.
		expected("Name");	//Se a condição for verdadeira executa o méoto expected.
	name = toupper(look);	//Transforma o valor da variável name em caixa alta.
	nextChar();	//Executa método nextChar;
	return name;	//Retorna o valor da variável name.
}	//Fim do escopo.

/* Recebe número inteiro */
char getNum()	//Declara o escopo para o método getNum.
{	//Início do escopo.
	char num;	//Declara variável num do tipo char 
	
	if (!isdigit(look))	//Verifica se o valor da variável look não é um dígito
		expected("Integer");	//Executa o método expected;
	num = look;	//Atribui a variável num o valor de look;
	nextChar();	//Executa o método nextChar;
	return num;	//Retorna o valor de num;
}	//Fim do escopo.

/* Emite uma instrução seguida por uma nova linha */
void emit(char *fmt, ...)	//Declara o escopo para o método emit.
{	//Início do escopo.
	va_list args;	//Declara um tipo de iteração com argumentos.
	putchar('\t');	//Imprime uma tabulação.
	va_start(args, fmt);	//Começa uma iteração com a lista de argumentos.
	vprintf(fmt, args);	//Imprime uma saída formatada.
	va_end(args);	//Termina uma iteração com a lista de argumentos.
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
