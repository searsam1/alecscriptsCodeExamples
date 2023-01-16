import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> planes = new ArrayList<String>();
    planes.add("Saab JAS 39E Gripen");
    // change first element with 
    // .set()
    planes.set(0, "SR-71 Blackbird");
    System.out.println(planes.get(0));
    // SR-71 Blackbird
  }
}
