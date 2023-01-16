class Car {
    String color;
    // class constructor for Car
    public Car() {
      // Set initial color for Car object 
      color = "red";  
    }
  
    public static void main(String[] args) {
      // This calls the constructor
      Car myCar = new Car(); 
      // Print the color
      System.out.println(myCar.color); 
      // red
    }
}
