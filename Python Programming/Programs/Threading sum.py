from threading import Thread,Timer
import time
def func1():
    result_sum=0
    #Write the code to find the sum of numbers from 1 to 10000000
    for i in range(1,10000001):
        result_sum+=i
    print("Sum from func1:\n",result_sum)

def func2():
    result_sum=0
    #Write the code to accept 5 numbers from user and find its sum
    l=map(int,input("Enter 5 Numbers ").split())
    for i in l:
        result_sum+=i
    print("Sum from func2:",result_sum)

#Modify the code given below to execute func1() and func2() in two separate threads
Th1=Timer(8,func1)
Th2=Thread(target=func2)
Th1.start()
time.sleep(4)
Th2.start()
Th1.join()
Th2.join()
