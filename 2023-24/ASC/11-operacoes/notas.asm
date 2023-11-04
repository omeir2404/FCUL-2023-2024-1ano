section .rodata
    msg_Excel: db "Excelente!",10
    MSG_EXCEL_TAM: equ $-msg_Excel
    msg_MBom: db "Muito bom!",10
    MSG_MBOM_TAM: equ $-msg_MBom
    msg_Bom: db "Bom!",10
    MSG_BOM_TAM: equ $-msg_Bom
    msg_Suf: db "Suficiente",10
    MSG_SUF_TAM: equ $-msg_Suf
    msg_Insuf: db "Insuficiente",10
    MSG_INSUF_TAM: equ $-msg_Insuf

    EXCEL: equ 18
    MBOM:  equ 16
    BOM:   equ 14
    SUF:   equ 10

section .data
    nota: db 12 ; 10100

section .text
global _start
_start:
    mov al, [nota]

    ; if
    cmp al, EXCEL
    jb _ifmbom
_excel:
    ; then
    mov rsi, msg_Excel
    mov rdx, MSG_EXCEL_TAM
    jmp _next

_ifmbom:
    ; else if
    cmp al, MBOM
    jb _ifbom
_mbom:
    ; then
    mov rsi, msg_MBom
    mov rdx, MSG_MBOM_TAM
    jmp _next

_ifbom:
    ; else if
    cmp al, BOM
    jb  _ifsuf
_bom:
    ; then
    mov rsi, msg_Bom
    mov rdx, MSG_BOM_TAM
    jmp _next

_ifsuf:
    ; else if
    cmp al, SUF
    jb _insuf
_suf:
    ; then
    mov rsi, msg_Suf
    mov rdx, MSG_SUF_TAM
    jmp _next

_insuf:
    ; else
    mov rsi, msg_Insuf
    mov rdx, MSG_INSUF_TAM

_next:
    mov rax, 1
    mov rdi, 1
    syscall
; SYS_EXIT
    mov rax, 60
    xor rdi, rdi
    syscall