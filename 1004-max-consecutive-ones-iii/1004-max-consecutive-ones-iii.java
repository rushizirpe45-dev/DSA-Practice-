class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int zeros=0;
        int maxlen=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0) zeros++;
            while(zeros>k){
                if(arr[i]==0) zeros--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}