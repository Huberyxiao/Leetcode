package leetcode150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> number=new Stack<>();
        for (String token : tokens) {
            switch (token){
                case "+":number.add(number.pop() +number.pop());break;
                case "-":{
                    int num2=number.pop();
                    int num1=number.pop();
                    number.add(num1-num2);break;
                }
                case "*":number.add(number.pop() *number.pop());break;
                case "/":{
                    int num2=number.pop();
                    int num1=number.pop();
                    number.add(num1/num2);break;
                }
                default:number.push(Integer.parseInt(token));break;
            }
        }
        return number.pop();
    }
}
