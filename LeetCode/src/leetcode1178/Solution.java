package leetcode1178;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int[] wordsKeys=new int[words.length];
//        int[] puzzlesKeys=new int[puzzles.length];
//        int[] puzzlesKeysF=new int[puzzles.length];
        for (int i = 0; i < words.length; i++) {
            int x=0;
            char[] chars=words[i].toCharArray();
            for (char aChar : chars) {
                int t=(int) Math.pow(2,aChar-'a');
                if ((t&x)==0){
                    x+=Math.pow(2,aChar-'a');
                }
            }
            wordsKeys[i]=x;
        }
//        for (int i = 0; i < puzzles.length; i++) {
//            int x=0;
//            char[] chars=puzzles[i].toCharArray();
//            puzzlesKeysF[i]=(int)Math.pow(2,chars[0]-'a');
//            for (char aChar : chars) {
//                int t=(int) Math.pow(2,aChar-'a');
//                if ((t&x)==0){
//                    x+=Math.pow(2,aChar-'a');
//                }
//            }
//            puzzlesKeys[i]=x;
//        }
//        System.out.println("words"+Arrays.toString(wordsKeys) );
//        System.out.println("puzzle"+Arrays.toString(puzzlesKeys));
//        System.out.println("puzzleF"+Arrays.toString(puzzlesKeysF));
        List<Integer> ans=new ArrayList<>();
        for (String puzzle : puzzles) {
            int x = 0;
            int f = 0;
            char[] chars = puzzle.toCharArray();
            f = (int) Math.pow(2, chars[0] - 'a');
            for (char aChar : chars) {
                int t = (int) Math.pow(2, aChar - 'a');
                if ((t & x) == 0) {
                    x += Math.pow(2, aChar - 'a');
                }
            }
            int t = 0;
            for (int wordsKey : wordsKeys) {
                if ((x | wordsKey) == x && (f | wordsKey) == wordsKey) {
                    t++;
                }
            }
            ans.add(t);
        }
        return ans;
    }
}
