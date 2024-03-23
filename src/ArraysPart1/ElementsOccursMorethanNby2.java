package ArraysPart1;

public class ElementsOccursMorethanNby2 {

    public static void main(String[] args){
        int[] arr = {2,6,8,6,6};
        int target = 11;
        int ans = morethanhalf(arr);
        System.out.println(ans);
    }

    private static int morethanhalf(int[] arr) {
        int n = arr.length;
        int el = 0, count = 0;

        for(int i=0;i<n;i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;

            } else {
                count--;
            }
        }System.out.println("--------"+el);

                //checking if the stored element
                // is the majority element:
                int cnt1 = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == el) cnt1++;
                }

                if (cnt1 > (n / 2)) return el;
                return -1;
            }
}
