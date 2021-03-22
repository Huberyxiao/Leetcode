package leetcode63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int lengthH=obstacleGrid.length;
        int lengthL=obstacleGrid[0].length;
        int[][] dp=new int[lengthH][lengthL];
        for (int i=0;i<lengthL;i++) {
            if (obstacleGrid[0][i]==1){
                dp[0][i]=0;
                for (int j = i+1; j < lengthL; j++) {
                    dp[0][j]=0;
                }
                break;
            }
            dp[0][i]=1;
        }
        for (int i=0;i<lengthH;i++) {
            if (obstacleGrid[i][0]==1){
                dp[i][0]=0;
                for (int j = i+1; j < lengthH; j++) {
                    dp[j][0]=0;
                }
                break;
            }
            dp[i][0]=1;
        }
        for (int i = 1; i < lengthH; i++) {
            for (int j = 1; j < lengthL; j++) {
                dp[i][j]=(obstacleGrid[i][j]==1)?0:dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[lengthH-1][lengthL-1];
    }
}
