public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("Outside Thread");
  }
  public void run() {
    System.out.println("Inside Thread");
  }
}
