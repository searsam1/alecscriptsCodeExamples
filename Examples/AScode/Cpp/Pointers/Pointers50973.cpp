
std::string car = "Supra";   // Declare car variable 
const std::string* ptr = &car;    // declare new string pointer 

*ptr = "Prius"; // error: const pointer cannot write to variables 
    
