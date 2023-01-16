
std::string car = "Supra";   // Declare car variable 
std::string* ptr = &car;    // declare new string pointer 

*ptr = "Prius"; // change value of ptr to prius 
std::cout << *ptr << "\n";
// Prius

std::cout << car << "\n";
// Prius
    
