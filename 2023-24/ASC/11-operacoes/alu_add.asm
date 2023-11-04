SECTION .data			; secção de dados inicializados
        X: dw 2
        Y: dw 1
SECTION .bss			; secção de dados não-inicializados
        Z: resd 1
SECTION .text
global _start
_start:				; início do programa
        mov bx, [X] 
        add bx, [Y]
        nop
        mov [Z], bx
        mov ax, 33000
        mul word [Z]
        nop
        mov [Z], ax
        nop
        
_ajuste:
        mov [Z+2],dx 
        mov [Z], ax
         
_fim:                            ; terminação
        mov rax, 60             
        xor rdi, rdi
        syscall                 ; SYS_exit
