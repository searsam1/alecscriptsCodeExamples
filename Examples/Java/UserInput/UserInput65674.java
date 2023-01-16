import java.util.Scanner;  // nextLine, close 

class Main {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner scannerObj = new Scanner(System.in);  
    
    System.out.println("$Enter a whole number: ");
    // Read int from .nextInt()
    int userInt = scannerObj.nextInt();  

    System.out.println("$~ Enter a fractional number: ");
    // Read float from .nextFloat()
    float userFloat = scannerObj.nextFloat();  

    System.out.println("$~ Enter a byte: ");
    // Read Byte from .nextByte()
    byte userByte = scannerObj.nextByte();  
    
    // close for resource leak
    scannerObj.close();
    System.out.println("$~ int is: " + userInt);
    System.out.println("$~ float is: " + userFloat);
    System.out.println("$~ byte is: " + userByte);

    // $~ Enter a whole number: 
    // 1
    // $~ Enter a fractional number: 
    // 2
    // $~ Enter a byte: 
    // 3
    // $~ int is: 1
    // $~ float is: 2.0
    // $~ byte is: 3
    
  }
}
