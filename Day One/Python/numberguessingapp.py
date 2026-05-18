import random

while True:
    wrong = random.randInt(1,100)
    guesses = 0

    print("Guess any number between 1 and 100: ")


while True:
    guess = int(input("Enter your guessed number: "))
    guesses += 1

if guess == wrong:
    print("Congratulations you guessed the number right! ")

    break;

elif guess > wrong:
    print("Your number is too high,try again")

    break;
    


if(guess == 1):
    print("Legendary")
elif(guess == 2):
    print("Excellent")
elif(guess == 3 and guess == 4):
    print("Good")
elif(guess == 5):
    print("Close!")
else:
    print("Better luck next time")
