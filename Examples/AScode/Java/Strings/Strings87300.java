class Main {
    
    public static String reverseString(String s) {
        int len = s.length();
        char[] arr = new char[len];
        for (int i=0; i < len; i++){
            arr[i] = s.charAt(len - 1 - i);
        }
        return new String(arr); 
    }
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println( reverseString( input ) );
        // racecar
    }
}
