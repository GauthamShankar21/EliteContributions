import string
import random
characters = list(string.ascii_letters) + list(string.punctuation)


def generate_random_characters(number):
    """Takes argument (number) and returns (number) of random characters"""
    chars = random.choices(characters, k=number)
    generated_chars = ''.join(chars)
    return generated_chars


def reverse_string(string):
    """Returns reversed string"""
    split_string = list(string)
    split_string.reverse()
    reversed_string = ''.join(split_string)
    return reversed_string


def decode(message):
    """Decoded the message and returns it"""
    decoded_message = []
    for word in message:
        if len(word) > 9:
            word = list(word)
            sliced_message = word[3:-3]
            first_letter = sliced_message[-1]
            sliced_message.pop(-1)
            sliced_message.insert(0, first_letter)
            message = ''.join(sliced_message)
            decoded_message.append(message)

        else:
            reversed_message = reverse_string(word)
            decoded_message.append(reversed_message)
    final_output = ' '.join(decoded_message)
    return final_output


def encode(message):
    """Encoded the message and returns it"""
    encoded_message = []
    for word in message:
        if len(word) > 3:
            sliced_message = list(word[1:])
            sliced_message.append(word[0])
            random_chars = generate_random_characters(3)
            sliced_message.insert(0, random_chars)
            random_chars = generate_random_characters(3)
            sliced_message.append(random_chars)
            message = ''.join(sliced_message)
            encoded_message.append(message)

        else:
            reversed_message = reverse_string(word)
            encoded_message.append(reversed_message)
    final_output = ' '.join(encoded_message)
    return final_output


def secret_message_program():
    """Runs our main program which is responsible for encoding/decoding secret messages"""
    user_message = input("Enter your message here: ")
    process = input("Type 'encode' or 'decode': ")
    message = user_message.split(" ")
    if process == 'encode':
        encoded_message = encode(message)
        print(encoded_message)
        secret_message_program()
    elif process == 'decode':
        decoded_message = decode(message)
        print(decoded_message)
        secret_message_program()
    else:
        return ""


secret_message_program()
