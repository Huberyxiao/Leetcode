package leetcode643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=k-1;
        int max=0,sum=0;
        for (int i = 0; i <=right ; i++) {
            max+=nums[i];
        }
        sum=max;
        while(true){
            right++;
            if (right==nums.length) break;
            sum = sum - nums[left] + nums[right];
            max=Math.max(sum,max);
            left++;
        }
        return max*1.0 / k;
    }
}
