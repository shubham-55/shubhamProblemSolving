package DyanamicProgramming;

public class ClimbStair {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(rec(0,5));

    }

    private static int rec(int src, int dest) {
        if(src>dest) return 0;
        if(src == dest) return 1;

        int x = rec(src+1,dest);
        int y = rec(src+2, dest);
        return x+y;
    }

    private static int memo(int src, int dest,int[] dp) {
        if(src>dest) return 0;
        if(src == dest) return 1;
        if(dp[src] != 0) return dp[src];

        int x = rec(src+1,dest);
        int y = rec(src+2, dest);
        return dp[src] =x+y;
    }
}
