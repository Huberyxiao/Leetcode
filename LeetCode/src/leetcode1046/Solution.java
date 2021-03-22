package leetcode1046;

import java.util.*;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> s=new ArrayList<>();
        for (int stone : stones) {
            s.add(stone);
        }
        while(s.size()>1){
            int len=s.size();
            if(s.get(len-1).equals(s.get( len-2))){
                s.remove(len-1);
                s.remove(len-2);
            }
            else{
                int t=s.get(len-1)-s.get( len-2);
                s.remove(len-1);
                s.remove(len-2);
                s.add(t);
            }
            Collections.sort(s,new Comparator() {
                 @Override
                 public int compare(Object o1, Object o2) {
                     return (int)o1-(int)o2;
                 }
            });
        }
        return s.size()>0?s.get(0):0;
    }
}

