import collections
dq=collections.deque([1,2,3],4)
print(dq)
dq.append(5)
print(dq)
dq.append(6) #shift 1
print(dq)
dq.pop()
print(dq)
dq.popleft()
print(dq)