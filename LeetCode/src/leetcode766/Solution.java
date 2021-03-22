package leetcode766;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int i1 = 1; i1 < matrix[i].length; i1++) {
                if (matrix[i][i1]!=matrix[i-1][i1-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
