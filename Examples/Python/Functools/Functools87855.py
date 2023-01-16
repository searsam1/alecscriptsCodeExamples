from functools import total_ordering

@@total_ordering
class Students:
    def __init__(self, gpa):
        self.gpa = gpa
  
    def __lt__(self, other):
        return self.gpa < other.gpa
  
    def __eq__(self, other):
        return self.gpa == other.gpa
  
Yoda = Students(3.3)
  
Vader = Students(2.99)
  
print(Yoda < Vader) # False
print(Yoda <= Vader) # False
print(Yoda > Vader) # True
print(Yoda >= Vader) # True
print(Yoda == Vader) # False
print(Yoda != Vader) # True
