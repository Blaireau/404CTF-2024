# Web - Le match du siècle Partie 1 - Introduction 100pts

## Enonce 

Vous voilà à quelques semaines du match tant attendu entre le Gorfou FC et l'AS Sealion.
Seulement, vous vous êtes pris au dernier moment pour acheter votre place. Trouvez un moyen d'obtenir un billet !

Auteur : callister

### Fichiers fournis :

- https://le-match-du-siecle.challenges.404ctf.fr : le site web a exploité

## Solution

Un rapide tour du site web nous montre qu'on peux s'enregistrer puis s'authentifier.\
Une fois loggué sur le site on ne peux pas acheter de billets car on a pas de fonds, on ne peux pas en rajouter et les billets VIP sont épuisés.\

On peux appeler l'URL : https://le-match-du-siecle.challenges.404ctf.fr/?reponse=1 
Cette URL permet d'avoir un message nous remerciant pour notre achat, mais sans grand succès.

On se rends compte qu'un cookie avec un token jwt est créée, ainsi qu'un cookie "**balance**".

En modifiant ce dernier cookie, on recharge la page et on peux acheter des places. Une fois les places achetées, on peux aller dans la partie "Mes billets" et en cliquant sur "Obtenir", on récupère une image avec le flag.

**Flag** : 404CTF{b5a77ed0fa6968b21df7fb137437fae1}
