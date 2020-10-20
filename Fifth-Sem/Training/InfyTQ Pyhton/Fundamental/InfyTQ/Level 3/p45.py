#PF-Prac-45

def longest_common_substring(string1, string2):
    #start writing your code here
    ls1 = len(string1)
    ls2 = len(string2)
    a = [[0 for i in range(ls1+1)] for j in range(ls2+1)]
    
    mx, ix = 0, 0
    for i in range(ls2):
        for j in range(ls1):
            if string2[i] == string1[j]:
                a[i+1][j+1] = a[i][j]+1
                if mx < a[i+1][j+1]:
                    mx,ix = a[i+1][j+1], j+1
    
    x_longest = ix
    longest = mx
    return string1[x_longest - longest: x_longest]

output=longest_common_substring("pirate","teepee")
print("The longest overlap of characters between string1 and string2:",output)
output=longest_common_substring("discatenation","concatenation")
print("The longest overlap of characters between string1 and string2:",output)
output1=longest_common_substring("assured","measured")
print("The longest overlap of characters between string1 and string2:",output1)
output1=longest_common_substring("fish","bowl")
print("The longest overlap of characters between string1 and string2:",output1)