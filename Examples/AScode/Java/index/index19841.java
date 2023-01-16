// fib.java
public class Fib {
    // FIBONACCI 𝑓(x)
    public static void fib(int n){
        int a = 0, b = 0, c = 1;
        for (int i=0; i<n-1; i++){
             a = b; b = c; c = a+b; 
             System.out.print(c); System.out.print(" - ");
        } 
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("FIBONACCI");
        fib(8);
        // FIBONACCI
        // 1 - 2 - 3 - 5 - 8 - 13 - 21 -         
    }
}

