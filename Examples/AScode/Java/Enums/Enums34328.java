enum Num {
    ONE,
    TWO,
    THREE
  }

class Main {
  public static void main(String[] args) {

    for (Num n : Num.values()) {
        System.out.println(n);
        // ONE
        // TWO
        // THREE
      }
      
  }
}
