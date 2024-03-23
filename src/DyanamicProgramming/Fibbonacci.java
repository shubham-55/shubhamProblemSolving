package DyanamicProgramming;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 9;
        int[] dp = new int[n+5];

       System.out.println(fibb(n));
    }

    private static int fibb(int n ){
        if(n == 0) return 0;
        if(n == 1 ) return 1;

        int fib1 = fibb(n-1);
        int fib2 = fibb(n-2);

        return fib1+fib2;

    }

    private static int memo(int n,int[] dp) {
        if(n == 0) return 0;
        if(n == 1 ) return 1;

        if(dp[n] != 0) return dp[n];
        int fib1 = fibb(n-1);
        int fib2 = fibb(n-2);

        dp[n] = fib2 +fib1;

        return dp[n];

    }
    private static int tabu(int n ,int []dp){
        if(n == 0) return 0;
        if(n == 1 ) return 1;
        dp[0] =0; dp[1] =1;

        for(int i = 2; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];


        }
        return dp[n];
    }

    private static int optimise(int n ){
        if(n == 0) return 0;
        if(n == 1 ) return 1;
        int pt1 = 0, pt2 =1,pt3 = 1;
        for(int i = 2; i<=n;i++){
          pt3 = pt1+pt2;
          pt1 = pt2;
          pt2 = pt3;


        }
        return pt3;
    }
}
