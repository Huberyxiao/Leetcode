package leetcode1208;

public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int len = charS.length;
        int left = 0, right = 0;
        int cost = 0, ans = 0;
        while (right < len) {
            cost += Math.abs(charT[right] - charS[right]);
            if (cost > maxCost) {
                cost -= Math.abs(charT[left] - charS[left]);
                left++;
            }
            right++;
            ans = Math.max(right - left, ans);
        }
        return ans;
    }
}
