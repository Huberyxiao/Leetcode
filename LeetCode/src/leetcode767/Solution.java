package leetcode767;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s="";
        System.out.println(reorganizeString(s));
    }
    public static String reorganizeString(String S) {
        //把字符串S转化为字符数组
        char[] chars = S.toCharArray();
        //记录每个字符出现的次数
        int[] charsCount = new int[26];
        //字符串的长度
        int length = S.length();
        //统计每个字符出现的次数
        for (int i = 0; i < length; i++) {
            charsCount[chars[i] - 'a']++;
        }
        int max = 0, maxIndex = 0,len1 = (length + 1) / 2;
        //找出出现次数最多的那个字符
        for (int i = 0; i < charsCount.length; i++) {
            if (charsCount[i] > max) {
                max = charsCount[i];
                maxIndex = i;
                //如果出现次数最多的那个字符的数量大于阈值，说明他不能使得
                // 两相邻的字符不同，直接返回空字符串即可
                if (max > len1)
                    return "";
            }
        }
        //到这一步说明他可以使得两相邻的字符不同，我们随便返回一个结果，res就是返回
        //结果的数组形式，最后会再转化为字符串的
        char[] res = new char[length];
        int index = 0;
        //先把出现次数最多的字符存储在数组下标为偶数的位置上
        while (charsCount[maxIndex] > 0) {
            res[index] = (char) (maxIndex + 'a');
            index += 2;
            charsCount[maxIndex]--;
        }
        //然后再把剩下的字符存储在其他位置上
        for (int i = 0; i < charsCount.length; i++) {
            while (charsCount[i] > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                charsCount[i]--;
            }
        }
        return new String(res);
    }
}
