// New interface 
interface Car {
    public void honk(); 
    // no body
    public void start(); 
    // no body
}
  
// use the implements keyword
class EV implements Car {
    public void honk() {
      System.out.println("The car says: honk");
    }
    public void start() {
      // method body provided here
      System.out.println("No emissions");
    }
}
  
class Main {
    public static void main(String[] args) {
      EV myTesla = new EV();  
      myTesla.honk();
    //   The car says: honk
        
      myTesla.start();
    //   No emissions
    }
}
