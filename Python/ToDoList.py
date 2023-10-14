to_do = [[[None for _ in range(8)] for _ in range(31)] for _ in range(12)]

exit_program = False

while not exit_program:
    print("Enter 1: add a new appointment!")
    print("Enter 2: verify appointment!")
    print("Enter 0: exit!")

    option = int(input())

    if option == 1:  # Add toDo
        month_valid = False
        month = 0
        while not month_valid:
            print("Enter the month: ")
            month = int(input())
            if 1 <= month <= 12:
                month_valid = True
            else:
                print("Month invalid, type it again!")

        day_valid = False
        day = 0
        while not day_valid:
            print("Enter the day: ")
            day = int(input())
            if 1 <= day <= 31:
                day_valid = True
            else:
                print("Day invalid, type it again!")

        hour_valid = False
        hour = 0
        while not hour_valid:
            print("Enter toDo hour: ")
            hour = int(input())
            if 0 <= hour <= 7:
                hour_valid = True
            else:
                print("Hour invalid, type it again!")

        month -= 1
        day -= 1  # Decrement 1 to start counting from 0
        print("Enter toDo: ")
        to_do[month][day][hour] = input()

    elif option == 2:  # Check toDo
        month_valid = False
        month = 0
        while not month_valid:
            print("Enter the month: ")
            month = int(input())
            if 1 <= month <= 12:
                month_valid = True
            else:
                print("Month invalid, type it again!")

        day_valid = False
        day = 0
        while not day_valid:
            print("Enter the day: ")
            day = int(input())
            if 1 <= day <= 31:
                day_valid = True
            else:
                print("Day invalid, type it again!")

        hour_valid = False
        hour = 0
        while not hour_valid:
            print("Enter hour toDo: ")
            hour = int(input())
            if 0 <= hour <= 7:
                hour_valid = True
            else:
                print("Hour invalid, type it again!")

        month -= 1
        day -= 1
        print("The toDo schedule is: ")
        print(to_do[month][day][hour])

    elif option == 0:
        exit_program = True

    else:
        print("Option invalid, type it again.")
