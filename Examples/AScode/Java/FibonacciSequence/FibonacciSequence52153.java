import java.util.LinkedList;    // .getLast, .get, .size, .add
import java.util.Arrays;        // .asList

class Main {
    public static void fibLinkedLists(int n) {
        LinkedList<Integer> lst = new LinkedList<Integer>(Arrays.asList(0,1));
        for (int i=2; i<n; i++){
            lst.add(lst.getLast() + lst.get(lst.size() - 2));
        }
        System.out.println(lst);
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...]
      }
    public static void main(String[] args) {
        fibLinkedLists(10);
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
  }
}

