package leetcode888;

import java.util.Arrays;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int cha=(sumA-sumB)/2;
        //System.out.println(cha);
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0;
        int j=0;
        while(true){
            if (i==A.length){
                for (;j<B.length;j++){
                    if (A[A.length-1]-B[j]==cha){
                        return new int[]{A[A.length-1],B[j]};
                    }
                }
            }
            if (j==B.length){
                for (;i<A.length;i++){
                    if (A[i]-B[B.length-1]==cha){
                        return new int[]{A[i],B[B.length-1]};
                    }
                }
            }
            //System.out.println("i"+i+"j"+j+" "+(A[i]-B[j]));
            if (A[i]-B[j]==cha){
                return new int[]{A[i],B[j]};
            }
            if (A[i]-B[j]<cha){
                i++;
            }
            if (A[i]-B[j]>cha){
                j++;
            }
        }
    }
}
