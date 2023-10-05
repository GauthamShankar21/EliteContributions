# Take both people's names and check for the number of times the letters in the word TRUE occurs. 
# Then check for the number of times the letters in the word LOVE occurs. 
# Then combine these numbers to make a 2 digit number.

# For Love Scores less than 10 or greater than 90, the message should be:
# "Your score is **x**, you go together like coke and mentos."

# For Love Scores between 40 and 50, the message should be:
# "Your score is **y**, you are alright together."

# Otherwise, the message will just be their score. e.g.:
# "Your score is **z**."

print("Welcome to the Love Calculator! ")

name1 = input("What is your name? ")
name2 = input("What is your beloved one's name? ")
name1 = name1.lower()
name2 = name2.lower()

t_count = name1.count("t") + name2.count("t")
r_count = name1.count("r") + name2.count("r")
u_count = name1.count("u") + name2.count("u")
e_count = name1.count("e") + name2.count("e")

l_count = name1.count("l") + name2.count("l")
o_count = name1.count("o") + name2.count("o")
v_count = name1.count("v") + name2.count("v")
e_count = name1.count("e") + name2.count("e")

true_count = t_count + r_count + u_count + e_count
love_count = l_count + o_count + v_count + e_count
love_percentage = str(true_count) + str(love_count)

if love_percentage <= "10" or love_percentage >= "90":
    print(f"Your score is {love_percentage}, you go together like coke and mentos.")
elif love_percentage >= "40" and love_percentage <= "50":
    print(f"Your score is {love_percentage}, you are alright together.")
else:
    print(f"Your score is {love_percentage}.")