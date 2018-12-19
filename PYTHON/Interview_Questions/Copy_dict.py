MyDic1={"Name" : "Vishwa","Address" : "Pune"}
print(MyDic1)

MyDic2=MyDic1
print(MyDic2)


#When you assign dict2 = dict1, you are not making a copy of dict1, it results in dict2 being just another name for dict1.
#To copy the mutable types like dictionaries, use copy / deepcopy of the copy module.

import copy
MyDic3 = copy.deepcopy(MyDic1)
print(MyDic3)