class Solution {

    public static final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int island = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs(char[][] grid, int r, int c){
        if(r<0 || c<0 || r >= grid.length || c >= grid[0].length || grid[r][c]=='0'){
            return;
        }

        grid[r][c] = '0';
        for(int[] dir: directions){
            dfs(grid,r+dir[0],c+dir[1]);
        }
    }
}