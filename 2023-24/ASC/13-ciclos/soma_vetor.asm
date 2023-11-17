section .data
vetor: db 2,101b,17o,4h,0x5,6,7,80,0x90,0

section .bss
resultado: resw 1

section .text
global _start
_start:
    xor ecx, ecx

_for:
    cmp ecx, 9
    jb _ciclo
    jmp _next
_ciclo:
    mov bl, [vetor + ecx]
    movsx bx, bl
    add ax, bx
    inc ecx
    jmp _for
_next:
    mov [resultado], ax
    
    mov rax, 60
    xor rdi, rdi
    syscall