SECTION .data
	PI_single: dd 3.1415        ; valor em vírgula-flutuante
	r: dd 5                     ; valor inteiro
    two: dd 2.0
    arredondar: db 1

SECTION .bss
	Resultado_single: resd 1    ; resultado em vírgula-flutuante
	Resultado: resd 1           ; resultado inteiro

SECTION .text
global _start
_start:
    cvtsi2ss xmm0, [r]    		 ; carregar r em XMM0
    mulss xmm0, [two]

    movss xmm1, [PI_single]		 ; carregar vf em XMM1
    mulss xmm1, xmm0

    movss dword [Resultado_single], xmm1  ; resultado vírgula_flutuante

_resInt:
    cvtss2si eax, xmm1                    ; resultado inteiro
    mov dword [Resultado], eax

_fim:                               	; terminação do programa
    mov rax, 60
    xor rdi, rdi
    syscall
