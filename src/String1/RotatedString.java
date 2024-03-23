package String1;

public class RotatedString {
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "abced";

        System.out.println(isRotated(str1,str2));
    }

    private static boolean isRotated(String str1, String str2) {
        System.out.println(str1 + str2);

        return (str1.length() == str2.length()) && ((str1 +str1).indexOf(str2) != -1);

    }

}
