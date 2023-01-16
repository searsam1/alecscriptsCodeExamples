
#include <iostream>
int passInExample (int x, int (*function)(int))
{
  int g;
  g = (*function)(x);
  return (g);
}        

int abs(int x){
    // for example
    return x > 0 ? x : x * -1;
}

int main(){
    int res = passInExample(-10, abs);
    std::cout << res << "\n";
    // 10
}
    
