# Steganographie - L'absence - Introduction 100pts

## Enonce 

Hier, Francis n'était pas là à son épreuve de barres asymétriques, il nous a envoyé une lettre d'excuse. Malheureusement, la fin de sa lettre est illisible.
Déchiffrez la fin de ses excuses.

Auteurs : Crevette et Ceriseuh

### Fichiers fournis :

- lettre.txt : un document texte

## Solution

On remarque trois choses dans la lettre :

- Une première partie écrite en minuscules, avec de temps en temps des majuscules
- Une signature par "franciS **vigenere**"
- Une chaine chiffrée en guise de post-scriptum

La signature fait penser au chiffre de **vigenere**.
En isolant les lettres de la première partie on obtient le mot GYMANSTIQUES
En utilisant ce mot comme clef de vigenere dans un outil comme "*CyberChef*", on arrive à décoder la troisième partie :

> En effet, j'ai du m'absenter car le drapeau de ma nation a ete dissimule par des gens qui voulaient faire perdre mon pays ! Mais apres une longue recherche, j'ai enfin pu le retrouver. Le voici : 404CTF{NeVolezPasLesDrapeauxSvp}

**Flag** : 404CTF{NeVolezPasLesDrapeauxSvp}
