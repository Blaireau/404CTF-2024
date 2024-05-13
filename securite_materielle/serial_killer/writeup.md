# Sécurité Matérielle - Serial Killer - Introduction 100pts

## Enonce 

Et votre prochaine épreuve est... le déménagement ? Vous avez donc invité votre amie haltérophile pour vous donner un coup de main et, en deux temps trois mouvements, tout est déballé et rangé. Tout se passait bien jusqu'au moment de rebrancher votre Arduino à votre PC. Elle essaie de rebrancher le port USB, mais ne dose pas sa force et... CRAC ! Le port se casse ! Cet événement vous affecte grandement.

Vous décidez de récupérer et de déchiffrer les dernières paroles que votre Arduino avait transmises à votre ordinateur afin de pouvoir les ajouter à son épitaphe.

https://docs.arduino.cc/learn/communication/uart/#technical-specifications

Auteur : Jauttaro Coudjau

### Fichiers fournis :

- chall.bin : Un dump d'un échange entre l'arduino et le PC

## Solution

En lisant la documentation, on apprends que le format "*par défaut*" d'une trame UART est le suivant :

> 1 bit start --> Toujours == 0
> 5 à 9 bits de données
> 1 ou 2 bit de parité 
> 1 bit stop --> Toujours == 1

En lisant d'autres specs techniques, on apprends que les trames "standard" font 7 ou 8 bits de données, et que les données sont transmises en mode "*LSB first*" (i.e. le bit de poids faible en premier). De plus le deuxième bit de parité n'est utilisé que dans des rares cas particuliers.

En essayant *à la main* plusieurs formats de trames, on trouve que le format qui est envoyé est le suivant :

> 1 bit start
> 7 bits data
> 1 bit de parité
> 1 bit stop

Une fois les 7 bits de data extraits on doit les renverser (*LSB first*)

Le script solve.py permet d'afficher le flag à partir du fichier fourni.

**Flag** : 404CTF{Un3_7r1Ste_f1N_p0Ur_uN3_c4r73_1nn0c3nt3}
