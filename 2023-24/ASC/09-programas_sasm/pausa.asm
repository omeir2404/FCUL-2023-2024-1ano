section .rodata
    msg_inicial: db `Antes da pausa ...\n`
    msg_i_tam:   equ $-msg_inicial
    msg_final:   db `... depois da pausa.\n`
    msg_f_tam:   equ $-msg_final

section .bss
timespec:
    secs:     resq 1
    nanosecs: resq 1

section .data
    segs:     dq 0  ; valor inicial para os segundos
    milisegs: dd 0  ; valor inicial para os milissegundos

section .text
global _start
_start:
    ; escrita da primeira mensagem
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, msg_inicial
    mov rdx, msg_i_tam
	syscall

    ; preencher campo de segundos da estrutura timespec
    mov rbx, [segs]
    mov qword [secs], rbx

    ; preencher campo de nanossegundos da estrutura timespec
    mov eax, [milisegs]
    mov qword [nanosecs], rax

    ; SYS_NANOSLEEP
    mov rax, 35
    mov rdi, timespec
    mov rsi, rsi
    syscall

    ; escrita da segunda mensagem
    ; SYS_WRITE
    mov rax, 1
    mov rdi, 1
    mov rsi, msg_final
    mov rdx, msg_f_tam
	syscall

    ; SYS_EXIT
    mov rax, 60
    mov rdi, 0
    syscall
