import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> planes = new ArrayList<String>();
    planes.add("Saab JAS 39E Gripen");
    planes.add("Sukhoi Su-35S");
    planes.add("Eurofighter Typhoon");
    planes.add("Lockheed Martin F-35 Lightning II");
    
    for (int i=0; i<planes.size(); i++){
        System.out.println(planes.get(i));
        // Saab JAS 39E Gripen
        // Sukhoi Su-35S
        // Eurofighter Typhoon
        // Lockheed Martin F-35 Lightning II
    }    
  }
}

