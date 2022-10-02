def fact(num):
    if num == 0:
       return num
    else:
       return num * fact(num - 1)
print(fact(5))
