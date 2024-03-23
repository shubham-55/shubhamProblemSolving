package ArraysPart1;

public class BuyingSellingOFStock {
    public static void main(String[] args){
    int[] arr = {2, 1, 7, 3, 9};

    int ans = maxPRofit(arr);
    System.out.println(ans);
}

    private static int maxPRofit(int[] arr) {
    int maxPro =0, minVaue = Integer.MAX_VALUE;

    for(int i = 0 ; i<arr.length;i++){
        minVaue = Math.min(minVaue,arr[i]);
        maxPro = Math.max(maxPro,arr[i]-minVaue);
    }
    return maxPro;

    }

}


