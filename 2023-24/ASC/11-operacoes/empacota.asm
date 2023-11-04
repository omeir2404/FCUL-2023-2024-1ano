SECTION .rodata
    ; aos 16 registos gerais associam-se os identificadores 0,1,2 .. 15, respetivamente
    ; usam-se estes identificadores para referenciar um dado registo
    Registos: db "rax,rbx,rcx,rdx,rsi,rdi,rbp,rsp,r8 ,r9 ,r10,r11,r12,r13,r14,r15"
    MsgOrigem: db  "Origem: "
    MORIGEM_TAM: equ $-MsgOrigem
    MsgDestino: db "Destino: "
    MDESTINO_TAM: equ $-MsgDestino
    lf: db 10

SECTION .data
    Origem:   db 1          ; identificador do registo de origem
    Destino:  db 2          ; identificador do registo de destino

SECTION .bss
    OrigemDestino: resb 1   ; 4 bits menos significativos c/ origem e 
                            ; 4 bits mais significativos c/ destino

SECTION .text
global _start
_start:
    xor eax, eax
    ; empacotar
    mov al, [Destino]
    shl al, 4
    or al, [Origem]
    mov [OrigemDestino], al

    nop
	
    ; desempacotar, escrever e terminar
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, MsgOrigem
    mov rdx, MORIGEM_TAM
    syscall
    mov al, [OrigemDestino]
    and al, 0xF
    lea rbx, [Registos+eax*4]
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, rbx
    mov rdx, 3
    syscall
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
    syscall
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, MsgDestino
    mov rdx, MDESTINO_TAM
    syscall
    mov al, [OrigemDestino]
    shr al, 4
    and al, 0xF
    lea rbx, [Registos+eax*4]
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, rbx
    mov rdx, 3
    syscall
    mov rax, 1                  ; SYS_write
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
    syscall   
    mov rax, 60
    xor rdi, rdi
    syscall

