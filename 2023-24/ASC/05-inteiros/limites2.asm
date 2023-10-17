; programa que identifica se o valor de uma variavel e´o min ou max possivel
; escreve mensagem de acordo com a situacao
section .data
valor:   dq 255
nbits:   db 8
msg_min: db "Maior negativo!  ", 0
msg_max: db "Maior positivo!  ", 0
msg_nat: db "Maior natural!   ", 0
msg:     db "Valor intermedio.", 0
lf: db 10
UCHAR_MAX equ 255
SCHAR_MIN equ -128
SCHAR_MAX equ 127
USHRT_MAX equ 65535
SHRT_MIN  equ -32768
SHRT_MAX  equ 32767
UINT_MAX  equ 4294967295
INT_MIN   equ -2147483648
INT_MAX   equ 2147483647
ULONG_MAX equ 18446744073709551615
LONG_MIN  equ -9223372036854775808
LONG_MAX  equ +9223372036854775807

section .text
global _start
_start:
    mov rax, [valor]
    cmp byte [nbits], 8
    je tCHAR
    cmp byte [nbits], 16
    je tSHRT
    cmp byte [nbits], 32
    je tINT
    cmp byte [nbits], 64
    je tLONG
    jmp fim
tCHAR:
    ; 8 bits
    cmp al, UCHAR_MAX
    je umax
    cmp al, SCHAR_MIN
    je min
    cmp al, SCHAR_MAX
    je max
tSHRT:
    ; 16 bits
    cmp ax, USHRT_MAX
    je umax
    cmp ax, SHRT_MIN
    je min
    cmp ax, SHRT_MAX
    je max
tINT:
    ; 32 bits
    cmp eax, UINT_MAX
    je umax
    cmp eax, INT_MIN
    je min
    cmp eax, INT_MAX
    je max
tLONG:
    ; 64 bits
    mov rdx, ULONG_MAX
    REX.W cmp rax, rdx
    je umax
    mov rdx, LONG_MIN
    cmp rax, rdx
    je min
    mov rdx, LONG_MAX
    cmp rax, rdx
    je max

    mov rsi, msg
    jmp escrever
umax:
    mov rsi, msg_nat
    jmp escrever
min:
    mov rsi, msg_min
    jmp escrever
max:
    mov rsi, msg_max
    jmp escrever
escrever:
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rdx, 17
    syscall
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
    syscall
fim:
    ; SYS_EXIT
    mov rax, 60
    xor rdi, rdi
    syscall   