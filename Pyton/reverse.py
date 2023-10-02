import array

# Take user input
n = int(input("Enter the number of elements you want in the array: "))
elements = []

for _ in range(n):
    elements.append(int(input(f"Enter element {_+1}: ")))

# Convert the list of elements to an array
new_arr = array.array('i', elements)

print("Original Array is:", new_arr)

# Reversing using reverse()
new_arr.reverse()
print("Reversed Array:", new_arr)

