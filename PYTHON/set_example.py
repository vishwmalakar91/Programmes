list_of_students={"Ram","Neha","Dinesh","Ravi","john","Rahul","Shyam","Puja"}
English_attendence={"Neha","Dinesh","Ravi","Rahul","Shyam"}
Hindi_attendence={"Ram","Ravi","Rahul","Shyam","Puja"}
Math_attendence={"Ram","Neha","Dinesh","Ravi","Rahul"}

#students who was absents for all class
absentees=list_of_students-English_attendence - Hindi_attendence - Math_attendence
print("absent in all subject :",absentees)

#students who attended all subject
presents_all=list_of_students.intersection(English_attendence.intersection(Hindi_attendence.intersection(Math_attendence)))
print("present in all sujects:",presents_all)

#student attended at least 2 subject
present_English_Hindi=list_of_students.intersection(English_attendence.intersection(Hindi_attendence))
present_English_Math=list_of_students.intersection(English_attendence.intersection(Math_attendence))
present_Hindi_Math=list_of_students.intersection(Hindi_attendence.intersection(Math_attendence))
#print(present_English_Hindi)
#print(present_English_Math)
#print(present_Hindi_Math)
present_atlest_two=present_English_Hindi.union(present_English_Math.union(present_Hindi_Math))
print("present in atleast two subject :",present_atlest_two)

#student who attendet only one subject
present_only_one=list_of_students-present_atlest_two-absentees
print("present in only one sub :",present_only_one)
