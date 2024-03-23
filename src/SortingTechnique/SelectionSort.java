package SortingTechnique;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {30,50,40,20,10};
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j= i;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ,");
        }
    }

    private static void swap(int i, int i1) {
    }
}
