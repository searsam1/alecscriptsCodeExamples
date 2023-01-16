
#!/bin/bash

# echo -n "Enter the name of a country: "
# read COUNTRY
CAR="Lamborghini"

echo -n "My car is "

case $CAR in

  Lamborghini)
    echo -n "Amazing"
    ;;

  Ford)
    echo -n "Awful"
    ;;

  Ferrari)
    echo -n "Really Awful"
    ;;

  *)
    echo -n "So bad its unknown"
    ;;
esac
echo -n -e "\n" # -e for newline


