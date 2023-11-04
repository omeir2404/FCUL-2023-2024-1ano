section .data
    ascii:             db "a",10
    MASCARA_teste:     equ 01100000b
    MASCARA_ativar:    equ 00000000b
    MASCARA_desativar: equ 01100001b
    MASCARA_trocar:    equ 00000000b

section .text
global _start
_start:
    ; teste de bits
    test byte [ascii], MASCARA_teste
    jz   _fim
    ; ativar bits
    or   byte [ascii], MASCARA_ativar
    ; desativar bits
    and  byte [ascii], MASCARA_desativar
    ; trocar bits
    xor  byte [ascii], MASCARA_trocar
    mov rax, 1
    mov rdi, 1
    mov rsi, valor
    mov rdx, 2
    syscall
_fim:
    mov rax, 60
    xor rdi, rdi
    syscall