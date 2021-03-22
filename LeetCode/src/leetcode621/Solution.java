package leetcode621;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] t=new int[26];
        for (int i = 0; i < 26; i++) {
            t[i]=0;
        }
        for (char task : tasks) {
            t[task - 'A']++;
        }
        int maxCount = 0;
        int max=0;
        for (int i=0;i<26;i++) {
            if(t[i]>max){
                max=t[i];
                maxCount=1;
            }
            else if (t[i]==max){
                maxCount++;
            }

        }
        //System.out.println("max=" +max +"maxCount="+maxCount);
        //return (n+1)*(max-1)+maxCount;
        return tasks.length-((n+1)*(max-1)+maxCount)>0?tasks.length:(n+1)*(max-1)+maxCount;
    }
}
