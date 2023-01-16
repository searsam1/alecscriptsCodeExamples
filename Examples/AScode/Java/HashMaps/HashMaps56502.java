import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, String> Capitals = new HashMap<String, String>();
    Capitals.put("A", "a");
    
    // use .get() to get value of "A"
    System.out.println(Capitals.get("A"));
    // a 
  }
}
