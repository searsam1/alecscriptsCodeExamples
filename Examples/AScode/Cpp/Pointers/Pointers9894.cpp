
char a;
char * b;
char ** c; 
a = 'a';
b = &a;
c = &b;

std::cout << a << "\n";
// a
std::cout << *b << "\n";
// a
std::cout << **c << "\n";
// a
    
