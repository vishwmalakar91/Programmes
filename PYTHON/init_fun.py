class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def myfunc(self):
        print("Hello my name is " + self.name)


obj = Person("John", 36)

print(obj.name)
print(obj.age)

obj.myfunc()

obj.age=50;
print(obj.age)
del obj

#Note: The __init__() function is called automatically every time the class is being used to create a new object.
#All classes have a function called __init__(), which is always executed when the class is being initiated.
#Use the __init__() function to assign values to object properties, or other operations that are necessary to do when the object is being created:

#The self parameter is a reference to the class itself, and is used to access variables that belongs to the class.
#It does not have to be named self , you can call it whatever you like, but it has to be the first parameter of any function in the class:
