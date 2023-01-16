class Car {
    String carColor;
    int carMileage;
    // class constructor for Car
    public Car(String color, int mileage) {
      // Set initial color for Car object 
      carColor = color;  
      carMileage = mileage;  
    }
  
    public static void main(String[] args) {
      // This calls the constructor
      Car myCar = new Car("Green", 12000); 
      // Print the color
      System.out.println(myCar.carColor + " " + myCar.carMileage); 
      // Green 12000
    }
}
