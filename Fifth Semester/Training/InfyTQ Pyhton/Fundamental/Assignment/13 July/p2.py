def illiteracy_computer(total_population_count):
    total_population = 100
    total_literate = 48
    total_illiterate = 100 -  total_literate

    total_men = 52
    total_women = 100 - total_men

    literate_men = 35
    literate_women = total_literate - literate_men

    illiterate_men = total_men - literate_men
    illiterate_women = total_illiterate - illiterate_men

    illiterate_men_count = (total_population_count * illiterate_men)//100
    illiterate_women_count = (total_population_count * illiterate_women)//100

    print("Illiterate_men:",illiterate_men_count)
    print("Illiterate_women:",illiterate_women_count)
    

    
if __name__ =='__main__':
    population = 80000
    illiteracy_computer(population)
    



