public class Main {
    static void checkAge(int age) {
      if (age < 21) {
        throw new ArithmeticException("Access denied - You must be at least 21 to drink.");
      }
      else {
        System.out.println("Access granted - Bottoms up.");
      }
    }
  
    public static void main(String[] args) {
      checkAge(15); // Set age below 21 (15)
    }
  }
  
