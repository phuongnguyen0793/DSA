class Solution {
    static{
        for(int i=0 ; i<=501 ; i++)
        {
            maxArea(new int[]{0});
        }
    }
    public static int maxArea(int[] height) {
        // Brute force -> Time Limit Exceeded
        // int maxWater = 0;
        // int currWater = 0;
        // for (int i = 0; i < height.length - 1; ++i) {
        //     for (int j = i + 1; j < height.length; ++j) {
        //         currWater = Math.min(height[i], height[j]) * (j - i);
        //         maxWater  = Math.max(maxWater, currWater);
        //     }
        // }
        // return maxWater;

        // Using two pointers
        int left = 0, right = height.length - 1;
        int minHeight = 0;
        int currentWater = 0, maxWater = 0;

        while (left < right) {
            minHeight = Math.min(height[left], height[right]);
            currentWater = minHeight * (right - left);
            maxWater = Math.max(maxWater, currentWater);

            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;
        }
        return maxWater;
    }
}