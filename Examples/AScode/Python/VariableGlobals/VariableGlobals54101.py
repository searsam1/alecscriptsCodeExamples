
month = "May"

def foo():
    # Define a different month variable 
    # in the foo scope
    month = "October"
    return month

print(month, foo())
# May October
    
