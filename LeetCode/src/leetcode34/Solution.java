package leetcode34;

public class Solution {
    public int[] searchRangeOld(int[] nums, int target) {
        boolean flag=true;
        int[] res=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(flag&&nums[i]==target){
                res[0]=i;
                res[1]=i;
                flag=false;
            }
            else if(nums[i]==target){
                res[1]=i;
            }
        }
        if(flag){
            res[0]=-1;
            res[1]=-1;
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        if(r+1==0){
            return new int[]{-1,-1};
        }
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if (nums[mid]>target){
                r=mid-1;
            }
            else{
                int i=mid-1,j=mid+1;
                while(i>0){
                    if(nums[i]<target){
                        break;
                    }
                    i--;
                }
                while(j<nums.length){
                    if(nums[j]>target){
                        break;
                    }
                    j++;
                }
                return new int[]{i+1,j-1};
            }
        }
        return new int[]{-1,-1};
    }
}
