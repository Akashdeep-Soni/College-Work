#PF-Prac-39
def max_populated_state(cities_dict,state):
    #start writing your code here
    max_populated_city = cities_dict[0]
    for i in cities_dict[1:]:
        if i['State'] == state:
            if i['Population'] > max_populated_city['Population']:
                max_populated_city = i
            elif i['Population'] == max_populated_city['Population']:
                if i['Name'] < max_populated_city['Name']:
                    max_populated_city = i
    return max_populated_city
    
cities_dict = [
 {'Name':'Vancouver','State':'WA','Population':161791},
 {'Name':'Salem','State':'OR','Population':154637},
 {'Name':'Seattle','State':'WA','Population':80885},
 {'Name':'Bellingham','State':'WA','Population':608660},
 {'Name':'Spokane','State':'WA','Population':208916},
 {'Name':'Bellevue','State':'WA','Population':608660},
 {'Name':'Portland','State':'OR','Population':583776}
 ]
state="WA"
print("The city details are:",cities_dict)
print("State:",state)
output=max_populated_state(cities_dict,state)
print("The highest populated city in the given state is:",output)