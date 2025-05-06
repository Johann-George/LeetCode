class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==destination){
                return true;
            }
            for(int neighbours:adj.get(node)){
                if(vis[neighbours]==false){
                    q.add(neighbours);
                    vis[neighbours]=true;
                }
            }

        }
       return false;
    }
}