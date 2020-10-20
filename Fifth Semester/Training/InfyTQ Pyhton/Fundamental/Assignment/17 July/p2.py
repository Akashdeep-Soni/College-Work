courses = ("Python Programming","RDBMS", "Web Technology", "Software Engineering")
electives = ("Business Intelligence","Big Data Analytics")

print('''Number of courses opted by Student "John":''',len(courses))
print()

print('''All the courses opted by Student "John":''',*courses,sep="\n")
print()

total_courses = courses + electives
print("Total courses after including electives:",*total_courses,sep="\n")
print()

try:
    total_courses[total_courses.index("Software Engineering")] = "Computer Networks"
    print("Updated Course List:",*total_courses,sep="\n")
except:
    print("Tuple is immutable.\nJohn subject once opted can't be changed")