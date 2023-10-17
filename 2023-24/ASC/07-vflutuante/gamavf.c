#include <stdio.h>
#include <math.h>

int main(void) {
       float x;
       float x2;
       x = +(1.0 + 0.0) * powf(2, -126);     /* 2 elevado a -126 */
       x2 = +(1.0 + powf(2, -23)) * powf(2, -126);
       printf("Em IEEE-754 (32 bits), o menor número normalizado é: %.8g\n", x);
       printf("Nestas condições, entre %.8g e %.8g só existe o 0.0\n", -x, x);
       printf("A lacuna [%.8g, %.8g] tem o tamanho %.8g\n",-x, x, 2*x);
       printf("x2: %.8g,  x2-x: %.8g\n",x2, x2-x);
       return 0;
}
