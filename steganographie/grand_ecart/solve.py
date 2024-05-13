chal_txt = open('challenge.txt','rb')
orig_txt = open('mobydick.txt','rb')
out_file = open('diff.png','wb')

offset = 150

while 1:
    
    chal_txt.seek(offset)
    orig_txt.seek(offset)
    char_chal, char_orig = chal_txt.read(1), orig_txt.read(1)    

    if not char_chal :
        break

    out_file.write((ord(char_chal)^ord(char_orig)).to_bytes())
    offset += 30

chal_txt.close()
orig_txt.close()
out_file.close()