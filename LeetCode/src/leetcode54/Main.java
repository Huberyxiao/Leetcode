package leetcode54;

public class Main {
    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] a1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] a2=new int[][]{{6,9,7}};
        int[][] a3=new int[][]{{6,9,7}};
        System.out.println(new Solution().spiralOrder(a2));
    }
}
