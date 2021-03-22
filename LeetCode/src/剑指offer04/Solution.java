package 剑指offer04;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0){
            return false;
        }
        int t=0;
        for(int i=matrix[0].length-1;i>=0;i--){
            if (target==matrix[t][i]){
                return true;
            }else if (target>matrix[t][i]){
                for (int j = t; j < matrix.length; j++) {
                    int x=0;
                    if (target>matrix[j][i]){
                        x=j;
                    }
                    if (target==matrix[j][i]){
                        return true;
                    }
                    if (x>t) t = x;
                    if (t==matrix.length){
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
