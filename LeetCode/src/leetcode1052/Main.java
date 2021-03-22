package leetcode1052;

public class Main {
    public static void main(String[] args) {
        int[] customers=new int[]{1,0,1,2,1,1,7,5};
        int[] grumpy=new int[]{0,1,0,1,0,1,0,1};
        int x=3;
        System.out.println(new Solution().maxSatisfied(customers,grumpy,x));
    }
}
