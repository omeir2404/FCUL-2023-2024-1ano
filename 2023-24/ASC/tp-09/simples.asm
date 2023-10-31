section .rodata
    hex_lut:  db  "0123456789abcdef"
	lf: db 10

section .data
	asc: dd 35		
	tp:  dd -35		
	msg: times 20 db 0
	valor: dq 27

section .text
global _start
_start:
    mov     eax,[asc]
    mov     ebx,eax
    mov     eax,[tp]
    nop
    mov     edx,65535
    xchg    edx,eax
    xchg    ebx,eax

    mov     edi, msg		; output buffer
    mov     esi, eax 		; valor a escrever
    call    itohex

    mov rax, 1
    mov rdi, 1
    mov rsi, msg
    mov rdx, 20
	syscall

    mov rax, 1
    mov rdi, 1
    mov rsi, lf
    mov rdx, 1
	syscall

    mov rax, 60
    mov rdi, 0
    syscall


itohex:
    mov    ecx, 8        ; 8 hex digits, fixed width zero-padded
.digit_loop:             ; do {
    rol    esi, 4          ; rotate the high 4 bits to the bottom

    mov    edx, esi
    and    edx, 0x0f       ; and isolate 4-bit integer in EDX

    movzx  edx, byte [hex_lut + edx]
    mov    [edi], dl       ; copy a character from the lookup table
    inc    edi             ; loop forward in the output buffer

    dec    ecx
    jnz    .digit_loop   ; }while(--ecx)

    ret
