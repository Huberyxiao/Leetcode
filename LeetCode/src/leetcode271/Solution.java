package leetcode271;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet=new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        return hashSet.size() != nums.length;
    }
}
