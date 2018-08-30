import collections
counter_01=collections.Counter(['A','B','A'])
print(counter_01)
counter_02=collections.Counter({'Book':2,'Pen':4,'Pencile':5})
print(counter_02)
print(counter_02['Pen'])
counter_03=collections.Counter(Book=20,Pen=40,Pencile=50)
print(counter_03)

counter_01.update(['C']) #adding c
print(counter_01)

counter_02.update({'Pencile':6}) #adding 6 pencile
print(counter_02)
mylist=list(counter_02.elements())
print(mylist)

counter_03.update(book=10) #adding book will another entry as case sensitve
print(counter_03)


del counter_01['C']
print(counter_01)
print(counter_01.most_common(1)) #with max occurency