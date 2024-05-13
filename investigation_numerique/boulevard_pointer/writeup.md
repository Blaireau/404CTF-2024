# Investigation Numérique - Un boulevard pour pointer - Introduction 100pts

## Enonce 

*Un script malveillant est présent dans le challenge. La protection de vos données est à votre charge.*

Eh petit.e, c'est à toi de jouer. J'ai jeté toutes mes boules et aucune n'est proche du cochonnet. Par contre, tu peux peut-être t'appuyer sur elles pour pointer.

Trouvez le flag. Le fichier une fois décompressé fait 6GO

Auteur : OwlyDuck

### Fichiers fournis :

- challenge.7z qui contient :
    - image.img : une image système
    - boule-1.pdf : Un pdf qui donne quelques indications/pistes
    - boule-2.pdf : Un pdf qui donne quelques indications/pistes

Pour des soucis de place, le fichier "challenge.7z" n'a pas été conservé

## Solution

On lit les deux fichiers pdf qui nous donne quelques indications sur comment démarrer le challenge.
Dans un premier temps on va essayer de monter le fichier image fourni

On créée des loopdevice depuis le fichier image : 
> sudo losetup -fP image.img 

On monte les device dans un répertoire pour pouvoir parcourir l'arborescence
> mkdir temp_mnt
> sudo mount /dev/loop0p2 temp_mnt

En parcourant l'arborescence on remarque que le répertoire "home" a été complétement vidé, et on récupère le fichier "*boule-3.pdf*" dans le répertoire */root* de l'arborescence.
Ce fichier nous pointe vers le filesystem XFS. En se renseignant un peu, on apprends que ce système de fichier permet la journalisation de répertoire, les fichiers utilisés ont l'extension "*.xfsdump*"
On lance une recherche sur l'arborescence pour voir si un fichier du genre existe :

> cd temp_mnt
> find ./ -type f -name "*.xfsdump"

On a bien un fichier "*.xfsdump*" : **var/backup/backup_home.xfsdump**

On peux donc utiliser la fonction *xfsrestore* pour extraire les fichiers du dump.

> mkdir xfs_out
> xfsrestore -f temp_mnt/var/backup/backup_home.xfsdump xfs_out

Depuis le début on nous fourni des fichiers pdf pour nous donner des pistes. On va donc voir si dans l'arborescence extraite on a un fichier pdf :

> find ./ -type f -name "*.pdf" 

On trouve le fichier "*cochonnet.pdf*" qui contient le flag.

**Flag** : 404CTF{bi1_joué_br4vo_c_le_fl4g}