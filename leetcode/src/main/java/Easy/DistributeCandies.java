package Easy;

import java.util.HashMap;
import java.util.Map;

/*
* Given an integer array with even length, where different numbers in this array represent different kinds of candies.
* Each number means one candy of the corresponding kind.
* You need to distribute these candies equally in number to brother and sister.
* Return the maximum number of kinds of candies the sister could gain.
Example 1:
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
The sister has three different kinds of candies.
Example 2:
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
The sister has two different kinds of candies, the brother has only one kind of candies.
Note:

The length of the given array is in range [2, 10,000], and will be even.
The number in given array is in range [-100,000, 100,000].
*
* */
public class DistributeCandies {

    public  static  int distributeCandies(int[] candies) {

        if (candies.length < 2 || candies.length >  10000){
            return 0;
        }
        // 查找不同的
        //Input: candies = [1,1,2,2,3,3]
        //Output: 3
        Map<Integer,Integer>cadinesMap = new HashMap<>();
        for (int i = 0; i < candies.length; i++){
            int temp = candies[i];
            if(cadinesMap.containsKey(temp)){
                int value =  cadinesMap.get(temp);
                value++;
                cadinesMap.replace(temp,value);
            }else{
                cadinesMap.put(temp,1);
            }
        }
        //Input: candies = [1,1,2,3]
        //Output: 2
        // key, value

        return 0;
    }
    public static void main(String[] args) {

    }
}
