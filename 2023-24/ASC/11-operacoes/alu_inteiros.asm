SECTION .data
	mem8: db 39
SECTION .text
global _start
_start:
	mov al, 26
	inc al
	add al, 76
	add al, [mem8]
	mov ah, al
	add al, ah
	nop
	mov rax, 60
	xor rdi, rdi
	syscall		; terminação do programa com chamada ao SO
