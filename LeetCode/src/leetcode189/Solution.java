package leetcode189;

public class Solution {
    /*
    版本1
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] t = new int[k];
        int j=0;
        int i=0;
        for ( i = nums.length-k; i <nums.length ; i++) {
            t[j]=nums[i];
            j++;
        }
        for (i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for (i=k-1;i>=0;i--){
            nums[i]=t[i];
        }
    }
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
