import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, String> Capitals = new HashMap<String, String>();
    Capitals.put("A", "a");
    Capitals.put("B", "b");
    Capitals.put("C", "c");
    
    // Print keys & values
    for (String i : Capitals.keySet()) {
        System.out.println(i + ' ' + Capitals.get(i));
        // A a
        // B b
        // C c
    }
  }
}

