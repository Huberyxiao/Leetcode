package leetcode1178;

public class Main {
    public static void main(String[] args) {
        String[] words=new String[]{"aaaa","asas","able","ability","actt","actor","access"};
        String[] puzzles=new String[]{"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        System.out.println(new Solution().findNumOfValidWords(words,puzzles));
    }
}
