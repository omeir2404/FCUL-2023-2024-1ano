#include <stdio.h>

int main(void) {
	unsigned int num;
	
	num = 0xFFFE;
	printf("Em hexadecimal: %X. Em octal: %o.\n", num, num);
	return 0;
}