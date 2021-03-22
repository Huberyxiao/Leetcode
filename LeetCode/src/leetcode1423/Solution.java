package leetcode1423;

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length;
        int lenT=len-k;
        int left=0,right=lenT-1;
        int min=0,sum=0,max=0;
        for (int i = 0; i < lenT; i++) {
            min+=cardPoints[i];
            sum+=cardPoints[i];
            max+=cardPoints[i];
        }
        for (int i = lenT; i < len; i++) {
            max+=cardPoints[i];
        }
        right++;
        while(right<len){
            sum=sum-cardPoints[left]+cardPoints[right];
            min=Math.min(sum,min);
            left++;
            right++;
        }
        return max-min;
    }
}
