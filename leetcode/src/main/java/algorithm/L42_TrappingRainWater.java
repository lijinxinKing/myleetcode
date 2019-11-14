package algorithm;

public class L42_TrappingRainWater {
    public static int trap(int[] height) {
        int sum =0;

        if (height == null || height.length == 0 ){
            return 0;
        }
        // 记录左边最小值
        int []min = new int[height.length];
        int []max = new int[height.length];
        for (int i = 0; i < height.length; ++i) {
            min[i] = i == 0?height[0]:Math.max(min[i-1],height[i]);
        }
        // 记录右边最大值
        for (int i = height.length-1; i >= 0; --i) {
            max[i] = (i == height.length-1)?height[i]:Math.max(max[i+1], height[i]);
        }
        // 记录差值的和
        for (int i = 0; i < height.length; ++i) {
            sum += Math.min(min[i],max[i]) - height[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int [] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
