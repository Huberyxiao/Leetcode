package leetcode354;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length <= 1) {
            return envelopes.length;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o2[1] - o1[1];
                return o1[0] - o2[0];
            }
        });
        int[] dp=new int[envelopes.length];
        int ans=1;
        dp[0]=envelopes[0][1];
        for (int i = 1; i < envelopes.length; i++) {
            if (envelopes[i][1]>dp[i-1]){
                dp[i]=envelopes[i][1];
                ans++;
            }else dp[i]=dp[i-1];
        }
        return ans;
    }
}
