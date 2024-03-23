package ArraysPart1;

import java.util.HashMap;

public class PairOfSumExists {
    public static void main(String[] args){
        int[] arr = {2,6,5,8,15};
        int target = 11;
        int[] ans = sumExists(arr, target);
        System.out.println(ans[0]+ " " + ans[1]);
    }

    private static int[] sumExists(int[] arr, int target) {
      //  int ans[] = {-1,-1};
        int ans[] = new int[2];
        ans[0] =ans[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length;i++){
            int num = arr[i];
            int rem = target-num;
            if(map.containsKey(rem)){
                ans[0] = map.get(rem);
                ans[1] = i;
            }else {
                map.put(num,i);
            }
        }
        return ans;

    }
}
