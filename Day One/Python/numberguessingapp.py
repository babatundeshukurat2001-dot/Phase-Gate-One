import random

while True:
    target = random.randint(1, 100)
    guesses = 0

    print("Guess any number between 1 and 100:")
    
    while True:
        guess = int(input("Enter your guessed number: "))
        guesses += 1
        
        if guess == target:
            print("Congratulations you guessed the number right!")
            break
        elif guess > target:
            print("Your number is too high, try again")
        else:
            print("Your number is too low, try again")
    
    if guesses == 1:
        print("Legendary")
    elif guesses == 2:
        print("Excellent")
    elif 3 <= guesses <= 4:
        print("Good")
    elif guesses == 5:
        print("Close!!")
    
    play_again = input("Play again? yes/no: ")
    if play_again.lower() != 'yes':
        break
