public static int[] fib(int n){
        // if n = 5: 
        // 0 ➜ 1 ➜ 1 ➜ 2 ➜ 3 ➜ 5 ➜ 
        n++;
        
        // create new fib array 
        int[] fib = new int[n];
        
        // starts at [0,1]
        fib[0] = 0; fib[1] = 1;
        
        // start @@ 2 because there 
        // are already two elements. 
        for (int i=2; i<n; i++)
        {
            // Assign each new element
            // to the sum of the previous 
            // two.
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
