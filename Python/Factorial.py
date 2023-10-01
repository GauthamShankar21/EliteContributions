def fact(num):
    if num == 0 or num == 1:
        return 1
    return num * fact(num - 1)

while True:
    user_input = input("Enter a non-negative integer to calculate its factorial: ")
    
    if user_input.isdigit():
        n = int(user_input)
        print(f"The factorial of {n} is {fact(n)}.")
        break
    else:
        print("Invalid input. Please enter a non-negative integer.")

