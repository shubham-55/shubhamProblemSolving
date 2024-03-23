package BinarySearch;

public class squareRoot {
    public static void main(String[] args){
        int number = 101;
        System.out.println(squarerootofnum(number));
    }

//    private static int squarerootofnum(int n) {
//        int val = 0;
//        for(int i = 1; i<n;i++){
//            if(i*i<=n){
//                val = i;
//            }else break;;
//        }
//        return val;
//    }

    private static int squarerootofnum(int n) {
        int left = 1,right = n;

        while(left<= right){
            int mid = left + (right-left)/2;
            int val = mid*mid;
            if(val<=n){
                left= mid+1;
            }else {
                right= mid-1;
            }
        }
        return right;
    }
}
