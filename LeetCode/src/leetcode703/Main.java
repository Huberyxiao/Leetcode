package leetcode703;

public class Main {
    public static void main(String[] args) {
        int k=3;
        int[] nums=new int[]{4, 5, 8, 2};
        KthLargest obj = new KthLargest(k, nums);
        System.out.println("+3 "+obj.add(3));
        System.out.println("+5 "+obj.add(5));
        System.out.println("+10 "+obj.add(10));
        System.out.println("+9 "+obj.add(9));
        System.out.println("+4 "+obj.add(4));
    }
}
