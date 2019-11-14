package Easy;

import java.util.Stack;

public class numberOfLines {
    public int[] numberOfLines(int[] widths, String S) {

        return null;
    }
    public String removeDuplicates(String S) {
        //abbaca
        //ca
        if (S == "" || S == null){
            return "";
        }
        char []ch = S.toCharArray();
        if(ch.length == 1){
            return S;
        }
        if (ch.length>1){
            if (ch[0] == ch[1]){
                char[]temp = new char[ch.length-2];
                for (int i=0;i<ch.length;i++){
                    temp[i] = ch[i+2];
                }
                removeDuplicates(temp.toString());
            }else{

            }
        }
        return "";
    }
    public int calculate(String s) {
        if (s==""||s==null){
            return 0;
        }
        char ch[] = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i <ch.length;i++){
            if (ch[i] == '+'){

            }else if (ch[i] == '-'){

            }else if (ch[i] == '*'){

            }else if (ch[i] == '/'){

            }
        }

        return 0;
    }
    public static void main(String[] args) {

    }
}
