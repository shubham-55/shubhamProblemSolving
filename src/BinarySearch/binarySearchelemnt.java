package BinarySearch;

public class binarySearchelemnt {
    public static void main(String[] args){
        int[] arr = {3,5,8,15,19};
        int target = 9;
       System.out.println(findElement(arr,target));
    }

    private static int findElement(int[] arr, int target) {
        int left = 0, right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target) {
                left = mid + 1;
            }
            else {
                right = mid-1;
            }

            }
        return -1;
        }

    }

