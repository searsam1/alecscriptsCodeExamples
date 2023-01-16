class Ford {
    // Vehicle attribute
    protected String brand = "Ford";        
    
    // Vehicle method
    public void honk() {                    
      System.out.println("Honk!");
    }
  }
  
  // Car is a child of Ford
  class Car extends Ford {
    // Car attribute
    private String modelName = "Focus";    
    public static void main(String[] args) {
  
      Car myCar = new Car();
  
      myCar.honk();
      // Honk!
      System.out.println(myCar.brand + " " + myCar.modelName);
      // Ford Focus

    }
  }
