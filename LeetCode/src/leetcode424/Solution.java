package leetcode424;

public class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = 0;
        int ans=0;

        int[] count=new int[26];
        int max = 0;
        while(right<len){
            count[charArray[right]-'A']++;
            max=Math.max(count[charArray[right]-'A'],max);
            right++;
            if (right-left- k > max) {
                count[charArray[left] - 'A']--;
                left++;
            }
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}
