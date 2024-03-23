package Stack;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
       File obj = new File("fileName.txt");
        try {
            if(obj.createNewFile()){
                System.out.print("file created");
            }
            else {
                System.out.print("alreadyexitr");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
