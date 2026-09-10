class Solution {

    public void dfs(int start, boolean[] vis, List<List<Integer>> adj) {
        vis[start] = true;
        for (int neighbor : adj.get(start)) {
            if (!vis[neighbor]) {
                dfs(neighbor,vis,adj);
            }
        }
    
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] ver = new boolean[n];

        dfs(0,ver,rooms);

        for (int i = 0; i < n; i++) {
            if (!ver[i]) {
                return false;
            }
        }

        return true;

    }
}