from bitstring import BitArray

in_file = open("chall.bin", 'rb')
bin_string = ''
flag = ''

print("[+] Lecture du fichier")

for i in in_file:
    c = BitArray(i)
    bin_string += c.bin

print("[+] Decodage de la chaine binaire")
# On sait que chaque trame fait 10 bits. On va donc lire la chaine 10 par 10

for i in range(0,len(bin_string)-2, 10):
    # On lit dix bits
    sub_bin = bin_string[i:i+10]
    # On extrait les bits de data
    char_data = sub_bin[1:8]
    # On reverse les bits de data, et on les decode
    flag += chr(int(char_data[::-1], 2))

print("[+] Flag : "+flag)

in_file.close()