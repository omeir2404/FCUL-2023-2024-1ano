section .data
impares: dd 0

section .bss
i: resd 1

section .text
global _start
_start:
    nop

    ; terminar programa com sys_exit
    mov rax,60
    xor rdi,rdi
    syscall
