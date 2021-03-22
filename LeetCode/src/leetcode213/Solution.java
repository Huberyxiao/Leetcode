package leetcode213;

import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] nums1= Arrays.copyOfRange(nums,1,nums.length);
        int[] nums2= Arrays.copyOfRange(nums,0,nums.length-1);
        int[] dp1=new int[nums.length-1];
        int[] dp2=new int[nums.length-1];
        dp1[0]=nums1[0];
        dp1[1]=Math.max(nums1[0],nums1[1]);
        dp2[0]=nums2[0];
        dp2[1]=Math.max(nums2[0],nums2[1]);
        for (int i = 2; i < nums.length-1; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums1[i], dp1[i - 1]);
            dp2[i] = Math.max(dp2[i - 2] + nums2[i], dp2[i - 1]);
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-2]);
    }
}
