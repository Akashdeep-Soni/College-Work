import string
s="!Akas[]h\dee%p&&so{}ni"
for i in s:
    if i not in string.punctuation:
        print(i,end="")
