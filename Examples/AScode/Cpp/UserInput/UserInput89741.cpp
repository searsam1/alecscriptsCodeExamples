// extract user input to name variable 
#include <iostream>
#include <string>

int main ()
{
  std::string name;
  // print prompt
  std::cout << "Please, enter your full name: ";
  // use std::cin to collect input 
  // and store in string name 
  std::getline (std::cin,name);
  std::cout << "Hello, " << name << "!\n";

  return 0;
}
    
