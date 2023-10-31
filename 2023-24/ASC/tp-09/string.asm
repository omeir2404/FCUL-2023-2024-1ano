section .data
    msg: db "computador",10
    msg_TAM: equ $-msg

section .text
global _start
_start:
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, msg
    mov rdx, msg_TAM
    syscall

    ; ler primeiro caractere
    mov al, [msg]
    ; substitur nop seguinte por subtracao
    ; subtrair um valor ao registo al para obter 'C'
    nop
    ; substituir primeiro caractere pelo novo caractere
    mov [msg], al

    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, msg
    mov rdx, msg_TAM
    syscall
    ; SYS_EXIT
    mov rax, 60
    xor rdi, rdi
    syscall