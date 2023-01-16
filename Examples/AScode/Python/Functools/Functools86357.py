@@cache
def factorial(n):
    """ Return n * n-1 * n-2 ... 1"""
    return n * factorial(n-1) if n else 1

factorial(10)      # No previous calls; it will make 10 new calls 
# 3628800
factorial(5)       # wont calculate new value, will lookup from cache
# 120
factorial(12)      # looks up first 10 from cache, then makes 2 new calls
# 479001600
