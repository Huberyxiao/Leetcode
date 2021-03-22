package leetcode830;
 
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        s = s + "A";
        int len=s.length();
        int left=0;
        List<List<Integer>> listList=new ArrayList<>();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i)!=s.charAt(i-1)){
                if(i-left>=3){
                    List<Integer> list=new ArrayList<>();
                    list.add(left);
                    list.add(i-1);
                    listList.add(list);
                }
                left=i;
            }
        }
        return listList;
    }
}
