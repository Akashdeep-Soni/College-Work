def cal_premium(health,age,city,gender):
    if health=="excellent" and (age>=25 and age<=35) and city=='yes':
        if gender=='male':
            print("\nInsured\nPremium rate: RS. 4 per Thousand\nMaximum Amount: Rs. 2 lakhs")
        else:
            print("\nInsured\nPremium rate: RS. 3 per Thousand\nMaximum Amount: Rs. 1 lakhs")
    elif health=='poor' and (age>=25 and age<=35) and city=='no' and gender == 'male':
        print("\nInsured\nMaximum Amount: Rs. 10 Thousand")
    else:
        print("\nNot Insured")


health = input("How is health: 'excellent' or 'poor' ")
age = int(input("Enter age: "))
city = input("Are you living in city: 'yes' or 'no' ")
gender = input("Enter gender: 'male' or 'female' ")

cal_premium(health,age,city,gender)