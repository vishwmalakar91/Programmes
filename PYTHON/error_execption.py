try:
    print(10/2)
    print(10/0)
    print(10/3)

#print(2*kj)
except ValueError:
    print("value")

except: #default
    print("exception found")
else:
    print("code looks good")