class IceCream {
    public void flavor() {
      System.out.println("Vanilla");
    }
    private static int temperature;

    public static void setTemp(int temp){
        temperature = temp;
    }
    public static int getTemp(){
        return temperature;
    }
  }
  
  class Chocolate extends IceCream {
    public void flavor() {
      System.out.println("Rich Dark Chocolate ");
    }
  }
  
  class Strawberry extends IceCream {
    public void flavor() {
      System.out.println("Creamy Sweet Strawberry");
    }
  }

  class Main {
    public static void main(String[] args) {
      
      IceCream.setTemp(20);
      IceCream iceCreamVanilla = new IceCream();  
      IceCream chocolateIceCream = new Chocolate();
      IceCream StrawberryIceCream = new Strawberry();
      iceCreamVanilla.flavor();
      System.out.println(IceCream.getTemp() + "℉");
    //   Vanilla

      chocolateIceCream.flavor();
    //   Rich Dark Chocolate 

      StrawberryIceCream.flavor();
    //   Creamy Sweet Strawberry
    }
  }
