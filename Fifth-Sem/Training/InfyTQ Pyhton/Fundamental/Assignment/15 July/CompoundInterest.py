def calculate_a(p,r,n,q):
    return p*((1+r/q)**(n*q))

if __name__ == "__main__":
    print("Enter 10 sets of p, r, n and q separated by single whitespace")
    for _ in range(10):
        l = list(map(float,input().split()))
        val = calculate_a(l[0], l[1], l[2], l[3])
        print("Amount a",round(val,2))