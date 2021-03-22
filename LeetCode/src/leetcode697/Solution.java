package leetcode697;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map=new HashMap<>();//0表示度，1表示起点，2表示终点
        for (int i = 0; i < nums.length; i++) {
            int[] a=new int[3];
            int[] o=map.get(nums[i]);
            if (o==null){
                a[0]=1;
                a[1]=i;
            }else {
                a[0]=o[0]+1;
                a[1]=o[1];
            }
            a[2]=i;
            map.put(nums[i],a);
        }
        int max=0;
        int lenMin=0;
        int size=map.size();
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (arr[0]>max) {
                max = arr[0];
                lenMin = arr[2] - arr[1] + 1;
            } else if (max == arr[0]) {
                if (lenMin > arr[2] - arr[1] + 1) {
                    lenMin = arr[2] - arr[1] + 1;
                }
            }
        }
        return lenMin;
    }
}
