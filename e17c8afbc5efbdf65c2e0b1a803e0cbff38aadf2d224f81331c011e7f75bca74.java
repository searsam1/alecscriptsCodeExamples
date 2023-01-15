public class e17c8afbc5efbdf65c2e0b1a803e0cbff38aadf2d224f81331c011e7f75bca74 {
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
}


