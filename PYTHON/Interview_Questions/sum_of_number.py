def sum(numbers):
   total = 0
   for x in numbers:
      total=x + total
   print('Sum of the numbers:', total)

sum((100, 200, 300, 400, 0, 500))