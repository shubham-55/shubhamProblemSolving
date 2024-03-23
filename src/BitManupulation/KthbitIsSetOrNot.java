package BitManupulation;

import java.sql.SQLOutput;

public class KthbitIsSetOrNot {
    public static void main(String[] args) {
        int n =88,k=3;
        System.out.println(checkbit(n,k));
    }

    private static boolean checkbit(int n, int k) {
        int mask =1 << k;
        if((n & mask) == 0) return false;

        return true;
    }
}
