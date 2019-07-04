package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class removeduplicatesfromsortedarray {
    public static String findLongestPalindrome(String s){
        int length = s.length();
        int min = 0;
        if (length/2==0){
            min = length%2;
        }else {
            min = length%2+1;
        }
        char [] shu = s.toCharArray();
        // 奇数的时候 两边扩展
        int temp = 0;
        for (int i = 0; i < min; i++){
            int lefti = min - i;
            int righti = min + i;
            char leftCh = shu[lefti];
            if(righti == length){
                righti = length-1;
            }
            char rightCh = shu[righti];
            if(leftCh != rightCh){
                temp = i;
                break;
            }
        }
        int begin = min-temp;
        int end = min;
        String leftStr = s.substring(min-temp,min);
        String rightStr = s.substring(min,temp);
        String palindrome = leftStr + rightStr;

        return palindrome;
    }
    public static char[] replaceStr(String str){
        char[] chars = str.toCharArray();
        int i = str.length()-1;
        int j = 0;
        List<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        char tempChi;
        char tempChj;
        boolean replaceFlag = false;

        while (i > 0 && i > j){
            char ch = chars[i];
            if (!replaceFlag && !list.contains(ch)){
                i--;
                continue;
            }else{
                tempChi = chars[i];
                replaceFlag = true;
            }
            char chj = chars[j];
            if (!list.contains(chj)){
                j++;
                continue;
            }else {
                tempChj=chars[j];
                if(replaceFlag){
                    chars[j] = tempChi;
                    chars[i] = tempChj;
                    j++;
                    i--;
                    replaceFlag = false;
                }
            }

        }
        return chars;
    }
    public int removeDuplicates(int[] nums) {
        int i = nums.length - 1;
        int j = i - 1;
        int k = 0;
        int max = Integer.MAX_VALUE;

        while (i<0){
            if(nums[i] == nums[j]){
                nums[j] = max;
            }

            i++;

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("aba"));
    }
}
