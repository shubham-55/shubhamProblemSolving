package Recursion;

public class Printizigzag {
    public static void main(String[] args) {
        int n = 3;
        zigzig(n);
    }

    private static void zigzig(int n) {
        if(n== 0 ) return ;

        System.out.print(n);
        zigzig(n-1);
        System.out.print(n);
        zigzig(n-1);
        System.out.print(n);
    }
}
