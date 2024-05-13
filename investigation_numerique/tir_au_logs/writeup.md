# Investigation numérique - Le tir aux logs - Introduction 100

## Enonce 

Il semblerait qu'une personne malveillante ait réussi à se connecter sur le site d'inscription d'une compétition de tir à l'arc.
Aidez-nous à investiguer sur cette attaque via le fichier de logs de notre serveur. Quel est l'URL complète qui a permis de se connecter de manière frauduleuse ?

Le flag attendu est l'URL utilisée par l'attaquant pour exploiter une vulnérabilité du site avec succès, entouré du format habituel.
Par exemple, si l'attaquant se rend sur la page https://example.com?authenticated=1 pour se connecter de manière frauduleuse, le flag sera 404CTF{https://example.com?authenticated=1}.
Par ailleurs, toutes les IP utilisées sont fictives et non pertinentes.

Auteur ElPouleto

### Fichiers fournis :
- access.log : Un fichier de log d'authentification d'un site web.

## Solution

Il suffit de trouver une URL dans le fichier de log, par chance il n'y a que 56 lignes dans le fichier, on peux faire une analyse manuelle.
De la ligne 31 à 38, on voit des requêtes qui sortent du lot avec ce qui ressemble à des techniques d'injections SQL.
La dernière ligne montre que l'attaquant arrive à accéder la page d'admin, par conséquent l'URL recherché est la précédent dans le log.
On a plus qu'à crafter le flag.

**Flag** : 404CTF{http://www.inscription_tir_arc.com/index.php?username=admin%27%23&password=test}