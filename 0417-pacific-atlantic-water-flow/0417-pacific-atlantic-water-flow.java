class Solution {
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length,cols=heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];
        for(int i=0;i<cols;i++){
            dfs(0,i,pac,heights);
            dfs(rows-1,i,atl,heights);
        }
        for(int j=0;j<rows;j++){
            dfs(j,0,pac,heights);
            dfs(j,cols-1,atl,heights);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pac[i][j] && atl[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public void dfs(int r, int c, boolean[][] ocean, int[][] heights){
        ocean[r][c]=true;
        for(int[] d:directions){
            int nr=r+d[0],nc=c+d[1];
            if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && !ocean[nr][nc] && heights[nr][nc]>=heights[r][c]){
                dfs(nr,nc,ocean,heights);
            }
        }
    }
}