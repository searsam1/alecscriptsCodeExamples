class Main {
    public static void main(String[] args) {    
        int num = 10;
        switch(num) {
            // no break
            case 10:
                System.out.println("Num is 10");
            // no break
            case 20:
                System.out.println("Num is 20");
            // default will always run if there's 
            // no break
            default:
                System.out.println("Num is not 10 or 20");
        }
        // Output -
        // Num is 10
        // Num is 20
        // Num is not 10 or 20
    }
}
