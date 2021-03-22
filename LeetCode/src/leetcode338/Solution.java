package leetcode338;

public class Solution {
    public int[] countBits(int num) {
        int[] ans=new int[num+1];
        ans[0]=0;
        ans[1]=1;
        for (int i = 2; i < ans.length; i++) {
            if (i%2==0){
                ans[i]=ans[i/2];
            }else ans[i]=ans[i/2]+1;
        }
        return ans;
    }
}
