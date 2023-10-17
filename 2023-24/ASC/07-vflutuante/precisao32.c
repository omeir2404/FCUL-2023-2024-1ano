#include <stdio.h>
#define BIG 1e7             // numero na base 10: 1e7 = 1 x 10^7
#define TOOBIG 1e8          // numero na base 10: 1e8 = 1 x 10^8

typedef union {
    unsigned int bytes4;
    float singleP;
} fp_conv;

void print_IEEE_32 (float num) {
  for (int i=31; i>=0; i--) {
    printf ("%d", (*(int*) &num >> i) & 1);
    if (i==31 || i==23) printf (" ");
  }
}

void imprime_numero(fp_conv f){
  printf("%lf\t", f.singleP);
  printf("IEEE754(hex)=0x%08X\t\t", f.bytes4);
  printf("IEEE754(bin)=");
  print_IEEE_32(f.singleP);
  printf ("\n");
}

int main(void){
  int i;
  fp_conv f;
  f.singleP = TOOBIG;
  printf("Soma: \n");
  for(i = 0; i < 10; i++){
    imprime_numero(f);
    f.singleP += 5;
  }
  // f.singleP += BIG;
  imprime_numero(f);
  return 0;
}
