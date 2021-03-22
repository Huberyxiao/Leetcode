package leetcode1438;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        // peek/poll 头部进行
        // offer 添加到尾部
        Deque<Integer> maxd = new ArrayDeque<>();
        Deque<Integer> mind = new ArrayDeque<>();
        int i = 0, j = 0;
        while (j < nums.length) {
            // 来了更大的“最大值”，之前较小的全部删掉
            while(!maxd.isEmpty() && nums[j] > maxd.peekLast())maxd.pollLast();
            // 来了更小的“最小值”，之前较大的全部删掉
            while(!mind.isEmpty() && nums[j] < mind.peekLast())mind.pollLast();

            maxd.offer(nums[j]);
            mind.offer(nums[j]);
            while (maxd.peek() - mind.peek() > limit) {
                if(nums[i] == maxd.peek())maxd.poll();
                if(nums[i] == mind.peek())mind.poll();
                i++;
            }
            j++;
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}
