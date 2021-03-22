package 剑指offer08;

public class CQueue {
    private final int[] stack1;//栈1的顶部为队尾
    private final int[] stack2;//栈2 为辅助栈
    private int count=0;//元素个数
    private int top1=0;
    private int top2=0;
    public CQueue() {
        stack1=new int[10002];
        stack2=new int[10002];
    }

    public void appendTail(int value) {
        if (top2 != 0) {//当辅助栈非空时，把辅助栈的装进主栈在进行
            for (int i = top2-1; i >=0; i--) {
                stack1[top1++]=stack1[i];
            }
            top2=0;
        }
        stack1[top1++]=value;
        count++;
    }

    public int deleteHead() {
        if(count==0){
            return -1;
        }else if (top1==0){//栈1空时，直接弹栈2顶（队头）
            count--;
            return stack2[--top2];
        }else if (top2==0){//栈2空时
            //全部放入栈2，然后弹栈2头
            for (int i = top1-1; i >0 ; i--) {
                stack2[top2++]=stack1[i];
            }
            top1=1;
            count--;
            return stack1[--top1];
        }
        return -1;
    }
}
