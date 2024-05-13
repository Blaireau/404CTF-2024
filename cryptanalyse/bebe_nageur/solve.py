charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789{}_-!"
flag = "-4-c57T5fUq9UdO0lOqiMqS4Hy0lqM4ekq-0vqwiNoqzUq5O9tyYoUq2_"
alphabet = {}
out_flag = ''

# Retrouvons les paramètres a et b

# cipher => charset[((a * x) + b) % n]
# n == len(charset) == 67
# 2 <= a <= 66 : 64 valeurs
# 1 <= b <= 66 : 65 valeurs
# Soit 4290 valeurs à brute-force. Easy-Peasy

# On suppose que les trois premières valeurs du flag correspondent à "404"
# le format de flag étant "404CTF"

#C'est sale, mais ça permet une comparaison visuelle
#count = 0
#for a in range(2, 67):
#   for b in range(1, 67):
#        if ((a * charset.index('4') + b) % len(charset)) == charset.index(flag[0]) :
#            print("Couple found -> a : "+str(a)+" b : "+str(b))
#            count += 1
#print(count)
#count = 0
#for a in range(2, 67):
#    for b in range(1, 67):
#        if ((a * charset.index('0') + b) % len(charset)) == charset.index(flag[1]) :
#            print("Couple found -> a : "+str(a)+" b : "+str(b))
#            count += 1
#print(count)
#count = 0
#for a in range(2, 67):
#    for b in range(1, 67):
#        if ((a * charset.index('C') + b) % len(charset)) == charset.index(flag[3]) :
#            print("Couple found -> a : "+str(a)+" b : "+str(b))
#            count += 1
#print(count)

# En faisant un diff avec les yeux et Notepad++ : a = 19, b = 6
# On va pouvoir recréer le dictionnaire de transposition.

for indice in range(len(charset)):
    alphabet[charset[(19 * indice + 6) % 67]] = charset[indice]

for i in flag:
    out_flag += alphabet[i]

print(out_flag)