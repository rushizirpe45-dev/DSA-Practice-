class Solution {
    public int maxSatisfied(int[] cust, int[] grumpy, int m) {
        int n=cust.length;
        int i=0;
        int j=m-1;
        int start=i;
        int end=j;
        int maxuns=0;
        int uns=0;

        for(int k=0;k<j;k++){
            if(grumpy[k]==1) uns+=cust[k];
        }
        maxuns=Math.max(maxuns,uns);
        i++;
        j++;
        
        while(j<n){
            if(grumpy[j]==1){
                uns+=cust[j];
            }
            if(grumpy[i-1]==1){
                uns-=cust[i-1];
            }
            if(uns>maxuns){
                start=i;end=j;
                maxuns=uns;
            }
            i++;j++;        
        }

        for(int k=start;k<=end;k++){
            if(grumpy[k]==1){
                grumpy[k]=0;
            }
        }
        int ans=0;
        for(int k=0;k<n;k++){
            if(grumpy[k]==0){
                ans+=cust[k];
            }
        }

        return ans;
        
    }
}