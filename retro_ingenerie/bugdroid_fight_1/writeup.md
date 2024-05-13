# Retro Ingénierie - Bugdroid Fight 1 /2 - Facile 750 (points variables)

## Enonce 

Un Bugdroid sauvage apparait !

Il est temps de mettre vos compétences de boxe en pratique, mais attention, cette fois il n'y a ni ring ni arbitre. Assurez-vous de bien observer autour de vous car, comme sur le ring, il est important de connaître les habitudes de son adversaire. Bon courage,

Retrouvez le message du Bugdroid.

Format de flag : 404CTF{message}
Auteur : Whiplash

### Fichiers fournis :

- Bugdroid_Fight_-_Part_1.apk : Une application android

## Solution

On nous fourni une application en nous demandant de trouver un message à l'intérieur. On ouvre donc l'application avec "**jadx-gui**" pour regarder son contenu.
Une fois ouvert, afin de trouver le point d'entrée de l'application on regarde le AndroidManifest.xml (item "Activity").
Ce qui nous pointe vers package "com.example.reverseintro" qui contient plusieurs classes.
Dans la classe "**Utils**" on trouve la string suivante, qui n'est référencée nulle part ailleurs dans le code :

> String lastPart = "_m3S5ag3!";

Le challenge va donc être une *grande* chasse aux morceaux de flags. J'ai passé en revue les autres classes présentes dans le package, et on trouve dans **MainActivityKt** : 

> public static final String element = "Br4v0_tU_as_";

Ce qui ressemble a un début de flag. Mais aucune autre classe ne contenant le reste du flag, il faut donc chercher ailleurs... 
On cherche un bout de string en mode "ressource" (i.e. disponible mais non utilisée), par conséquent l'endroit le plus probable est dans les resources de l'APK, dans le fichiers "**strings.xml**".
On regarde donc dans Resources -> resources.arsc -> res -> values -> strings.xml. Après un court moment de scroll, on trouve l'attibut suivant :

> \<string name="attr_special">tr0uv3_m0N\</string>

On a quelque chose qui ressemble à un message cohérent. On tente de flag, ça passe.

**Flag** : 404CTF{Br4v0_tU_as_tr0uv3_m0N_m3S5ag3!}