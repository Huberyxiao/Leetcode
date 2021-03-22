package leetcode454;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int t;
                if (hashMap.containsKey(a+b)){
                    hashMap.put(a+b,hashMap.get(a+b)+1);
                }
                else{
                    hashMap.put(a+b,1);
                }
            }
        }
//        for (int c : C) {
//            for (int d : D) {
//                int t;
//                if (hashMap2.containsKey(c+d)){
//                    t=hashMap2.get(c+d);
//                    hashMap2.remove(c+d);
//                    hashMap2.put(c+d,t+1);
//                }
//                else{
//                    hashMap2.put(c+d,1);
//                }
//            }
//        }
//        Set<Integer> set=hashMap1.keySet();
//        int size=hashMap1.size();
//        for (Integer integer : set) {
//            if(hashMap2.containsKey(-integer)){
//                count+=hashMap1.get(integer)+hashMap2.get(-integer);
//            }
//        }
        for (int c: C) {
            for (int d : D) {
                if (hashMap.containsKey(-c - d)) {
                    count += hashMap.get(-c - d);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A=new int[3];
        int[] B=new int[3];
        int[] C=new int[3];
        int[] D=new int[3];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            A[i]=scanner.nextInt();
            B[i]=scanner.nextInt();
            C[i]=scanner.nextInt();
            D[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(D));
        System.out.println(fourSumCount(A, B, C, D));
    }
}
