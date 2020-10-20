def prime_range(n):
    l = list(range(2,n+1))

    for i in l:
        for j in l[l.index(i)+1:]:
            if j%i == 0:
                l.remove(j)
    
    return l


if __name__ == "__main__":
    val = int(input("Enter Start Range: "))
    prime = prime_range(val)
    print(len(prime))
