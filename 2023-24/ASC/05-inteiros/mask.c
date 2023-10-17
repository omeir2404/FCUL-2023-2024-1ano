#include <stdio.h>

int main() {
	
    int A = 13;

    printf("O valor de A e' %d\n", A);
    
    // Mascara 00001000
	printf("Teste do bit 3 (Zero ou diferente de zero?): %d \n", A & (1 << 3) );
    // Mascara 00010000
	printf("Teste do bit 4 (Zero ou diferente de zero?): %d \n", A & (1 << 4) );
	
    // Mascara 00000100
	printf("Colocar bit 2 a zero: %d \n", A & ~(1 << 2) );
    // Mascara 00100000
	printf("Colocar bit 5 a um: %d \n", A | (1 << 5) );
    // Mascara 00001000
	printf("Trocar bit 3: %d \n", A ^ (1 << 3) );
	return 0;
}
