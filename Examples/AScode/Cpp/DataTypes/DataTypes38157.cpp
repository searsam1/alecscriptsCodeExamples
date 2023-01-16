#include <iostream>
int main(){
    double double_ = 1.9;
    float float_ = 1.55;
    std::cout << double_ << " Size: " << sizeof(double_) << "\n";
    // 1.9 Size: 8
    std::cout << float_ << " Size: " << sizeof(float_) << "\n";
    // 1.55 Size: 4
    return 0; 
}
