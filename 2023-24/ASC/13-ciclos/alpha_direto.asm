SECTION .data
; bitmap ARGB32 de 6x6 pixels
imagem: dd 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF0000F0, 0xFF0000F0, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF0000F0, 0xFF0000F0, 0xFF0000F0, 0xFF0000F0, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000, 0xFF000000
img_tamanho: equ $-imagem
num_pixels: equ 36

SECTION .text
global _start
_start:
    ; alterar alpha da imagem
    shr byte [imagem+3],  1
    shr byte [imagem+7],  1
    shr byte [imagem+11], 1
    shr byte [imagem+15], 1
    shr byte [imagem+19], 1
    shr byte [imagem+23], 1
    ; idem para os restantes pixels
    
_fim:
    mov rax, 60
    xor rdi, rdi
    syscall
