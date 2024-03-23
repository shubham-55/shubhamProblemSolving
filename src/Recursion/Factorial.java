package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n= 4;
        System.out.println(recursion(n));
    }

    private static int recursion(int n) {
        if(n==0) return 1;

    int ans =    recursion(n-1);
         return ans*n;
    }
}
