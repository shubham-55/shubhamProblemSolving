package ArraysPart1;

import java.util.HashMap;
import java.util.Map;

public class NUmberAppearsOnce {
    public static void main(String[] args){
        int[] arr = {2,4,5,4,7,8,5,3,5};
        int ans = numberofFreq(arr, arr.length);
        System.out.println("single element is :"+ ans);
    }

    private static int numberofFreq(int[] arr, int n) {

        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i = 0; i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);

        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                System.out.println(it.getKey());
            }
            else {
                System.out.println(it.getKey() +" ->"+ it.getValue());
            }

        }
        return -1;
    }
}
