package leetcode703;

import java.util.Arrays;

public class KthLargest {
    int k;
    int[] nums=new int[20010];
    int len;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        Arrays.sort(nums);
        this.len=nums.length;
        System.arraycopy(nums, 0, this.nums, 0, nums.length);

    }

    public int add(int val) {
        //System.out.println(Arrays.toString(nums));
        if (len!=0&&val>=nums[len-1]){
            nums[len]=val;
        }else{
            for (int i=len;i>=0;i--){
                nums[i+1]=nums[i];
                if (i==0||nums[i]>=val&&nums[i-1]<=val){
                    nums[i]=val;
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(nums));
        len++;
        //System.out.println("len"+len+"k"+k);
        return nums[len-k];
    }


}
