class Main {
    public static void main(String[] args) {
  
      int a, b; 
      a = 10; b = 20; 
  
      // && operator
      System.out.println((a > b) && (b < a));
      // false
      System.out.println((b > a) && (b == 20));
      // true 
  
      // || operator
      System.out.println((a > b) || (a < b));
      // true 
      System.out.println((a < b) || (a > b));
      // true 
      System.out.println((a == b) || (b != a));
      // true 
  
      // ! operator
      System.out.println(!(a == b));
      // true 
      System.out.println(!(b > a));
      // false 
    }
  }
