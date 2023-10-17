#include <stdio.h>
#include <stdlib.h>
#include <string.h>


#define NUM2BYTES "num2bytes"
#define BYTES2NUM "bytes2num"
#define SINGLE "single"
#define DOUBLE "double"


typedef union {
    unsigned int bytes4;
    unsigned long long int bytes8;
    float singleP;
    double doubleP;
} fp_conv;


void print_usage(char *command) {
    printf("Usage: %s (%s|%s) (%s|%s) number\n", command, NUM2BYTES, BYTES2NUM, SINGLE, DOUBLE);
}


int main(int argc, char **argv) {
    if (argc < 4) {
        print_usage(argv[0]);
        return 0;
    }

    fp_conv number;
    
    if (strcmp(argv[1], NUM2BYTES) == 0) {
        if (strcmp(argv[2], SINGLE) == 0) {
            number.singleP = strtof(argv[3], NULL);
            printf("Number %.7e is represented by the following sequence of bytes: 0x%08X\n", number.singleP, number.bytes4);
        }
        else if (strcmp(argv[2], DOUBLE) == 0) {
            number.doubleP = strtod(argv[3], NULL);
            printf("Number %.7e is represented by the following sequence of bytes: 0x%016llX\n", number.doubleP, number.bytes8);
        }
        else
            print_usage(argv[0]);
    }
    else if (strcmp(argv[1], BYTES2NUM) == 0) {
        if (strcmp(argv[2], SINGLE) == 0) {
            number.bytes4 = strtol(argv[3], NULL, 16);
            printf("Sequence of bytes 0x%08X represents the floating point number: %.7e\n", number.bytes4, number.singleP);
        }
        else if (strcmp(argv[2], DOUBLE) == 0) {
            number.bytes8 = strtoll(argv[3], NULL, 16);
            printf("Sequence of bytes 0x%016llX represents the floating point number: %.7e\n", number.bytes8, number.doubleP);
        }
        else
            print_usage(argv[0]);
    }
    else 
        print_usage(argv[0]);

    return 0;
}
