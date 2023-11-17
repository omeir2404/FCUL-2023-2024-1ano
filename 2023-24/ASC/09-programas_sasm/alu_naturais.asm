section .rodata                 ; seccao de constantes com valor inicial
    PI: dd 3.1415               ; IEEE754 precisao simples (float)
    msg: db "Assembly x86",10   ; string ASCII (constante)
    MSG_TAM: equ $-msg          ; simbolo que o nasm vai substituir ..
                                ; .. no codigo pelo valor do tamanho de msg

section .data                   ; seccao de variaveis com valor inicial
	asc: db 16h             ; variavel inicializada de tamanho byte
	tp:  db 1000b	       ; variavel inicializada de tamanho byte
	ano1: times 10 db 0     ; vetor de 10 variaveis inicializadas ..
                                ; .. de tamanho byte

section .bss                    ; seccao de variaveis sem valor inicial
    resultados: resw 4          ; vetor de 4 elementos de tamanho word
    endereco: resq 1            ; variavel de tamanho qword

section .text                   ; seccao de instrucoes
global _start                   ; exportar rotulo _start
_start:                         ; rotulo onde comeca a execucao do programa
    ; guardar endereco de ano1 em apontador endereco
    mov rbx, ano1
    mov [endereco], rbx

    ; preparar operandos para aritmetica
    mov cl, [asc]
    mov bl, [tp]
    movzx bx, bl

    ; soma
    movzx ax, cl
    add ax, bx
    mov [resultados], ax        ; 1º elemento de resultados

    ;subtracao
    movzx ax, cl
    sub ax, bx
    mov [resultados+2], ax      ; 2º elemento de resultados

    ; multiplicacao
    mov al, cl
    mul bl
    mov [resultados+4], ax      ; 3º elemento de resultados

    ; divisao
    movzx ax, cl
    div bl
    mov [resultados+6], ax      ; 4º elemento de resultados

    ; escrever conteudo da string msg
    mov rax, 1                  ; chamada ao sistema operativo SYS_WRITE
    mov rdi, 1
    mov rsi, msg                ; escreve string msg (ASCII)
    mov rdx, MSG_TAM
    syscall

    mov rax, 60                 ; chamada ao sistema operativo SYS_EXIT
    mov rdi, 0
    syscall