package leetcode395;

import java.util.Map;

public class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length()<k){
            return 0;
        }
        int[] book=new int[26];
        for (int i = 0; i < s.length(); i++) {
            book[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < book.length; i++) {
            if (book[i]>0&&book[i]<k){
                int res=0;
                int t=i+'a';
                char c=(char) t;
                String ss=c+"";
                String[] strings=s.split(ss);
                for (String s1 : strings) {
                    res = Math.max(res, longestSubstring(s1, k));
                }
                return res;
            }
        }
        return s.length();
    }
}
