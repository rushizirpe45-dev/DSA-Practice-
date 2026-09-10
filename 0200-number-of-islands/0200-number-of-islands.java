class Solution {
    // public void Bfs(Pair<Integer,Integer> start, boolean[][] vis, char[][] grid) {
    //     int rows = grid.length;
    //     int cols = grid[0].length;
    //     Queue<Pair<Integer,Integer>> q = new LinkedList<>();
    //     q.add(start);
    //     vis[start.getKey()][start.getValue()] = true;

    //     while (q.size() > 0) {
    //         Pair<Integer,Integer> front = q.remove();
    //         int i = front.getKey();
    //         int j = front.getValue();

    //         if (j - 1 >= 0 && !vis[i][j-1] && grid[i][j-1] == '1') {
    //             q.add(new Pair<>(i, j - 1));
    //             vis[i][j-1] = true;
    //         }
    //         if (j + 1 < cols && !vis[i][j+1] && grid[i][j+1] == '1') {
    //             q.add(new Pair<>(i, j + 1));
    //             vis[i][j+1] = true;
    //         }
    //         if (i - 1 >= 0 && !vis[i-1][j] && grid[i-1][j] == '1') {
    //             q.add(new Pair<>(i - 1, j));
    //             vis[i-1][j] = true;
    //         }
    //         if (i + 1 < rows && !vis[i+1][j] && grid[i+1][j] == '1') {
    //             q.add(new Pair<>(i + 1, j));
    //             vis[i+1][j] = true;
    //         }
    //     }
    // }



    public void dfs(int i,int j, boolean[][] vis, char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        vis[i][j]=true;
        if (j - 1 >= 0 && !vis[i][j-1] && grid[i][j-1] == '1') dfs(i,j-1,vis,grid);
        if (j + 1 < cols && !vis[i][j+1] && grid[i][j+1] == '1') dfs(i,j+1,vis,grid);
        if (i - 1 >= 0 && !vis[i-1][j] && grid[i-1][j] == '1') dfs(i-1,j,vis,grid);
        if (i + 1 < rows && !vis[i+1][j] && grid[i+1][j] == '1') dfs(i+1,j,vis,grid);


    }


    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] vis = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    // Bfs(new Pair<>(i, j), vis, grid);
                    dfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }
}