package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    static List<String> result;

    public static void main(String[] args) {
        String s = "abc";
        result = new ArrayList<>();
        printSeq(s,0,"");
        for(String str : result){
            System.out.print(str + " ");
        }

    }

    private static void printSeq(String input, int i,String outPut) {
        if(i == input.length()){
            result.add(outPut);
            return;
        }


        printSeq(input,i+1,outPut+input.charAt(i));

        printSeq(input,i+1,outPut);

    }
}
