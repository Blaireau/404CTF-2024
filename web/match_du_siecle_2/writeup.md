# Web - Le match du siècle Partie 2 - Moyen 200pts

## Enonce 

Vous avez déjà en votre possession un billet, néanmoins, pour impressionner votre famille, vous souhaiteriez des places VIP.

Auteur : callister

### Fichiers fournis :

- https://le-match-du-siecle.challenges.404ctf.fr : le site web a exploité

## Solution

On reprends le même site Web qu'au challenge précédent, mais cette fois-ci on nous demande d'acquérir un billet VIP.
~~Vu qu'on sait déjà comment manipuler notre solde, on va sans doute devoir manipuler le token JWT pour nous autoriser un billet VIP.~~

~~En simulant un achat, on se rend compte que l'algo de vérification passe de RS256 à HS256 (cf. fichier token_jwt)~~
~~En utilisant "**jwt_tools**" on va peut-être pouvoir retrouver le mot de passe servant à la signature afin de forger notre propre token.~~

La manipulation du token jwt ne servait à rien. Il fallait jouer avec les appels à différentes pages du site pour faire passer notre achat pour un achat de ticket VIP.
Suite à cette manipulation, lors de la récupération du billet, notre billet pass pour un billet VIP et lors du téléchargement on obtient un autre pdf avec le flag dedans.

**Flag** : {flag}
