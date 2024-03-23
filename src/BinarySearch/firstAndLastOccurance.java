package BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLastOccurance {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2,4,6,8,8,8,11,13}));
        int n = 8, k = 8;
        int first = firstOccurance(arr,arr.size(),k);
        int last = lastOccurance(arr, arr.size(), k);

        System.out.println(first+ "  "+ last);
    }

    private static int firstOccurance(ArrayList<Integer> arr, int size, int k) {
        int left = 0, right = size;
        while (left<=right){
            int mid = (left+right)/2;
            if( arr.get(mid)== k){
                right= mid-1;
            } else if (arr.get(mid) > k)  {
                right= mid-1;
            }else
                left= mid +1;
        }
        return left;
    }

    public static int lastOccurance(ArrayList<Integer> arr, int size, int k) {
        int left = 0, right = size;
        while (left<=right){
            int mid = (left+right)/2;
            if( arr.get(mid)== k){
                left= mid+1;
            } else if (arr.get(mid) > k)  {
                right= mid-1;
            }else
                left= mid +1;
        }
        return right;
    }
}
