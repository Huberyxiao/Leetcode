package leetcode714;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len=prices.length;
        int sum=0;
        int t=prices[0];
        for (int i = 1; i < len; i++) {
            int x=Math.min(t,prices[i-1]);
            if (prices[i]-x-fee>0){
                sum+=prices[i]-x-fee;
                t=prices[i];
            }
        }
        return sum;
    }
}
