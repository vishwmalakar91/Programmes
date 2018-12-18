def string_reverse(str1):
    rev_str = ' '
    index = len(str1) #defining index as length of string.
    while(index>0):
        rev_str = rev_str + str1[index-1]
        index = index-1

    return(rev_str)

print(string_reverse('Vishwanath Malakar'))