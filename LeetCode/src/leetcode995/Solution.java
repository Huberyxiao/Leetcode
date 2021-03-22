package leetcode995;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minKBitFlips(int[] A, int K) {
        Queue<Integer> queue=new LinkedList<>();
        int len=A.length;
        int ans=0;
        for (int i = 0; i < A.length; i++) {
            if (queue.size()>0&&i>=queue.element()+K){
                queue.poll();
            }
            if (queue.size()%2==A[i]){
                if (i+K>len){
                    return -1;
                }
                queue.add(i);
                ans++;
            }
        }
        return ans;
    }
}
/*
 public int minKBitFlips(int[] A, int K) {
        int len=A.length;
        int left=0,right=K-1,count=0;
        while(right<len){
            if (A[left]==0){
                count++;
                f(A,left,right);
            }
            while (left<len&&A[left]==1){
                left++;
                right++;
            }
        }
        for (int i = left; i < len; i++) {
            if (A[i]==0){
                return -1;
            }
        }
        return count;
    }

    public void f(int[] a, int left, int right){
        for (int i = left; i <= right; i++) {
            a[i]=a[i]==0?1:0;
        }
    }

 */
