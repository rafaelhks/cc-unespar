#include <stdio.h>
#include <stdlib.h>
#define pesoA 2
#define pesoB 3
#define pesoC 5

int main() {
	
	double a, b, c, media;
	
	scanf("%lf", &a);
	scanf("%lf", &b);
	scanf("%lf", &c);
	
	media = ((a*pesoA) + (b*pesoB) + (c*pesoC)) / 10;
	
	printf("MEDIA = %.1lf\n", media);
		
}
