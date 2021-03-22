package leetcode290;

import java.util.*;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        int len = strings.length;
        char[] chars = pattern.toCharArray();
        if (strings.length!=chars.length){
            return false;
        }
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            characterIntegerMap.put(chars[i],i);
            List<Integer> list = map.getOrDefault(chars[i], new ArrayList<Integer>());
            list.add(i);
            map.put(chars[i], list);
        }
        for (int i = 0; i < len; i++) {
            List<Integer> list = map.get(chars[i]);
            if (list==null){
                continue;
            }
            String s1=strings[list.get(0)];
            for (Integer integer : list) {
                if(!s1.equals(strings[integer])){
                    return false;
                }
            }
        }
        Set<Character> set=characterIntegerMap.keySet();
        Set<String> set1=new HashSet<>();
        for (Character character : set) {
            set1.add(strings[characterIntegerMap.get(character)]);
        }
        return set1.size() == characterIntegerMap.size();
    }
}
