# Setup
primeNumbers = []
valueLength = int(input("Enter a value length: "))

# Looping from 2 to value length
for value in range(1, valueLength + 1):
    if value == 1:
        continue
    # Looping to find factor
    for factor in range(2, value):
        # If value equal factor continue
        if value == factor:
            continue
        # If value modulo factor equal 0 then skip
        if value % factor == 0:
            break
    # If condition not fulfilled append to list
    else:
        primeNumbers.append(value)
        # if Prime numbers length equal value length then stop the program 
        if len(primeNumbers) == valueLength:
            break

# Output
print(f"Prime numbers: {primeNumbers}")
print(f"Length of prime numbers from 1 to {valueLength} is {len(primeNumbers)}")
print(f"Sum of prime numbers from 1 to {valueLength} is {sum(primeNumbers)}")