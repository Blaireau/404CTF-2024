# Cryptanalyse - Bebe Nageur - Introduction 100

## Enonce 

Vous ressortez de votre premier cours de natation et quelqu'un vous a laissé un petit mot dans votre casier. Vous suspectez votre rival que vous venez juste de battre à plate couture lors d'une course effrénée dans le bassin des bébés nageurs.
 
Déchiffrez ce message.

Auteurs : @Little_endi4ane & @acmo0

### Fichiers fournis :

- challenge.py : Un script python.
- Le flag chiffré est fourni dans le fichier de script en commentaire :
    - **-4-c57T5fUq9UdO0lOqiMqS4Hy0lqM4ekq-0vqwiNoqzUq5O9tyYoUq2_**

## Solution

Le script Python est une implémentation d'un chiffre de transposition (affine ?), avec deux paramètres aléatoires mais bornés.
La *difficulté* va être de retrouver ces deux paramètres pour re-calculer l'alphabet de transposition, et donc déchiffrer le flag.
Le fichier **solve.py** permet de calculer et retrouver le flag.

**Flag** : 404CTF{Th3_r3vEnGE_1S_c0minG_S0oN_4nD_w1Ll_b3_TErRiBl3_!}