package Easy;

import java.util.LinkedList;
import java.util.List;

public class selfDividingNumbers {
    public  static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        if(left>=1 && right<=10000){
            for (int i = left;i <= right;i++){
                int temp = i;
                if(temp % 10 == 0)continue;
                boolean flag = true;
                String str = i + "";
                char[] chars = str.toCharArray();
                for (int j = 0 ; j< chars.length;j++){
                    int charValue = Integer.parseInt(chars[j]+"");
                    if(charValue==0)continue;
                    if (temp%charValue != 0){
                        flag = false;
                        continue;
                    }
                }
                if(flag){
                    result.add(temp);
                }
            }
        }
        return result;
    }
    public static boolean selfDividing(int n){
        for (char c:String.valueOf(n).toCharArray()){
            if(c=='0' || (n%(c-'0')==0)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> result = selfDividingNumbers(1,22);
        for (int i = 0;i < result.size();i++){
            System.out.print(" " + result.get(i));
        }
        System.out.println();
    }
}
