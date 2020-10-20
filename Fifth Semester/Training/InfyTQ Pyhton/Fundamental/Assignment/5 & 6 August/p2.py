with open('p1abc.txt','r') as f1:
    with open('p2abc.txt','w') as f2:
        f2.writelines(f1.readlines())