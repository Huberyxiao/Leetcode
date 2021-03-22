package leetcode435;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<List<Integer>> listList=new ArrayList<>();
        for (int[] interval : intervals) {
            List<Integer> list=new ArrayList<>();
            for (int i : interval) {
                list.add(i);
            }
            listList.add(list);
        }
        int len=listList.size();
        listList.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0).equals(o2.get(0))){
                    return o1.get(1) - o2.get(1);
                }
                return o1.get(0) - o2.get(0);
            }
        });
        for (int i = 1; i < listList.size(); i++) {
            if (listList.get(i).get(0)<listList.get(i-1).get(1)){
                if (listList.get(i).get(1)<=listList.get(i-1).get(1)){
                    listList.remove(i-1);
                }
                else listList.remove(i);
                //System.out.println(listList.get(i).get(0)+" "+listList.get(i-1).get(1));
                i--;
            }
        }
        return len-listList.size();
    }
}
