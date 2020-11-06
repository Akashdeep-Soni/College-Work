from threading import Thread
def fun1():
    s=input("Enter your name  ")
    print("Your name is",s)

def fun2():
    for i in range(654321):
        x=i*i**3
    print("Done")

Th1=Thread(target=fun1)
Th2=Thread(target=fun2)

Th1.start()
Th2.start()

Th1.join()
Th2.join()
