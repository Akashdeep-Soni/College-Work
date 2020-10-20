from math import log10

def request_loan_emi():
    print("Your Requirement")
    loan_amount = int(input("Enter Loan Amount:"))
    emi = int(input("Enter number of Emi:"))
    return loan_amount,emi


print("         Welcome to Metro Bank")
while True:
    account_number = int(input("Enter Account Number:"))
    if not(int(log10(account_number)+1)==4 and str(account_number)[0]=='1'):
        print("Invalid Account Number")
    else:
        break

account_balance = int(input("Enter Account Balance:"))
if account_balance >= 100000:
    salary = int(input("Enter Salary:"))
    loan_type = input("Enter Loan type (car, house, business):")
    if salary>25000 and loan_type=="car":
        request = request_loan_emi()
        if request[0] < 500000 and request[1] <= 36:
            print("Loan Approved: Amount",request[0],"Emi",request[1])
        else:
            print("Loan Request Not Approved")
    elif salary>50000 and loan_type=="house":
        request = request_loan_emi()
        if request[0] < 6000000 and request[1] <= 60:
            print("Loan Approved: Amount",request[0],"Emi",request[1])
        else:
            print("Loan Request Not Approved")
    elif salary>75000 and loan_type=="car":
        request = request_loan_emi()
        if request[0] < 7500000 and request[1] <= 84:
            print("Loan Approved: Amount",request[0],"Emi",request[1])
        else:
            print("Loan Request Not Approved")
else:
    print("Minimum Account Balance INR 1 Lacks is not maintained")