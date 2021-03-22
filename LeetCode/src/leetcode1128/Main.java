package leetcode1128;

public class Main {
    public static void main(String[] args) {
        int[][] num=new int[4][2];
        num[0][0]=1;
        num[0][1]=1;
        num[1][0]=1;
        num[1][1]=1;
        num[2][0]=1;
        num[2][1]=1;
        num[3][0]=1;
        num[3][1]=1;
        System.out.println(new Solution().numEquivDominoPairs(num));
    }
}
