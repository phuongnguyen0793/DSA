class Solution {
    public int maxArea(int[] height) {
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
        int left = 0; int right = height.length - 1;
        int maxWater = 0;
        int currentWater = 0;

        while (left < right) {
        currentWater = Math.min(height[left], height[right]) * (right - left);
        maxWater = Math.max(maxWater, currentWater);

        if(height[left] < height[right]) {
            ++left;
        } 
        else if (height[left] > height[right]) {
            --right;
        }
        else {
            ++left;
            --right;
        }
        }
        return maxWater;
    }
}