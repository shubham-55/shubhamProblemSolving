package BinarySearch;

public class SearchRotatedArray {
    public static void main(String[] args){
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int k = 5;
        int n= 9;
        int ans = search(arr,k,n);
        System.out.println(ans);
    }

    private static int search(int[] arr, int k, int n) {
        int left = 0, right = n-1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) return mid;
            if (arr[mid] >= arr[left]) {//left part is sorted
                if (arr[left] <= k && arr[mid] >= k) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (arr[mid] <= k && arr[right] >= k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;

                }
            }
        }
      return -1;
    }
}
