import collections
Employee=collections.namedtuple('Employee',('name','age','address'))
emp1=Employee('rahul',26,'Pune')
emp2=Employee('dinesh',20,'Delhi')
print(emp1.address)
print(getattr(emp1,'age'))
