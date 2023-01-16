import java.util.ArrayList;
import java.util.Collections;  // .sort()

public class Main {
  public static void main(String[] args) {
    ArrayList<String> planes = new ArrayList<String>();
    planes.add("Antonov A-1");
    planes.add("Sukhoi Su-35S");
    planes.add("Eurofighter Typhoon");
    planes.add("Lockheed Martin F-35 Lightning II");
    
    // sort planes
    Collections.sort(planes);

    for (String plane : planes){
        System.out.println(plane);
        // Antonov A-1
        // Eurofighter Typhoon
        // Lockheed Martin F-35 Lightning II
        // Sukhoi Su-35S
    }
  }
}
