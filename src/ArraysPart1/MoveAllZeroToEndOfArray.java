package ArraysPart1;

public class MoveAllZeroToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 0, 6, 7, 0, 8, 0, 6, 1};
        int[] ans = moveZero(arr);
        for(int i =0; i< ans.length;i++){
            System.out.println(ans[i] + " ");
        }

    }

    private static int[] moveZero(int[] arr) {
        /*
        two pointer technique
        first find first zero in array and put pointer j
        then find non zero after j and put there pointer i
        then swap j and i
         */
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n ; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return arr;

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }


        }
        return arr;
    }
}

