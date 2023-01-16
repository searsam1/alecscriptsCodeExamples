class AS {
    static int add(int x, int y) {
      System.out.println(x + y);
      return x+y;
    }
    
    // same name, different parameters
    static float add(float x, float y) {
      System.out.println(x + y);
      return x+y;
    }

    static String add(String x, String y) {
      System.out.println(x + y);
      return x+y;
    }

    public static void main(String[] args) {
        add(2,2);
        // 4
        add(3.2f, 1.5f);
        // 4.7
        add("hello", "World");
        // helloWorld
    }
}
