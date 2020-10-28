class Stack:
    def __init__(self,max_size):
        self.__max_size=max_size
        self.__elements=[None]*self.__max_size
        self.__top=-1
    
    def get_max_size(self):
        return self.__max_size
    
    def is_full(self):
        if self.__top == self.__max_size-1:
            return True
        return False
        #Remove pass and copy the code you had written to check whether stack is full.
    
    def push(self,data):
        if not self.is_full():
            self.__top += 1
            self.__elements[self.__top] = data
        else:
            print("Stack is full")

        #Remove pass and copy the code you had written to push an element.

    
    def is_empty(self):
        if self.__top == -1:
            return True
        return False
        #Remove pass and write the logic to check whether stack is empty. If the stack is empty, return true else return false.
    
    def pop(self):
        if not self.is_empty():
            temp = self.__elements[self.__top]
            self.__top -= 1
            return temp
        else:
            return "Stack is Empty"
        #Remove pass and write the logic to pop an element. Pop the element only if stack is not empty. Otherwise, display appropriate message

    def display(self):
        print("Displaying")
        temp = self.__top
        while temp >= 0:
            print(self.__elements[temp])
            temp -= 1
        #Remove pass and write the logic to display the element(s).
                                              
    #You can use the below __str__() to print the elements of the DS object while debugging
    def __str__(self):
        msg=[]
        index=self.__top
        while(index>=0):
            msg.append((str)(self.__elements[index]))
            index-=1
        msg=" ".join(msg)
        msg="Stack data(Top to Bottom): "+msg
        return msg

stack1=Stack(5)
#Push all the required element(s).
#Pop an element
stack1.push(13)
stack1.push(32)
stack1.push(33)
stack1.push(23)
stack1.push(34)
stack1.push(53)
stack1.push(32)
print("Pop",stack1.pop())
stack1.display()
print("Pop",stack1.pop())
print("Pop",stack1.pop())
print("Pop",stack1.pop())
print("Pop",stack1.pop())
print("Pop",stack1.pop())
print("Pop",stack1.pop())
