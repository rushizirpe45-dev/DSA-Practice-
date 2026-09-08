class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] ver=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        ver[0]=true;
        while(q.size()>0){
            int front=q.remove();
            List<Integer> list=rooms.get(front);
            for(int i=0;i<list.size();i++){
                int a=list.get(i);
                if(!ver[a]){
                    q.add(a);
                    ver[a]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!ver[i]){
                return false;
            }
        }

        return true;
        
    }
}