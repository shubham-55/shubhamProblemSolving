package BitManupulation;

public class AnyBAseConvesionfromdecimal {
    public static void main(String[] args){
        int n = 8, b = 2;

       System.out.println(getNumber(n,b));
    }

    private static String getNumber(int n, int b) {
        StringBuilder res = new StringBuilder();
        while (n !=0){
            char remainder = get(n%b);
            res.append(remainder);
            n = n/b;
        }
        return res.reverse().toString();
    }

    private static char get(int r) {
        if(r<10) return (char) ('0'+ r);
        if(r ==10) return 'A';
        if(r ==11) return 'B';
        if(r ==12) return 'C';
        if(r ==13) return 'D';
        if(r ==14) return 'E';
        return 'F';

    }
}
