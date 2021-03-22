package leetcode1052;

public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int pleasedPeople=0;
        int angryInWindow=0;
        int angryInWindowMark=0;
        for (int i = 0; i < X; i++) {
            if (grumpy[i]==1){
                angryInWindowMark+=customers[i];
            }
            if (grumpy[i]==0){
                pleasedPeople+=customers[i];
            }
        }
        angryInWindow=angryInWindowMark;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i]==1){
                angryInWindowMark+=customers[i];
            }
            if (grumpy[i]==0){
                pleasedPeople+=customers[i];
            }
            if (grumpy[i-X]==1){
                angryInWindowMark-=customers[i-X];
            }
            if (angryInWindowMark>angryInWindow){
                angryInWindow=angryInWindowMark;
            }
        }
        return pleasedPeople+angryInWindow;
    }
}
