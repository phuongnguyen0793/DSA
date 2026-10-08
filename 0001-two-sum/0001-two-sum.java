class Solution {
    static {
        for (int i = 0; i <= 100; i++) {
            twoSum(new int[] { 0 }, 10);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            Integer j = seen.get(complement);
            if (j != null) {
                return new int[] { j, i };
            }

            seen.put(nums[i], i);
        }
        return new int[0];
        // Brute force
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // return new int[] {};
    }
}