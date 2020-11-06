def leap_year(year):
    c=0
    list_year=[]
    while c<15:
        if (year%4==0 and year%100!=0) or year%400==0:
            list_year.append(year)
            c+=1
        year+=1
        
    return list_year



year=int(input("Enter Year "))
print(leap_year(year))
