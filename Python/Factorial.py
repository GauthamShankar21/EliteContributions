def fact(num):
    return num if num == 1 else num * fact(num - 1)

print(fact(5))
