import java.util.Scanner;  // nextLine, close 

class Main {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner scannerObj = new Scanner(System.in);  
    System.out.println("Enter username");

    // Read user input using .nextLine()
    String userName = scannerObj.nextLine();  
    // close for resource leak
    scannerObj.close();
    System.out.println("Username is: " + userName);
    // Enter username
    // example name
    // Username is: example name
  }
}
