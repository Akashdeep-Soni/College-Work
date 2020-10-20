#PF-Prac-6

def list123(nums):

    #start writing your code here

    for i in range(len(nums)-2):

        if [1,2,3] == nums[i:i+3]:

            return True

    

    return False

    



    



nums=[1,2,3,4,5]

print(list123(nums))