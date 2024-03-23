package String1;

public class ReverseString {
    public static void main(String[] args){

        String s = "This is an amazing program";
        String[] str = s.split(" ");

        for(int i = str.length-1; i>=0;i--){
            System.out.println(str[i]);
        }



    }
}
