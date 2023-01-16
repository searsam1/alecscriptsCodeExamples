import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, String> Capitals = new HashMap<String, String>();
    Capitals.put("A", "a");
    Capitals.put("B", "b");
    Capitals.put("C", "c");
    
    // Print keys
    for (String i : Capitals.keySet()) {
        System.out.print(i + ' ');
    }
    // A B C

    // Print values
    for (String i : Capitals.values()) {
        System.out.print(i + ' ');
    }
    // a b c
  }
}
