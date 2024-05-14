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

La manipulation du token jwt ne servait à rien. 
Il faut de nouveau manipuler les informations envoyées au serveur lors de la récupération du billet. En effet au moment ou on demande notre billet, on appel un endpoint de l'api "*/riche*, avec en paramètre un json qui contient un paramètre "*token*".

Si on modifie la valeur du paramètre "*token*" par la classe de billets que l'on veux (ici **VIP**), on obtient un fichier jpg différent de la première partie du challenge. Ce qui permet de valider le challenge.

**Flag** : 404CTF{b7554ee60d0020216749d428830a55f1}
