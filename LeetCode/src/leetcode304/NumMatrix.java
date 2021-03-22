package leetcode304;

public class NumMatrix {
    int[][] book;
    public NumMatrix(int[][] matrix) {
        if (matrix.length==0){
            this.book=null;
            return;
        }
        book=new int[matrix.length+1][matrix[0].length+1];
        for (int i = 1; i < book.length; i++) {
            for (int j = 1; j < book[i].length; j++) {
                book[i][j]=matrix[i-1][j-1]+book[i-1][j]+book[i][j-1]-book[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return book[row2 + 1][col2 + 1] - book[row1][col2 + 1] - book[row2 + 1][col1] + book[row1][col1];
    }
}
