from collections import Counter
medical_specialty = {'P':'Pediatrics', 'O':'Orthopedics', 'E':'ENT'}

patient_details = input("Enter Patient Details: ").split()
max_specialty = Counter(patient_details[1::2])
key = max_specialty.most_common(1)[0][0]

print("Medical Specialty visited by the maximum number of patients:",medical_specialty[key])