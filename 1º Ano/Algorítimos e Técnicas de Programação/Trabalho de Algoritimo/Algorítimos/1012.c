#include <stdio.h>
#include <math.h>
#define pi 3.14159

int main() 
{
	double a, b, c, area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
	
	scanf("%lf/t" "%lf/t" "%lf/t", &a, &b, &c);
	
	area_triangulo = (a*c)/2;
	printf("TRIANGULO: %.3lf\n", area_triangulo);
	
	area_circulo = pi * pow(c, 2);
	printf("CIRCULO: %.3lf\n", area_circulo);
	
	area_trapezio = ((a+b)*c) /2;
	printf("TRAPEZIO: %.3lf\n", area_trapezio);
	
	area_quadrado = (b*b);
	printf("QUADRADO: %.3lf\n", area_quadrado);
	
	area_retangulo = (a*b);
	printf("RETANGULO: %.3lf\n", area_retangulo);
	

}
