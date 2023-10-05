# ################################### Password Generator ###################################
import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the PyPassword Generator!")
letters_count = int(input("How many letters would you like in your password?\n")) 
symbols_count = int(input(f"How many symbols would you like?\n"))
numbers_count = int(input(f"How many numbers would you like?\n"))
password_list = []

for i in range(0, letters_count):
    chosen_letter = random.choice(letters)
    password_list.append(chosen_letter)

for i in range(0, numbers_count):
    chosen_numbers = random.choice(numbers)
    password_list.append(chosen_numbers)

for i in range(0, symbols_count):
    chosen_symbols = random.choice(symbols)
    password_list.append(chosen_symbols)

random.shuffle(password_list)
generated_password = ""

for items in password_list:
    generated_password += items

print(f"Generated Password: {generated_password}")