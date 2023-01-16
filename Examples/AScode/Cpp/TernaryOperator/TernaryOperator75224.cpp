
#include < iostream >
int main(){
    int x = 2; 
    // using ? operator 
    std::string res = x == 2 ? "x == 2" : "x != 2";
    std::cout << res << "\n";
    // x == 2

    // without ? operator 
    if (x == 2){
        res = "x == 2";
        }
    else {
        res = "x != 2";
        }
    std::cout << res;
    // x == 2
    }


    
