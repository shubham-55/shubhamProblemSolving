package SortingTechnique;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {30,50,40,20,10};

        for(int i = 0; i<arr.length-1;i++) {
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
