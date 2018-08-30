def greeting(user_name):
    print("Hello",user_name)
greeting("vishwa")

def product(x,y):
    return x*y
def addition(x,y):
    return x+y
print(product(2,3))
print(addition(2,3))

def info(name,age):
    print("Name is" ,name)
    print("Age is",age)
info("vishwa",26) # need to know the sequence
info(age="24",name="John") #prefer using this 

def default_fun(Winner='France',year='2018'):
    print(Winner,year)
default_fun("India",2022)
default_fun("India")
default_fun(year="2030")