#include <stdio.h>

int main(void) {
	short a = 32767;   // maior inteiro positivo de 16 bits
	short sum_a1 = a + 1;
	
	short b = -32767;
	short sub_b1 = b - 1;
	short sub_b2 = b - 2;

	printf("\nConsiderando que 'a' e' um numero natural\n");
	printf("(a) %u + 1 = %u\n", a, a+1);	
	printf("\nConsiderando que 'a' e 'b' sao numeros inteiros\n");
	printf("(a) %d + 1 = %d\n", a, sum_a1);	
	printf("(b) %d - 1 = %d\n", b, sub_b1);
	printf("(b) %d - 2 = %d\n", b, sub_b2);
	printf("\n");

	return 0;
}
