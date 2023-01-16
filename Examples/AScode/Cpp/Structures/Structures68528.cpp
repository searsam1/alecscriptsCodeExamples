
#include <iostream>
int main(){
    // declare car as new data type 
    struct car { // Named struct "car"
        std::string make;  
        std::string model;
        int mileage = 0;
        };
    // Make new ford car
    car ford;
    ford.model = "f-150";
    ford.make = "ford";
    ford.mileage = 50000;

    // Make new mazda car
    car mazda;
    mazda.model = "787b";
    mazda.make = "Mazda";
    mazda.mileage = 100000;
}
