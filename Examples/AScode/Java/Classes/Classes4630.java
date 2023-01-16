class Main {
    // static method
    static void myStaticMethod() {
      System.out.println("Hello, brother");
    }
    // public method
    public void myPublicMethod() {
        System.out.println("Hello, brother");
      }
    public static void main(String[] args) {
          myStaticMethod(); 
          // Hello, brother
        
          Main myObj = new Main();
          myObj.myPublicMethod(); // public needs an object 
          // Hello, brother     
    } 
  }
