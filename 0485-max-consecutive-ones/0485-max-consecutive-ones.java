class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int OneCount=0;
        int MaxCount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                OneCount++;
            }else{
                MaxCount=Math.max(OneCount,MaxCount);
                OneCount=0;
            }
        }
        MaxCount=Math.max(OneCount,MaxCount);
        return MaxCount;
    }
}