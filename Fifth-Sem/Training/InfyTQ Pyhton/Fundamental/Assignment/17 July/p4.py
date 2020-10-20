def create_stack():
    return list()

def push_stack(val,l):
    l.append(val)

def pop_stack(l):
    if len(l)>0:
        return l.pop()
    else:
        return "Empty"

def display_stack(l):
    print(*l)


while True:
    ch = int(input("1.Create Stack\n2.Push Stack\n3.Pop Stack\n4.Display\n5.Exit: "))
    if ch == 1:
        stack = create_stack()
    elif ch == 2:
        v = int(input("Enter Value: "))
        push_stack(v,stack)
    elif ch == 3:
        v = pop_stack(stack)
        print("Popped Item:",v)
    elif ch == 4:
        display_stack(stack)
    else:
        break
