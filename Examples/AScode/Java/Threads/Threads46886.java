public class Main extends Thread {
    public static int amount = 0;
  
    public static void main(String[] args) {
      Main thread = new Main();
      thread.start();
      System.out.println(amount);
      // 0
      amount++;
      System.out.println(amount);
      // 2
    }
  
    public void run() {
      amount++;
    }
}
