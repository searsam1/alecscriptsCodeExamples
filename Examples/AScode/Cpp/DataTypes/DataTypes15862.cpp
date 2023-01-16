
#include <iostream>

int main(int argc, char const *argv[])
{
    int exampleInt = 0; 
    std::cout << exampleInt << "\n";
    // 0
    std::cout << sizeof(exampleInt) << "\n";
    // 4 
    
    // Example of 2 byte short int
    short int shortInt = 123;
    std::cout << sizeof(shortInt) << "\n";
    // 2

    // Example of 8 byte long long int
    long long int longLongInt = 1844674407370955169;
    std::cout << sizeof(longLongInt) << "\n";
    std::cout << (&longLongInt) << "\n";
    // 8

    return 0;
}        
    
