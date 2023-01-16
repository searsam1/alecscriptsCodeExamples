
def funny_numbers(n, p):
	
    """
    funny_numbers(89, 1) -> 1
    funny_numbers(1878, 2) -> 19
    funny_numbers(10383, 6) -> 12933
    """
    
    sum_, res = 0, [int(i) for i in str(n)]	
	for i in res:
		sum_ += (i**p)
		p += 1
	return sum_ // n if sum_ % n == 0 else None            
        


        
