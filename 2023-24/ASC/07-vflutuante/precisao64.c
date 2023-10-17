#include <stdio.h>
#define BIG 1e7             // 1e7 = 1 x 10^7
#define TOOBIG 1e8          // 1e8 = 1 x 10^8

typedef union {
    unsigned long long int bytes8;
    double doubleP;
} fp_conv;

void print_IEEE_64 (double num) {
  for (int i=63; i>=0; i--) {
    printf ("%ld", (*(long*) &num >> i) & 1);
    if (i==63 || i==52) printf (" ");
  }
}

void imprime_numero(fp_conv f){
  printf("%lf\t", f.doubleP);
  printf("IEEE754(hex)=0x%016llX\t\t", f.bytes8);
  printf("IEEE754(bin)=");
  print_IEEE_64(f.doubleP);
  printf ("\n");
}

int main(void){
  int i;
  fp_conv f;
  f.doubleP = TOOBIG;
  printf("Soma 4: \n");
  for(i = 0; i < 10; i++){
    imprime_numero(f);
    f.doubleP += 1;
  }
  imprime_numero(f);
  return 0;
}

