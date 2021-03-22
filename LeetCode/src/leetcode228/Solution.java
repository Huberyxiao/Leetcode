package leetcode228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int left=0;
        int right=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]+1){
                right=nums[i-1];
                if (left==right){
                    list.add(left+"");
                }
                else list.add(left+"->"+right);
                left=nums[i];
            }
        }
        if (nums.length>1&&nums[nums.length-1]!=nums[nums.length-2]+1){
            list.add(nums[nums.length-1]+"");
        }
        if (nums.length>1&&nums[nums.length-1]==nums[nums.length-2]+1){
            list.add(left+"->"+nums[nums.length-1]);
        }
        if(nums.length==1){
            list.add(nums[0]+"");
        }
        return list;
    }
}
