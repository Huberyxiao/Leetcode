package leetcode567;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        char[] s11=s1.toCharArray();
        char[] s22=s2.toCharArray();
        int[] book=new int[26];
        int[] bookT=new int[26];
        for (char c : s11) {
            bookT[c-'a']++;
        }
        int lent=s11.length;
        int len=s22.length;
        if (lent>len){
            return false;
        }
        int left=0,right=lent-1;
        for (int i = 0; i < right; i++) {
            book[s22[i]-'a']++;
        }
        while(right<len){
            book[s22[right]-'a']++;
            if (check(book,bookT)){
                return true;
            }
            right++;
            book[s22[left]-'a']--;
            left++;
        }
        return false;
    }

    public boolean check(int[] book,int[] bookT){
        for (int i = 0; i < 26; i++) {
            if (book[i]!=bookT[i]){
                return false;
            }
        }
        return true;
    }
}
