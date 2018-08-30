dictionary={
'absent_in_all_subject' : 'john',
'present_in_all_sujects': 'Rahul, Ravi',
'present_in_atleast_two_subject' : 'Shyam, Dinesh',
'present_in_only_one_sub' : 'Puja'
}

print(dictionary['absent_in_all_subject'])
for key,value in dictionary.items() :
    print(key,":",value)
dictionary.update({'present_in_atleast_two_subject':'Dinesh,Ravi,Ram,Neha,Shyam,Rahul'})
print(dictionary)
