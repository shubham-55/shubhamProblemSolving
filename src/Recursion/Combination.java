package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        combine(n,k, new ArrayList<>());
    }

    private static void combine(int n, int k, ArrayList<Integer> output) {
        if(k == 0){
            res.add(output);
            return;
        }
        if(n== 0) return;

        output.add(n);
        combine(n-1,k-1,output);
        output.remove(output.size()-1);

        combine(n-1,k,output);
    }
}
