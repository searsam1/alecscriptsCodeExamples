class AS {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
      // 55
    }
    public static int sum(int n) {
      if (n > 0) {
        return n + sum(n - 1);
      } else {
        return 0;
      }
    }
  }
