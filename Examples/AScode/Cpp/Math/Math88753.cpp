

#include <cmath>
#include <vector>
#include <iostream>

std::vector<float> quadratic(int a, int b, int c){
    
    float res1 = (-b + sqrt(pow(b,2) - 4*a*c)) / (2*a);
    float res2 = (-b - sqrt(pow(b,2) - 4*a*c)) / (2*a);
    return {res1, res2};
}

int main(){
        
    for (float res : quadratic(2,4,-9)){
        std::cout << res << "\n";
    }
    // 1.34521
    // -3.34521
}

