# Steganographie - La Chute - Moyen variable

## Enonce 

Et l'athlète s'élance, sa performance est jusqu'à présent sans fautes !
Mais, que vient-il de se passer ? Il est tombé ! J'espère qu'il n'est pas gravement blessé, car rien n'est encore joué. D'ailleurs, il essaie de nous dire quelque chose !

Mais qu'est-ce qu'il a bien pu vouloir dire ?

Auteurs : Crevette et Ceriseuh

### Fichiers fournis :

- charabia.txt : Le document contient une chaîne de caractère qui doit contenir le flag

## Solution

Le fichier charabia contient une suite de caractères incompréhensibles, dans leque le flag est caché.
En parcourant le fichier on remarque que que la chaîne "404", qui fait partie du format du flag, est présente.
Cette chaîne est suivie de 4 caractères, puis du symbole "{", ce qui est un indicateur du format du flag.

On suppose donc que le contenu du fichier est une simple substitution. En faisant une analyse fréquentielle on se rends compte que le caractère "л" est le plus présent. On pourrais supposer que c'est le "e", lettre la plus fréquent en français, mais si on a à faire un texte avec des mots, on va supposer que ce caractère est un espace.

La suite de caractère "[$λΣ", doit encoder les lettres "C", "T" et "F", cela nous indique qu'un bigramme peut encoder une lettre. Il se trouve que le bigramme "[$" se trouve plusieurs fois dans le texte, alors que les deux autres bigrammes ("$λ" et "λΣ") ne sont présents qu'une seule fois. On part donc sur :

> "[$" encode "C"

On remplace toutes les occurences du bigramme dans le texte. L'analyse fréquentielle a aussi indiquée que "^" est le caractère le plus présent dans le texte, avec une valeur proche des occurences de la lettre "E". On part donc sur : 

> "^" encode "E"

En continuant ainsi, par recherche et remplacement, on reconstruit au fur et à mesure le texte (cf. **charabia_decoded.txt**) et on trouve le flag.

**Flag** : 404CTF{CONTRE_LES_CHUTES_CHERCHEZ_LES_DRAPEAUX}