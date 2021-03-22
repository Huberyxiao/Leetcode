package leetcode896;

public class Solution {
    public boolean isMonotonic(int[] A) {
        boolean a = true, b = true;
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > A[i - 1]) {
                a = false;
            }
            if (A[i] < A[i - 1]) {
                b = false;
            }
        }
        return a | b;
    }
}

