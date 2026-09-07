class Solution {
    public void Bfs(int i,boolean[] vis,int [][] adj){
        int n=adj.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.remove();
            for(int j=0;j<n;j++){
                if(adj[front][j]==1 && vis[j]!=true){
                    q.add(j);
                    vis[j]=true;
                }
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
                Bfs(i,visited,adj);
            }
        }
        return count;
        
    }
}