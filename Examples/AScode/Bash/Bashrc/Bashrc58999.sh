
# .bashrc

# User specific aliases and functions
. .alias
alias ducks='du -cks * | sort -rn | head -15'

# Source global definitions
if [ -f /etc/bashrc ]; then
    . /etc/bashrc
fi

PATH=$PATH:/home/username/bin:/usr/local/homebrew
export PATH

# Author 2096338 (Peter Party Bus)
    
