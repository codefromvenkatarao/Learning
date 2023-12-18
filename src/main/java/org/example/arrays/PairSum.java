package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

class PairSum {

    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (data.containsKey(temp)) {
                return new int[]{i, data.get(temp)};
            }
            data.put(nums[i], i);
        }
        return new int[]{};
    }
}
