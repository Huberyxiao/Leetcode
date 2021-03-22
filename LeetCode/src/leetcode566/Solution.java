package leetcode566;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length==0){
            return nums;
        }
        if (nums.length*nums[0].length!=r*c){
            return nums;
        }
        int[][] ans=new int[r][c];
        for (int i = 0; i < nums.length*nums[0].length; i++) {
            ans[i/c][i%c]=nums[i/nums[0].length][i%nums[0].length];
        }
        return ans;
    }
}
