import java.util.ArrayList;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> linkStrings = new LinkedList<String>();
    linkStrings.addFirst("first");
    linkStrings.addLast("last");
    System.out.println(linkStrings.getFirst());
    // first
    System.out.println(linkStrings.getLast());
    // last
    linkStrings.removeFirst();
    linkStrings.removeLast();
    System.out.println(linkStrings);
    // [] 
  }
}

