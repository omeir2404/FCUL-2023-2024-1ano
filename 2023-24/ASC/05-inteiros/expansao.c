#define  VALOR	2
#include <stdio.h>

// Abordagem 1 da expansão de 8 para 16 bits
union {
    char valor8[2];
    short valor16;
} expansao;

// Abordagem 2 da expansão de 8 para 16 bits
char valor8;
short valor16;

int main() {
    // Abordagem 1 - expansão manual a fazer pelo programador
    expansao.valor8[0] = VALOR;	// conteudo do byte menos significativo
    expansao.valor8[1] = 0;		// conteudo do byte mais significativo
    
    // Abordagem 2 - expansão automática feita pelo compilador
    valor8 = VALOR;
    valor16 = valor8;
    
    printf("Manual = %d (%hX) – Automatica = %d (%hX)\n", expansao.valor16, expansao.valor16, valor16, valor16);
    return 0;
}
