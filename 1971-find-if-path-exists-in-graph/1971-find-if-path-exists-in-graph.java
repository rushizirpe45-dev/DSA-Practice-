class Solution {
    public void dfs(int start, boolean[] vis, List<List<Integer>> adj) {
        vis[start] = true;
    
        for (int neighbor : adj.get(start)) {
            if (!vis[neighbor]) {
                dfs(neighbor,vis,adj);
            }
        }
    
    }

    public boolean validPath(int n, int[][] edges, int source, int dest) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i=0;i<edges.length;i++) {
            int a=edges[i][0], b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a); 
        }

        boolean[] vis = new boolean[n];
        dfs(source, vis, adj);
        return vis[dest];
    }
}