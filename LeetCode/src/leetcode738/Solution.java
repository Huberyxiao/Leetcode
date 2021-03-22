package leetcode738;

public class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] s= Integer.toString(N).toCharArray();
        int len=s.length;
        if(len<=1){
            return N;
        }
        int t=0;
        int x=0;
        int i=0;
        for (i = 1; i < len; i++) {
            if(s[i]<s[i-1]){
                t=i-1;
                s[i-1]--;
                break;
            }
        }
        if(i==len){
            return N;
        }
        int flag=t;
        //System.out.println("t"+t);
        for (i = t; i > 0 ; i--) {
            if (s[i]<s[i-1]){
                flag=i-1;
                s[i-1]--;
            }
        }
        for (i = flag+1; i < len; i++) {
            s[i]='9';
        }
        for (i = 0; i < len; i++) {
            if (s[i]!='0'){
                flag=i;
                break;
            }
        }
        int ans=0;
        for (i = len-1; i >=flag ; i--) {
            ans+=(s[i]-'0')*Math.pow(10,len-i-1);
        }
        return ans;
    }
}
