package SortingTechnique;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {30,50,40,20,10};

        for(int i = 0; i<arr.length-1;i++){
            for(int j= 0;j<arr.length-1-i;j++){
                if(compare(arr,j,j+1)>0){
                    swap(arr,j,j+1);

                }
            }
        }
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }

    private static int  compare(int[] arr, int l, int r) {
        if(arr[l]<arr[r]) return -1;
        else if (arr[l]>arr[r]) {
            return  1;

        }else return 0;
    }
}
