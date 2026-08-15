class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int i=0;
        int sum=0;
        int len=0;
        int minlen=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>=target){
                len=j-i+1;   
                minlen=Math.min(len,minlen);
                sum=sum-arr[i];       
                i++;
            }
            
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        
        return minlen;
    }
}