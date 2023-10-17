#include <stdio.h>
#include<stdbool.h>

int main() {
  // Declaracao e inicializacao
  bool A = false;
  bool B = true;

  // valores A e B
  printf("O valor de A e' %d\n", A);
  printf("O valor de B e' %d\n", B);

  // Operador NOT
  printf("O valor de NOT(A) e' %d\n", !A);

  // Operador AND
  printf("O valor de AND(A,B) e' %d\n", A && B);

  // Operador OR
  printf("O valor de OR(A,B) e' %d\n", A || B);

  // Operador XOR
  printf("O valor de XOR(A,B) e' %d\n", A ^ B);

  return 0;
}