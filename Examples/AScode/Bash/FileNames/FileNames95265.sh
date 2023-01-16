
# define path to file
fullfile="issac/home/desktop/testing.sh"
filename=$(basename -- "$fullfile")

# Get extension using ##*. 
extension="${filename##*.}"

# Get filename using %.*
filename="${filename%.*}"

echo $filename.$extension
# testing.sh
    
