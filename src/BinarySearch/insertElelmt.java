package BinarySearch;

public class insertElelmt {
    public static void main(String[] args){
        int[] arr = {3,5,8,15,19};
        int target = 9;
        System.out.println(insertELe(arr,target));
    }
//3,8,9,10,12,14,17,20,24,29,45--7
    private static int insertELe(int[] arr, int target) {

        int left = 0, right = arr.length-1;
        int ans = arr.length;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid+1;
            }

        }
        return ans;
    }


}
