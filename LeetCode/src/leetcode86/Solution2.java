package leetcode86;

public class Solution2 {
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
            delD=t;
            delDp=delD;
        }
        else{
            delX=t;
            delXp=delX;
        }
        while(t.next!=null){
            if(t.next.val>=x){
                if(delD==null){
                    delD=t.next;
                    delDp=delD;
                }else {
                    delDp.next=t.next;
                    delDp=delDp.next;
                }
            }
            if(t.next.val<x){
                if(delX==null){
                    delX=t.next;
                    delXp=delX;
                }else {
                    delXp.next=t.next;
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
        else if (delXp==null&&delDp!=null){
//            head=new ListNode(x);
//            head.next=delD;
//            delDp.next=null;
            head=delD;
            delDp.next=null;
        }
        else if (delXp!=null&&delDp==null){
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

