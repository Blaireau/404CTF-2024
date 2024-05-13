# Sécurité Matérielle - Soulevé de GND - Facile variable

## Enonce 

Hooooo - Hiiiiissse......
Hooooo - Hiiiiissse......
Hooooo - Hiiiiissse......

Waouh ça fait du bien de soulever un peu de fonte ! Mais dites donc ! C'est que vous avez des sacrés bras vous ! J'ai une petite épreuve pour vous, c'est du soulevé de terre... mais la terre bouge avec vous ! Hehe... vous m'en direz des nouvelles !

Format de flag : 404CTF{motdepasse}
Auteur : Redhpm

### Fichiers fournis :

- chall.py : Un script Python

## Solution

On commence par installer la librairie utilisée par le challenge "**myhdl**"

> pip3 install myhdl

En lançant le script on a une première assertion sur la taille de la saisie : La saisie doit faire **25 caractères**.

En modifiant le script on peux faire un bruteforce manuel, un peu fastidieux mais qui permet de retrouver la clef après 25 essais.

**Flag** : 404CTF{N3_perd3z_P45_v0tr3_t3rRe}