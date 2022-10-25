def sieve(n):
    primeL = []

    numList = [True] * n

    numList[0] = numList[1] = False

    for(num, boolean) in enumerate(numList):
        if boolean:
            primeL.append(num)
            for multiple in range(num**2, n, num):
                numList[multiple] = False
    print(f'Prime numbers: {primeL}')


sieve(20)