#PF-Prac-5

def count_digits_letters(sentence):

    #start writing your code here

    result_list = [0]*2

    for i in sentence:

        if i.isdigit():

            result_list[1] += 1

        elif i.isalpha():

            result_list[0] += 1

    

    return result_list



sentence="Infosys Mysore 570027"

print(count_digits_letters(sentence))