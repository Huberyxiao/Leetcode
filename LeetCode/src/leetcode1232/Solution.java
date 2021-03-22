package leetcode1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int len=coordinates.length;
        if (len==2){
            return true;
        }
        else {
            if (coordinates[0][0]-coordinates[1][0]==0){
                double x=coordinates[0][0];
                for (int i = 2; i < len; i++) {
                    if (coordinates[i][0]!=x){
                        return false;
                    }
                }
                return true;
            }
            double k=((coordinates[0][1]-coordinates[1][1])*1.0)/(coordinates[0][0]-coordinates[1][0]);
            double b=((coordinates[0][1]+coordinates[1][1])-k*(coordinates[0][0]+coordinates[1][0]))/2.0;
            for (int i = 2; i < len; i++) {
                double a=coordinates[i][0]*k+b-coordinates[i][1];
                if (((a <= 0.0D) ? 0.0D - a : a)<=0.0000001){
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
