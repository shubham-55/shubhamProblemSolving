package BinarySearch;

public class CocoEtingBanana {
    public static void main(String[] args){

        int[] piles = {30,11,23,4,20};
        int hrs = 8;
        int max = (int) 1e9;
        int left = 0, right = max;
        while (left<=right){
            int mid = left + (right -left)/2;
            if( isPossible(piles,hrs, mid) == true){
                right= mid -1;}
            else {
                left = mid+1;

           }

        }
        System.out.println(left);
    }

    private static boolean isPossible(int[] piles, int hrs, int speed) {
        int sum = 0;
        for(int banana: piles){
            sum += banana/speed;
            if(banana%speed != 0) {
                sum++;
                System.out.println(Math.ceil(banana % speed));
            }
        }
        return (sum<=hrs);

    }
}
