interface InterfaceOne {
    public void methodOne(); 
}
  
interface InterfaceTwo {
    public void methodTwo();
}

class InterfaceExample implements InterfaceOne, InterfaceTwo {
    public void methodOne() {
      System.out.println("Method One Is implemented");
    }
    public void methodTwo() {
      System.out.println("Method Two Is also implemented");
    }
}
class Main {
    public static void main(String[] args) {
      InterfaceExample myObj = new InterfaceExample();
      myObj.methodOne();
    //   Method One Is implemented

      myObj.methodTwo();
    //   Method Two Is also implemented
    }
}
