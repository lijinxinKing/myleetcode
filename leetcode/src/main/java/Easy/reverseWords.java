package Easy;

public class reverseWords {
    public static String reverseWords(String s){
        String str[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String ss:str){
            sb.append(new StringBuffer(ss).reverse().toString()+" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
