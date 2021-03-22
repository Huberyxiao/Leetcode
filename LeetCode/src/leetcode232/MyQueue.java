package leetcode232;

import java.util.Stack;

class MyQueue {
    private final Stack<Integer> stack1;//栈1的顶部为队尾
    private final Stack<Integer> stack2;//栈2 为辅助栈
    private int count=0;//元素个数
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
        count++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int t;
        int countThis=count;
        while (countThis>0){
            t=stack1.pop();
            stack2.push(t);
            --countThis;
        }
        int ans=stack2.pop();
        countThis=--count;
        while (countThis>0){
            t=stack2.pop();
            stack1.push(t);
            --countThis;
        }
        return ans;
    }

    /** Get the front element. */
    public int peek() {
        int t;
        int countThis=count;
        while (countThis>0){
            t=stack1.pop();
            stack2.push(t);
            --countThis;
        }
        int ans=stack2.pop();
        stack1.push(ans);
        countThis=count-1;
        while (countThis>0){
            t=stack2.pop();
            stack1.push(t);
            --countThis;
        }
        return ans;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
