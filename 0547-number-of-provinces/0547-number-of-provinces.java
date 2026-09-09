class Solution {
    public void Dfs(int i,boolean[] vis,int [][] adj){
        int n=adj.length;
        vis[i]=true;
        for(int j=0;j<n;j++){
            if(adj[i][j]==1 && vis[j]!=true){
                Dfs(j,vis,adj);
            }
        }
       
    }
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                Dfs(i,visited,adj);
            }
        }
        return count;
        
    }
}