set1=set("abcabc")
print(set1)
set2={'a','b','c','a','b'}
print(set2)
set3={1,2,3,4}
set3.add(5)
print(set3)
set3.remove(1)
print(set3)
#set3.clear()
#print(set3)
set4=set2.union(set3)
print(set4)
set5=set4.intersection(set3)
print(set5)
print(set2.issuperset(set3))
print(set2.issubset(set3))
print(set4>set3)