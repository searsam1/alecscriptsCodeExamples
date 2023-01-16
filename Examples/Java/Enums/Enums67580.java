enum Num {
    ONE,
    TWO,
    THREE
  }

class Main {
  public static void main(String[] args) {
    Num myNum = Num.ONE; 

    switch(myNum) {
      case ONE:
        System.out.println("One 1");
        // One 1
        break;
      case TWO:
         System.out.println("Two 2");
        break;
      case THREE:
        System.out.println("Three 3");
        break;
    }
  }
}

