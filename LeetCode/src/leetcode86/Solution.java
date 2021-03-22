package leetcode86;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode delD=null;
        ListNode delDp=null;
        ListNode delX=null;
        ListNode delXp=null;
        ListNode t=head;
        if (head==null){
            return head;
        }
        if (t.val>=x){
            delD=new ListNode(t.val);
            delDp=delD;
        }
        else{
            delX=new ListNode(t.val);
            delXp=delX;
        }
        while(t.next!=null){
            if(t.next.val>=x){
                if(delD==null){
                    delD=new ListNode(t.next.val);
                    delDp=delD;
                }else {
                    delDp.next=new ListNode(t.next.val);
                    delDp=delDp.next;
                }
            }
            if(t.next.val<x){
                if(delX==null){
                    delX=new ListNode(t.next.val);
                    delXp=delX;
                }else {
                    delXp.next=new ListNode(t.next.val);
                    delXp=delXp.next;
                }
            }
            t=t.next;
        }
        if (delDp==null&&delXp==null){
//            head=new ListNode(x);
//            head.next=null;
            head=null;
        }
        if (delXp==null&&delDp!=null){
//            head=new ListNode(x);
//            head.next=delD;
//            delDp.next=null;
            head=delD;
            delDp.next=null;
        }
        if (delXp!=null&&delDp==null){
//            head=delX;
//            delXp.next=new ListNode(x);
//            delXp.next.next=null;
            head=delX;
            delXp.next=null;
        }
        else {
//            head=delX;
//            delXp.next=new ListNode(x);
//            delXp.next.next =delD;
//            delDp.next=null;
            head=delX;
            delXp.next=delD;
            delDp.next=null;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
