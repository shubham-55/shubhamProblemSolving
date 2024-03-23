package BitManupulation;

public class checkIthBIt {
    public static void main(String[] args) {
        int n =10,k=2;
        System.out.println(setBit(n,k));
    }

    private static int setBit(int n, int k) {
        return (n | (1<<k));
    }

    private static int unSetBit(int n, int k) {
        int mask = ~(1<<k);
        return n & mask;
    }

    private static int togle(int n, int k) {
        int mask = (1<<k);
        return n ^ mask;
    }
}

