import re
string = """
something          
<><>::"" #           <----- newline
something else
"""

pattern = r"(something).*(something else)"
matches = re.findall(pattern, 
    string, 
    flags=re.DOTALL # <----- flags argument
)
print(matches)
# [('something', 'something else')]
    
