#include <stdio.h>

// union e uma construcao especial do C que permite tratar um conjunto
// de bytes de diferentes formas, neste caso um conjunto de 4 bytes pode
// ser acedido como um numero em virgula flutuante representado em
// IEEE 754 de 32 bits (float) ou pode ser acedido como um inteiro de 32 bits
// o que e' util para se observar o conteudo dos 4 bytes em binario ou hexadecimal
typedef union {
    unsigned int bytes4;
    float singleP;
} fp_conv;

/*
Funcao que escreve na consola cada um dos 32 bits da variavel num
*/
void print_IEEE_32 (float num) {
  // comecando pelo bit mais significativo
  // escreve cada um dos bits de num
  // separando com um espaco os tres conjuntos de bits
  for(int i=31; i>=0; i--) {
    // uso de deslocamento de "i" bits para a direita ">>"
    // uso de mascara para testar bit menos significativo
    printf("%d", (*(int*) &num >> i) & 1);
    if(i==31 || i==23) printf(" ");
  }
}

void imprime_numero(fp_conv f){
  // escreve na consola numero racional na base 10
  // %lf corresponde a um numero em virgula flutuante de 64 bits (long float)
  // apresentado no formato de virgula fixa
  printf("%lf\t", f.singleP);
  // escreve na consola IEEE 754 de 32 bits em hexadecimal
  printf("IEEE754(hex)=0x%08X\t\t", f.bytes4);
  // escreve na consola IEEE 754 de 32 bits em binario
  printf("IEEE754(bin)=");
  print_IEEE_32(f.singleP);
  printf ("\n");
}

int main(void){
  int i;
  fp_conv f;
  f.singleP = 36.5;
  imprime_numero(f);
  return 0;
}

