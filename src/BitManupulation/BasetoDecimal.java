package BitManupulation;

public class BasetoDecimal {
    public static void main(String[] args){
        String n = "81";
        int b = 10;

        System.out.println(getNumber(n,b));
    }

    private static int getNumber(String n, int b) {
        int res = 0, power = 1;
        for(int i = n.length()-1;i>=0;i++){
            char ch = n.charAt(i);
            int val = get(ch);
            if(val>=b) return -1;

            res = res+power*val;
            power = power*b;
        }
        return res;
    }

    private static int get(char ch) {

        if(ch>='0' && ch <='9') return ch -'0';

        return ch -'A'+10;
    }

}
