package leetcode832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i].length%2!=0){
                A[i][A[i].length/2]^=1;
            }
            for (int i1 = 0; i1 < A[i].length/2; i1++) {
                int t=A[i][i1];
                A[i][i1]=A[i][A[i].length-i1-1]^1;
                A[i][A[i].length-i1-1]=t^1;
            }
        }
        return A;
    }
}
