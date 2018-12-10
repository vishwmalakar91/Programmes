import ModuleM
import ModuleN as MN

ModuleM.greeting("Jonathan")
print(MN.person1["age"])

print(dir(ModuleM)) # Print all available functions or var

from ModuleO import person1
print (person1["age"])