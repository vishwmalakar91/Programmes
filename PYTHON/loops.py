thislist2 = ["apple", "banana", "cherry"]
if "apple" in thislist2:
  print("Yes, 'apple' is in the fruits list")


i = 1
while i < 6:
  print(i)
  i += 1

print("===========")

i = 1
while i < 6:
  print(i)
  if i == 3:
    break
  i += 1

print("===========")

i = 0
while i < 6:
  i += 1
  if i == 3:
    continue
  print(i)

print("===========")

