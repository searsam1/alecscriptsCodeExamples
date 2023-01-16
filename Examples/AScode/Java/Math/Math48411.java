public class quadratic {
    // [-b +- sqrt(b^2 - 4ac)] / 2a
    public static void quadratic(int a, int b, int c){
        double res1 = 0, res2=0;
        double discrim = Math.sqrt( Math.pow(b, 2) - 4 * a * c );
        res1 = (-b + discrim) / (2*a);
        res2 = (-b - discrim) / (2*a);
        System.out.println(res2);
        System.out.println(res1);
    }
    public static void main(String[] args){
        System.out.println("Solutions");
        quadratic(1,2,-4);
        // Solutions
        // -3.23606797749979
        // 1.2360679774997898
    }
}


