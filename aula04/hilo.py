# Complete the code to make the HiLo game...

import random

def main():
    # Pick a random number between 1 and 100, inclusive
    secret = random.randrange(1, 101);
    guess = 0
    attempts = 0
    while guess != secret:
        guess = int(input("What's your guess? "))
        if guess == secret:
            print("Wow! You got it!")
        elif guess < secret:
            print("Low")
        else:
            print("High")
        attempts += 1
    
    if attempts == 1:
        print("You got it first try!")
    else:
        print("It took you {} attempts".format(attempts))


main()
