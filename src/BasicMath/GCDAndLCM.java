package BasicMath;

public class GCDAndLCM {
    public static void main(String[] args) {
        int n= 3, m =12;
        System.out.println(gcd(n,m));

    }

    private static Long gcd(long n, long m) {
//        if(m== 0) return n;
//        return gcd(m,n%m);
        Long ans = 1L;
        for(int i = 1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                ans = Long.valueOf(i);
            }

        }
        return ans;
    }
}
