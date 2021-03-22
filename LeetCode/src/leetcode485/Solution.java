package leetcode485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int left=0,right=0;
        while(right<=nums.length){
            if (right==nums.length||nums[right]!=1){
                max=right-left>max?right-left:max;
                left=right+1;
            }
            right++;
        }
        return max;
    }
}
