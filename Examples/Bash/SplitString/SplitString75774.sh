
str="abc-def-ghi"
echo "$str" | awk -F'-' '{print $1,$2,$3}'        
# abc def ghi
    
