public class 10df2179984cce808b45f03d9025a8e15c8ffa631c72ca49c7df55119ea1e423 {
    abstract class Ford {
        // Vehicle attribute
        protected String brand = "Ford";        
        
        // Vehicle method
        abstract public void honk();
      }
      
      // Car is a child of Ford
      class Car extends Ford {
        // Car attribute
        private String modelName = "Focus";    
        
        // define honk here, not in Ford class
        public void honk(){
            System.out.println("Ford Beep Beep");
        }
        
        public static void main(String[] args) {
      
          // Car inherits honk from Ford 
          Car myCar = new Car();
          myCar.honk();
          // Ford Beep Beep
          System.out.println(myCar.brand + " " + myCar.modelName);
          // Ford Focus
    
        }
      }
}
// /Java/Abstraction
