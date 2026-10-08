class Solution {
   
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=cardPoints[i];
        }
        int max=curr;
       for(int i=1;i<=k;i++){
            curr-=cardPoints[k-i];
            curr+=cardPoints[n-i];
            max=Math.max(max,curr);
       } 

       return max;
        
    }
}