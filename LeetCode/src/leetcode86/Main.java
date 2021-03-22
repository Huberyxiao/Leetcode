package leetcode86;

public class Main {
    public static void main(String[] args) {
        ListNode t=new ListNode(1);
        t.next=null;
        System.out.println(new Solution().partition(t,0));
    }
}
