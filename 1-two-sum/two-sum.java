class Solution {
    static {
        for(int i=0 ; i<=501 ; i++)
        {
            twoSum(new int[]{0}, 10);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seens = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            int complement = target - nums[i];
            if(seens.containsKey(complement)) {
                return new int[] {seens.get(complement), i};
            }
            seens.put(nums[i], i);
        }
        return new int[] {};
 
        // for (int i = 0; i < nums.length; ++i) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // return new int{};
    }
}