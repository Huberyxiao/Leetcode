package leetcode455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int lens=s.length;
        int j=0;
        int leng=g.length;
        for (int i = 0; i < lens; i++) {
            if(j==leng){
                break;
            }
            if(s[i]>=g[j]) {
                j++;
            }
        }
        return j;
    }
}
