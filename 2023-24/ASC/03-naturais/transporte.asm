; programa que soma os naturais colocados nas variáveis valor1 e valor2, de 8 bits
; verifica se houve transporte e escreve uma mensagem adequada na consola
section .data
valor1: db 200
valor2: db 70
msg_yes: db "Ocorreu transporte!", 0
msg_no:  db "Não ocorreu. Boa!!!", 0
lf: db 10
section .bss
char: resb 1
section .text
global _start
_start:
    mov al, [valor1]
    mov bl, [valor2]
    add al, bl
    jc transporte
    mov rsi, msg_no
    jmp escrever
transporte:
    mov rsi, msg_yes
escrever:
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rdx, 19
    syscall
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
    syscall
    ; SYS_EXIT
    mov rax, 60
    xor rdi, rdi
    syscall    
