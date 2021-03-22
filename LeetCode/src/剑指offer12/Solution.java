package 剑指offer12;

public class Solution {
    char[][] board;
    char[] word;
    boolean flag=false;
    boolean[][] book;
    int[][] point=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        this.word=word.toCharArray();
        this.board=board;
        this.book=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(this.word[0]==board[i][j]){
                    book[i][j]=true;
                    dfs(i,j,0);
                    book[i][j]=false;
                    if (flag){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void dfs(int i,int j,int step){
        if (flag){
            return;
        }
        if (step==word.length||step==word.length-1&&board[i][j]==word[step]){
            flag=true;
            return;
        }
        if (board[i][j]==word[step]){
            for (int k = 0; k < 4; k++) {
                int nextX=i+point[k][0];
                int nextY=j+point[k][1];
                if (nextX>=board.length||nextX<0||nextY>=board[0].length||nextY<0||book[nextX][nextY]){
                    continue;
                }
                book[nextX][nextY]=true;
                dfs(nextX,nextY,step+1);
                book[nextX][nextY]=false;
            }
        }
    }
}