package leetcode131;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        return dfs(s,0);
    }

    public List<List<String>> dfs(String s,int begin){
        List<List<String>> list=new LinkedList<>();
        int len=s.length();
        if (begin>=len){
            return null;
        }
        for (int i = begin; i < len; i++) {
            List<String> list1=new LinkedList<>();
            String s1=s.substring(begin,i);
            if (check(s1)){
                list1.add(s.substring(begin,i));
                list.add(list1);
                List<List<String>> list2=dfs(s,i+1);
                if (list2!=null)list.addAll(list2);
            }else {
                return null;
            }

        }
        return list;
    }

    private boolean check(String s1) {
        char[] s=s1.toCharArray();
        for (int i = 0; i < s.length/2; i++) {
            if (s[i]!=s[s.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
