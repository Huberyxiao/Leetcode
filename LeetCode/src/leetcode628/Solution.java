package leetcode628;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return nums[0]*nums[1]*nums[nums.length-1]>nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]?nums[0]*nums[1]*nums[nums.length-1]:nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }
}
