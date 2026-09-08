class Solution {
    public void bfs(int start, boolean[] vis, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int front = q.remove();
            for (int neighbor : adj.get(front)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
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
        bfs(source, vis, adj);
        return vis[dest];
    }
}