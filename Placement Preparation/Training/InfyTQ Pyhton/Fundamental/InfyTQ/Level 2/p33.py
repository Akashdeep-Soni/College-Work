#PF-Prac-33
def integer_to_english(number):
    #start writing your code here
    if number < 1 or number > 1000:
        return -1
    elif number == 1000:
        return "one thousand"
    else:
        single_digit = ['','one','two','three','four','five','six','seven','eight','nine']
        two_digit = ['ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen','eighteen','nineteen']
        ten_multiples = ['','','twenty','thirty','forty','fifty','sixty','seventy','eighty','ninety']
        
        
        flag_three_digit = False
        flag_two_digit = False
        num_en = ""
        number = str(number)
        if len(number) == 3:
            num_en += single_digit[int(number[0])] + " hundred"
            number = number[1:]
            flag_three_digit = True
        
        if len(number) == 2:
            num_int = int(number)
            if number == '00':
                number = ''
            else:
                if flag_three_digit:
                    num_en += " and "
                
                if number[0] == '0':
                    number = number[-1]
                elif num_int >= 10 and num_int <= 19:
                    num_en += two_digit[int(number[-1])]
                    number = ''
                else:
                    num_en += ten_multiples[int(number[0])]
                    flag_two_digit = True
                    number = number[-1]
        if len(number) == 1 and number != '0':
            if flag_two_digit:
                num_en += ' '
            num_en += single_digit[int(number)]
        
        return num_en

number=789
print(integer_to_english(number))