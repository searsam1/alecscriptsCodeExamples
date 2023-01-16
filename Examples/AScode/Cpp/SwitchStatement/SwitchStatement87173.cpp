
#include < iostream >
int main(){
    int x = 2;
    switch(x) { // <-- switch keyword
      case 1:   // <-- case keyword
        std::cout << "x == 1!" << "\n";
        break; // <-- break keyword
      case 2:
        // code block will execute 
        // b/c x==2
        std::cout << "x == 2!" << "\n";
        break;
      default:
        std::cout << "x == " << "\n";
    }
}
    
