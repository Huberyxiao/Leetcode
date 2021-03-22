package leetcode1202;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s="dcab";
        List<List<Integer>> pairs=new ArrayList<>();
        List<Integer> pair1=new ArrayList<>();
        pair1.add(0);
        pair1.add(3);
        List<Integer> pair2=new ArrayList<>();
        pair2.add(1);
        pair2.add(2);
        List<Integer> pair3=new ArrayList<>();
        pair3.add(0);
        pair3.add(2);
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);
        System.out.println(new Solution().smallestStringWithSwaps(s,pairs));
    }
}
