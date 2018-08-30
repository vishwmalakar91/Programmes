try:
    a=int(input("enter a positive integer:"))
    if(a>0):
        print("square of ",a,"is",a*a)
    else:
            raise ValueError("oh no ! Exception catched - its not a positive integer")
except ValueError as ve :
    print(ve)
else:
    print("code executed !")