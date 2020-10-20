#PF-Prac-26
def check_occurence(string):
    #start writing your code here
    string = string.lower()
    return string.count('jet') == string.count('mat')
        
string="Jet on the Mat but mat is too long"
print(check_occurence(string))