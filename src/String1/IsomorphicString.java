package String1;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args){
        String str1 = "paper";
        String str2 = "title";


     System.out.println(isomorphic(str1,str2));

        }


    private static boolean isomorphic(String str1, String str2) {
        char c = 'a';
        HashMap<Character,Character> map = new HashMap<>();

        for(int i = 0; i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                c = map.get(str1.charAt(i));
                if(c != str2.charAt(i)) {
                    return false;
                }
            }
            else if(!map.containsValue(str2.charAt(i))){
                map.put(str1.charAt(i),str2.charAt(i));

            }else return false;
    }
        return true;
}
}