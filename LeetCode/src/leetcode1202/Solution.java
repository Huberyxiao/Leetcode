package leetcode1202;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars=s.toCharArray();
        System.out.println(chars);
        for (List<Integer> pair : pairs) {
            System.out.println(chars[pair.get(0)]+"*"+chars[pair.get(1)]);
            char t=chars[pair.get(0)];
            chars[pair.get(0)]=chars[pair.get(1)];
            chars[pair.get(1)]=t;
            System.out.println(chars);
        }
        System.out.println(chars);
        StringBuilder t=new StringBuilder();
        for (char aChar : chars) {
            t.append(aChar);
        }
        return t.toString();
    }
}
