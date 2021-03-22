package leetcode976;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i >=2; i--) {
            int j=A[i-1];
            int k=A[i-2];
            if(A[i]<j+k){
                return A[i]+j+k;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n=3;
        int[] nums=new int[n];
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
            //System.out.println(nums[i]);
        }
        System.out.println(largestPerimeter(nums));
    }
}
