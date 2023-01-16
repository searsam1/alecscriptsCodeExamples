import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    HashSet<String> drinks = new HashSet<String>();
    drinks.add("Juice");
    drinks.add("Soda");
    drinks.add("Milk");
    
    System.out.println(drinks);
    // [Juice, Soda, Milk]
  }
}
