
std::string car = "Supra";   
std::string car2 = "SUV";   
const std::string* ptr = &car;

ptr = &car2; // change ptr address 
std::cout << *ptr;
    
