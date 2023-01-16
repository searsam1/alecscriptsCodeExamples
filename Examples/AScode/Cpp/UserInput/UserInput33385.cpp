
#include <iostream>

double BMI(){
    // Height in Meters 
    // weight in Kilograms
    // declare weight, height and sum 
    double weight = 0, height = 0, sum = 0;
    std::cout << "Weight? ";
    // use cin to assign input to weight variable 
    std::cin >> weight;
    
    std::cout << "Height? ";
    // use cin to assign input to height variable 
    std::cin >> height ;
    
    // return BMI (weight / height^2)
    return weight / (height * height);
}

int main(){
    std::cout << BMI() << "\n";
    return 0;
}
    
