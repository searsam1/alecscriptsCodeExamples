
import java.io.FileWriter;   // FileWriter class
import java.io.IOException;  // IOException class

class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Java IS FUN!");
      myWriter.close();
      System.out.println("File Write Was Successful.");
    } catch (IOException e) {
      System.out.println("An Error Occurred.");
      e.printStackTrace();
    }
  }
}

