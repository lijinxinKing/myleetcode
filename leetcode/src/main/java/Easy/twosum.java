package Easy;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
* */
public class twosum {
    public static int[]twoSum(int[]nums,int target){
        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        int []result = {-1,-1};
        for (int i=0;i<nums.length;++i){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i],i);
        }

        return result;
    }
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int []result = twoSum(nums,9);
        System.out.println(result[0]+","+result[1]);
    }
}
