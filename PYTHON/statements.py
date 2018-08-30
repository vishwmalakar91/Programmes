number = 23
running = True

while running:
    guess = int(input('Enter an integer : ')) 
    #The user will be asked to enter a number

    if guess == number: # If the user enters the number 23
        print('Congratulations, you guessed it.')
        # this causes the while loop to stop
        running = False
    elif guess < number: #If the user enters a number lower than 23
        print('No, it is a little higher than that.')
         # The user will be asked to again enter a number
    else:
        print('No, it is a little lower than that.') #If the user enters a number greater than 23
        # The user will be asked to again enter a number
else:
    print('The while loop is over.') 
    # Whenever the user enters the number 23, the condition is met and the loop ends