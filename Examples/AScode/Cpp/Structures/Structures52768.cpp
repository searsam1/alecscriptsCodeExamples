
#include <vector>
#include <iostream>
int main(){
    // Create structure called weekdays
    struct {
        int age = 34;
        std::string name = "Joe";
        float salary = 34000.899; // in $USD
        float height = 177.8; // in centimeters
    } person;
    std::cout << person.name << "\n";
    // Joe
    std::cout << '$' << person.salary << "\n";
    // $34000.9
    std::cout <<  person.height << "cm" << "\n";
    // 177.8cm    
}
    
