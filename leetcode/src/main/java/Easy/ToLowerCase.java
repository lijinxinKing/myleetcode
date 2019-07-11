package Easy;

import java.util.HashSet;
import java.util.Set;

public class ToLowerCase {
    public  static  int uniqueMorseRepresentations(String[] words) {
        String []alphabets = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        return 0;
    }

    public static String toLowerCase(String str) {
        if (str == null || str == ""){
            return "";
        }
        char [] chars = str.toCharArray();
        for (int i = 0; i<chars.length; i++){
            char temp = chars[i];
            if(temp >= 'A' && temp<= 'Z'){
                temp+=32;
                chars[i] = temp;
            }
        }
        String s = new String(chars);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase("AsdsdDDD"));
    }
}
