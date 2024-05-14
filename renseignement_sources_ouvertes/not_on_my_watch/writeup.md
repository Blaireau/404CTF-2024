# Renseignement en source ouverte - Not on my watch - Facile points variables

## Enonce 

Vous êtes arbitre pour l'épreuve de ski de fond et vous accordez une attention particulière à tout ce qui touche au temps.

Cependant, en vous réveillant le matin de la compétition, vous vous rendez compte que votre belle montre de poche s'est arrêtée pendant la nuit. Vous la démontez et vous rendez compte que le mécanisme a l'air endommagé.
 
Sous le coup de la déception, vous entreprenez de trouver un nouveau mécanisme pour celle-ci. Vous vous renseignez donc sur le nombre de mécanismes qui ont été produits.
 
Si 1,000,387 mécanismes ont été produits, le format du flag sera:

Format du flag : 404CTF{1,000,387}
 
Auteur : HgAt

### Fichiers fournis :

- pocket_watch.jpg : Une photo de dos de montre

## Solution

La photo représente un mécanisme de montre. Plusieurs inscriptions sont visibles :*

- Waltham Mass
- 15 Jewels
- 15404141

On a donc le nom du constructeur (*Waltham Massachusets*), le modèle (*15 jewels*) et un numéro de série (*15404141*).
En faisant directement une recherche avec ces informations, on ne trouve rien de concret.
Néanmoins en affinant la recherche avec des termes comme "*number of waltham watches*", un site finir par remonter :

> https://pocketwatchdatabase.com/

En utilisant le moteur de recherche du site on finit par obtenir le nombre de mécanismes construits : 197100.
En le mettant au format demandé, on valide le challenge.

**Flag** : 404CTF{197,100}