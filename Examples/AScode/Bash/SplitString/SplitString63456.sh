
STR="one-two-three"
IFS='-' array=($STR)

for ele in "${array[@@]}"; 
    do
        echo $ele;
    done        
# one
# two
# three
    
