package l2_008;


import java.io.*;

public class Main {
    public static int getMax(char[] string){
        int max=1;
        int len=string.length;
        //System.out.println(len);
        int i=0,j=0;
        for (i = 0; i < len ; i++) {
            for (j = i + 1; j < len; j++) {
                //System.out.println(i+""+j+check(string,i,j));
                if (check(string, i, j)) {
                    if ((j - i +1)> max) {
                        max = j - i+1;
                        //System.out.println(i+" "+j);
                    }
                }
            }
        }

        return max;
    }

    private static boolean check(char[] string, int i, int j) {
        int len=j-i+1;
        for (int k = (i+j)/2; k>=i ; k--) {
            if(string[k]!=string[j+i-k]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        char[] string=bufferedReader.readLine().toCharArray();
        System.out.println(getMax(string));
    }
}
