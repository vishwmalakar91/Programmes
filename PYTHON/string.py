
print("abc\tdef") #\t for new tab
print("abc\ndef") #\n for new line

string="Vishwanath"
print(string[1])
print(string[0:6])
print(string[6:])
print(string.lower())
print(string.upper())
print(string.find("nath"))
print(string.startswith("Vish"))
print(string.replace("nath","jeet"))
string="vishwa-nath"
print(string)
mylist=string.split('-')
print(mylist)
joiner='_'
afterjoin=joiner.join(mylist)
print(afterjoin)

myname="        Deepak"
print(myname.strip()) #Remove swite space