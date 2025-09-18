class Solution {

    public static final int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean[] rowCount = new boolean[rows];
        boolean[] colCount = new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowCount[i]=true;
                    colCount[j]=true;
                }
            }
        }  

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowCount[i] || colCount[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}