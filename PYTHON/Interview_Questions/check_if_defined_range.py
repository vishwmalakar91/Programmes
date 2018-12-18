def test_range(num):
   if num in range(0, 101):
      print("it is in range " + str(num))
   else:
      print("out of range",num)

test_range(60)
test_range(200)