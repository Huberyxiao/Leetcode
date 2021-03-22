package 剑指offer05;

import java.util.Arrays;

public class Solution {
    public String replaceSpace(String s) {
        int len=s.length();
        int count=0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i)==' '){
                count++;
            }
        }
        len+=count*2;
        char[] chars=new char[len];
        for (int i = 0; i < len-count*2; i++) {
            chars[i]=s.charAt(i);
        }
        for (int i = chars.length-1-count*2; i >=0 ; i--) {
            if (chars[i]==' '){
                chars[i+count*2-2]='%';
                chars[i+count*2-1]='2';
                chars[i+count*2]='0';
                count--;
            }else if (count==0){
                break;
            }else {
                chars[i+count*2]=chars[i];
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }
}
