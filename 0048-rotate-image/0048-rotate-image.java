class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[n-1-i];
            matrix[n-1-i] = temp;
        }

        for(int j=0;j<n;j++){
            for(int k=j;k<n;k++){
                int temp = matrix[j][k];
                matrix[j][k] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}