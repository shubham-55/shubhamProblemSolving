package ArraysPart1;

public class secondHieghest{
        public static void main(String[] args) {
            int[] arr = {2, 1, 7, 3, 9};

            int ans = maxPRofit(arr);
            System.out.println(ans);

        }

    private static int maxPRofit(int[] arr) {
            int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length;i++){
                if(arr[i]>=first){
                    second = first;
                    first = arr[i];

                } else if (arr[i]>second) {
                    second = arr[i];

                }
            }
            return second;
    }
}
