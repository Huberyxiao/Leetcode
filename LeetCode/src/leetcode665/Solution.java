package leetcode665;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        for (int i = nums.length-1; i >0; i--) {
            if (nums[i-1]>nums[i]){
                if (i+1==nums.length||nums[i+1]>nums[i-1]){
                    nums[i]=nums[i-1];
                }else nums[i-1]=nums[i];
                count++;
                if (count>1){
                    break;
                }
            }
        }
        return count<=1;
    }
}
