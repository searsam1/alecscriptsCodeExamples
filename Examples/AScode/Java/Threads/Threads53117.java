public class Main implements Runnable {
    public static void main(String[] args) {
      Main obj = new Main();
      Thread thread = new Thread(obj);
      thread.start();
      System.out.println("no thread");
      // no thread
      // yes thread
    }
    public void run() {
      System.out.println("yes thread");
    }
  }
