def is_palindrome(string1):
    low = 0
    high = len(string1) - 1
    while low < high:
        if string1[low].lower() != string1[high].lower():
            return False
        else:
            low += 1
            high -= 1
    return True

# Driver's Code
string1 = input("Enter a string to check if it's a palindrome: ")

if is_palindrome(string1):
    print("String is palindrome")
else:
    print("String is not palindrome")
