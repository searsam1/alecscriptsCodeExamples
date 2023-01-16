class Outer {
    int x = 10;
  
    private class Inner {
      int y = 5;
    }
  }
  
  class Main {
    public static void main(String[] args) {
        Outer myOuter = new Outer();
        
        // Error: 
        // The type Outer.Inner is not visible
        Outer.Inner myInner = myOuter.new Inner();
    }
  }
