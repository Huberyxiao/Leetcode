package leetcode232;

public class Main {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        //int x=1;
        obj.push(1);
        obj.push(2);
        int param_1 = obj.peek();
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
    }
}
