# Steganographie - La barre fixe - Facile variable

## Enonce 

C'est le grand moment, tous les yeux sont rivés sur vous. Vous vous apprêtez à commencer votre prestation sur l'épreuve de la barre fixe.
Mais quelques instants avant de vous élancer, vous remarquez un détail intriguant. Certaines choses sont là... alors qu'elles ne devraient pas l'être...
Un message peut être ?

Auteur : Redhpm

### Fichiers fournis :

- chall : un binaire

## Solution

65 6a 00
2e 3e 48 c7 c0 01 00 00 00
48 c7 c7 01 00 00 00
2e 3e 48 89 e6
65 48 c7 c2 01 00 00 00
2e 3e c6 04 24 55
2e 3e 0f 05
65 c6 04 24 6e
65 0f 05
65 3e c6 04 24 4d
65 2e 0f 05
65 c6 04 24 65
40 2e 3e 0f 05
65 2e 3e c6 04 24 73
40 0f 05
65 2e 3e c6 04 24 73
40 0f 05
2e 3e c6 04 24 61
65 2e 0f 05
2e 3e c6 04 24 67
40 65 2e 3e 0f 05
65 3e c6 04 24 65
65 2e 0f 05
2e 3e c6 04 24 50
65 0f 05
2e 3e c6 04 24 61
40 65 3e 0f 05
2e c6 04 24 73
40 3e 0f 05
65 2e c6 04 24 44
65 2e 3e 0f 05
65 c6 04 24 75
40 65 2e 0f 05
65 2e c6 04 24 54
40 65 2e 3e 0f 05
65 2e c6 04 24 6f
2e 0f 05
65 2e 3e c6 04 24 75
2e 3e 0f 05
2e 3e c6 04 24 74
2e 3e 0f 05
65 2e 3e c6 04 24 53
40 65 3e 0f 05
2e c6 04 24 75
65 3e 0f 05
2e 3e c6 04 24 73
65 0f 05
65 3e c6 04 24 70
65 3e 0f 05
65 2e 3e c6 04 24 65
65 2e 0f 05
65 c6 04 24 63
65 2e 0f 05
65 c6 04 24 74
40 65 3e 0f 05
65 2e 3e c6 04 24 0a
0f 05
48 c7 c0 3c 00 00 00
0f 05

**Flag** : 404CTF{x86_64-iGnor3s-5TuFF}

(rex / gs / cs /ds)

4
gs push $0x0
cs ds mov $0x1,%rax
0
mov    $0x1,%rdi
cs ds mov %rsp,%rsi
4
gs mov $0x1,%rdx
cs ds movb $0x55,(%rsp)
C
cs ds syscall
movb   $0x6e,%gs:(%rsp)
T
65 0f 05                gs syscall
65 3e c6 04 24 4d       gs movb $0x4d,%gs:(%rsp)
F
65 2e 0f 05             gs cs syscall
65 c6 04 24 65          movb   $0x65,%gs:(%rsp)
{
40 2e 3e 0f 05          rex cs ds syscall
65 2e 3e c6 04 24 73    gs cs movb $0x73,%gs:(%rsp)
x
40 0f 05                rex syscall
65 2e 3e c6 04 24 73    gs cs movb $0x73,%gs:(%rsp)
8
40 0f 05                rex syscall
2e 3e c6 04 24 61       cs ds movb $0x61,(%rsp)
6
65 2e 0f 05             gs cs syscall
2e 3e c6 04 24 67       cs ds movb $0x67,(%rsp)
_
40 65 2e 3e 0f 05       rex gs cs ds syscall
65 3e c6 04 24 65       gs movb $0x65,%gs:(%rsp)
6
65 2e 0f 05             gs cs syscall
2e 3e c6 04 24 50       cs ds movb $0x50,(%rsp)
4
65 0f 05                gs syscall
2e 3e c6 04 24 61       cs ds movb $0x61,(%rsp)
-
40 65 3e 0f 05          rex gs ds syscall
2e c6 04 24 73          cs movb $0x73,(%rsp)
i
40 3e 0f 05             rex ds syscall
65 2e c6 04 24 44       gs movb $0x44,%gs:(%rsp)
G
65 2e 3e 0f 05          gs cs ds syscall
65 c6 04 24 75          movb   $0x75,%gs:(%rsp)
n
40 65 2e 0f 05          rex gs cs syscall
65 2e c6 04 24 54       gs movb $0x54,%gs:(%rsp)
o
40 65 2e 3e 0f 05       rex gs cs ds syscall
65 2e c6 04 24 6f       gs movb $0x6f,%gs:(%rsp)

2e 0f 05                cs syscall
65 2e 3e c6 04 24 75    gs cs movb $0x75,%gs:(%rsp)

2e 3e 0f 05             cs ds syscall

2e 3e c6 04 24 74       cs ds movb $0x74,(%rsp)
2e 3e 0f 05             cs ds syscall

65 2e 3e c6 04 24 53    gs cs movb $0x53,%gs:(%rsp)
40 65 3e 0f 05          rex gs ds syscall
             
2e c6 04 24 75          cs movb $0x75,(%rsp)
65 3e 0f 05             gs ds syscall

2e 3e c6 04 24 73       cs ds movb $0x73,(%rsp)
65 0f 05                gs syscall

65 3e c6 04 24 70       gs movb $0x70,%gs:(%rsp)
65 3e 0f 05             gs ds syscall

65 2e 3e c6 04 24 65    gs cs movb $0x65,%gs:(%rsp)
65 2e 0f 05             gs cs syscall

65 c6 04 24 63          movb   $0x63,%gs:(%rsp)
65 2e 0f 05             gs cs syscall

65 c6 04 24 74          movb   $0x74,%gs:(%rsp)
40 65 3e 0f 05          rex gs ds syscall

65 2e 3e c6 04 24 0a    gs cs movb $0xa,%gs:(%rsp)
0f 05                   syscall

48 c7 c0 3c 00 00 00    mov    $0x3c,%rax
0f 05                   syscall
