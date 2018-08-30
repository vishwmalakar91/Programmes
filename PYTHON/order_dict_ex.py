import collections
od=collections.OrderedDict({'a':1,'b':2,'c':3,'d':5})
for key,value in od.items():
    print(key,value)
print("--")
od.popitem()
for key,value in od.items():
    print(key,value)
