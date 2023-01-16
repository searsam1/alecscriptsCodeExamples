import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> planes = new ArrayList<String>();
    planes.add("Saab JAS 39E Gripen");
    planes.add("Sukhoi Su-35S");
    planes.add("Eurofighter Typhoon");
    // Get the iterator
    Iterator<String> it = planes.iterator();

    // Print first item
    System.out.println(it.next());
    // Saab JAS 39E Gripen
  }
}
