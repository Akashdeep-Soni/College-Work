#PF-Tryout
from datetime import *
def add_days(current_date, days_to_add):

    while current_date.weekday() >= 5:
            current_date += timedelta(days=1)
            
    while days_to_add >= 0:
        if days_to_add != 0:
            current_date += timedelta(days=1)
        while current_date.weekday() >= 5:
            current_date += timedelta(days=1)
        days_to_add -= 1
        
    return current_date

def generate_schedule(module_list,duration_list,start_date):   
    #start writing your code here
    if max(duration_list) >= 10:
        print(-1)
        return

    current_date = datetime.strptime(start_date,"%d-%m-%Y")
    
    for i in range(len(module_list)):
        end_date = add_days(current_date, duration_list[i] - 1)
        current_pr_date = current_date.strftime("%d-%m-%Y")
        end_pr_date = end_date.strftime("%d-%m-%Y")
        print(module_list[i],"- Start Date:",current_pr_date,"End Date:",end_pr_date)
        current_date = add_days((end_date + timedelta(days=1)),-1)

module_list=["PF","OOP","cs"]
duration_list=[2,8,9]
start_date="06-08-2020"
generate_schedule(module_list, duration_list, start_date)
    
