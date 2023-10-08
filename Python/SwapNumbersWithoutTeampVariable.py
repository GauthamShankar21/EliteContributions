# Input two real numbers
num1 = float(input("Enter the first real number: "))
num2 = float(input("Enter the second real number: "))

# Display the original numbers
print(f"Original numbers: number 1 = {num1}, number 2 = {num2}")

# Swap the numbers without a temporary variable
num1 = num1 + num2
num2 = num1 - num2
num1 = num1 - num2

# Display the swapped numbers
print(f"Swapped numbers: num1 = {num1}, num2 = {num2}")
