class Solution {
    public int sum(int[] arr,int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        return sum;

    }
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int curr=sum(cardPoints,0,k-1);
        int max=curr;
       for(int i=1;i<=k;i++){
            curr-=cardPoints[k-i];
            curr+=cardPoints[n-i];
            max=Math.max(max,curr);
       } 

       return max;
        
    }
}