#include <stdio.h>
#include <limits.h>

int main(void) {
	// 8 bits
	unsigned char ucmax = UCHAR_MAX;
	char cmin = SCHAR_MIN;
	char cmax = SCHAR_MAX;
	// 16 bits
	unsigned short usmax = USHRT_MAX;
	short smin = SHRT_MIN;
	short smax = SHRT_MAX;
	// 32 bits
	unsigned int uimax = UINT_MAX;
	int imin = INT_MIN;
	int imax = INT_MAX;
	// 64 bits
	unsigned long ulmax = ULONG_MAX;
	long lmin = LONG_MIN;
	long lmax = LONG_MAX;

	printf(" 8 bits, Naturais : Max=%u\n", ucmax);
	printf(" 8 bits, Inteiros : Min=%d Max=%d\n", cmin, cmax);

	printf("16 bits, Naturais : Max=%u\n", usmax);
	printf("16 bits, Inteiros : Min=%d Max=%d\n", smin, smax);

	printf("32 bits, Naturais : Max=%u\n", uimax);
	printf("32 bits, Inteiros : Min=%d Max=%d\n", imin, imax);

	printf("64 bits, Naturais : Max=%lu\n", ulmax);
	printf("64 bits, Inteiros : Min=%ld Max=%ld\n", lmin, lmax);

	return 0;
}