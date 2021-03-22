package leetcode503;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < ans.length*2; i++) {
            while(!stack.empty()&&nums[i%ans.length]>nums[stack.peek()]){
                ans[stack.pop()]=nums[i%ans.length];
            }
            stack.push(i%nums.length);
        }
        return ans;
    }
}
