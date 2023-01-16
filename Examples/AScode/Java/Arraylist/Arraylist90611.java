import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> planes = new ArrayList<String>();
    planes.add("Saab JAS 39E Gripen");
    planes.add("SR-71 Blackbird");
    planes.remove(0);
    System.out.println(planes.get(0));
    // SR-71 Blackbird
  }
}
