class node:
    def __init__(self,val):
        self.data=val
        self.next=None

class linkedlist:
    def __init__(self):
        self.head=None
        self.tail=None
    
    def insertnode(self,val):
        newnode=node(val)
        if self.head==None:
            self.tail=self.head=newnode
        else:
            self.tail.next=newnode
        
        self.tail=newnode
    
    def printnode(self):
        ptr=self.head
        while ptr!=None:
            print(ptr.data)
            ptr=ptr.next
            
            

if __name__=="__main__":
    llist=linkedlist()
    if llist.head==None:
        print("HI")
        
    n=int(input("Enter number of elemenets: "))
    for _ in range(n):
        val=int(input("Enter data: "))
        llist.insertnode(val)
    
    llist.printnode()
