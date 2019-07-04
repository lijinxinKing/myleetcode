package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MoveZeros {

    private static int[] MoveZerosFunc(int []nums){
        int length = nums.length;//{0,1}
        if(length == 0){
            return null;
        }
        int j = 0;
        for (int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(temp != 0){
                nums[j++] = temp;
            }else{
                continue;
            }
        }
        int tempCount = length-j;
        for (int i =0;i<tempCount;i++){
            nums[j++] = 0;
        }

        for (int i =0;i<length;i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.println();
        return nums;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        //
        Map<Character,Integer> map = new HashMap<>();
        int tempLen = nums1.length > nums2.length?nums1.length:nums2.length;
        int []temp = new int[tempLen];

        return temp;
    }

    private static void StringResver(Character [] chars){
        if (chars.length == 0 || chars.toString()==""){
            return;
        }
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        for (int i =0;i < chars.length;i++){
            Character ch = chars[i];
            if(charMap.containsKey(ch)){
                Integer value = charMap.get(ch);
                value++;
                charMap.replace(ch,value);
            }
            else
            {
                charMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> v:charMap.entrySet()){
            System.out.println(v.getKey()+","+v.getValue());
        }
    }
    public static void main(String[] args) {
        //Character []characters = new Character[]{'a','b','a','d','c','c','d','w'};
        int []nums = new int[]{0,1,230,0,32,0,23,0};
         nums = MoveZerosFunc(nums);
    }
}
