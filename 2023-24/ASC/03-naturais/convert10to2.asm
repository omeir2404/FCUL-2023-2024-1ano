; programa que converte um valor natural em base 10, de 8 bits, para a base binária
; usando o método das divisões sucessivas e escreve cada resultado numa linha da consola
; o primeiro algarismo a ser escrito corresponde ao resultado da primeira divisão
section .data
valor: dw 37
lf: db 10
section .bss
char: resb 1
section .text
global _start
_start:
    xor rax, rax
    mov ax, [valor] ; dividendo
    mov bl, 2       ; divisor
ciclo:
    div bl
    mov [char], ah
    or byte [char], 0x30
    xor ah, ah
    push rax
    call escreve_char
    pop rax
    cmp al, 2
    jae ciclo
    mov [char], al
    or byte [char], 0x30
    call escreve_char
    ; SYS_EXIT
    mov rax, 60
    xor rdi, rdi
    syscall    
    
escreve_char:
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, char
    mov rdx, 1
    syscall
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
    syscall
    ret    