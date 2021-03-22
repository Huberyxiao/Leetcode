package leetcode493;


import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class Solution {
    public static int reversePairs(int[] nums) {
        int len =nums.length;
        if (len<2){
            return 0;
        }
        int[] copy=new int[len];
        for (int i = 0; i < len; i++) {
            copy[i]=nums[i];
        }
        int[] temp=new int[len];
        return reversePairs(copy,0,len-1,temp);
    }

    private static int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left == right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right, temp);

        int crossPairs=mergeAndCount(nums,left,mid,right,temp);
        return rightPairs+leftPairs+crossPairs;
    }

    private static int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <=right ; i++) {
            temp[i]=nums[i];
        }
        int i=left;
        int j=mid+1;
        int count=0;
        for (int k = left; k <= right; k++) {
            if(i==mid+1){
                nums[k]=temp[j];
                j++;
            }else if(j==right+1){
                nums[k]=temp[i];
                i++;
            }else if(temp[i]<=temp[j]){
                if(temp[i]==temp[j]){
                        if((long)temp[i]>2*(long)temp[j]){
                            count++;
                        }
                    nums[k]=temp[i];
                    i++;
                }else {
                    nums[k] = temp[i];
                    i++;
                }
            }else{
                nums[k]=temp[j];
                //System.out.println("temp.i temp.j"+temp[i]+" "+temp[j]+"i"+i+"mid"+mid);
                j++;
                for (int l = i; l <=mid ; l++) {

                    //System.out.println(temp[l]+" "+temp[j-1]);
                    if((long)temp[l]>2*(long)temp[j-1]){
                        count+=(mid-l+1);
                        break;
                    }
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=5;
        int[] nums=new int[n];
        Scanner scanner =new java.util.Scanner(System.in);

        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
            //System.out.println(nums[i]);
        }
        System.out.println(reversePairs(nums));
    }
}
