package leetcode164;

;
import java.util.Arrays;

public class Solution {
    public static int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]!=nums[i-1]){
                if(nums[i]-nums[i-1]<0){
                    max= Math.max(nums[i - 1] - nums[i], max);
                }
                else max=Math.max(nums[i] - nums[i-1], max);
            }
        }

        System.out.println(Arrays.toString(nums));
        return max;
    }

    public static void main(String[] args) {
        int[] mums=new int[4];
        mums[0]=3;
        mums[1]=6;
        mums[2]=9;
        mums[3]=1;
        System.out.println(maximumGap(mums));

    }
}
