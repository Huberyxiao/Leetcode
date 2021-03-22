package leetcode978;

public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int left=0,right=2;
        if (arr.length<=1){
            return arr.length;
        }else if (arr.length==2){
            return arr[0]!=arr[1]?2:1;
        }
        int max=arr[0]!=arr[1]?2:1;
        while(right<arr.length){
            if (arr[right]-arr[right-1]>0&&arr[right-1]-arr[right-2]<0||arr[right]-arr[right-1]<0&&arr[right-1]-arr[right-2]>0){
                if (right-left+1>max){
                    max=right-left+1;
                }
            }else {
                left=right-1;
            }
            right++;
        }
        return max;
    }
}
