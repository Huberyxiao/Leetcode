package leetcode119;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for (int i=1;i<=rowIndex;i++){
            list.add(0);
            for (int j=i;j>0;j--){
                list.set(j,list.get(j)+list.get(j-1));
            }
        }
        return list;
    }
}
