#PF-Tryout
def find_five_digit():
	#start writing your code here
	for i in range(10000,100000):
	    l = list(str(i))
	    if sum(map(int,l)) == 19 and sum(map(int,l[2:])) == int(l[0]):
	        if int(l[0]) - int(l[1]) == 2 and int(l[1]) - int(l[2]) == 2 and int(l[2]) - int(l[3]) == 2 and int(l[4]) - int(l[3]) == 2:
	            print(i)
	        
	        
	    
	
	

find_five_digit()