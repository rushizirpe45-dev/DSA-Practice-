class Solution {
    public int longestSubarray(int[] arr) {

        int n=arr.length;
        int maxlen=0;
        int i=0;
        int zeros=0;

        // //for find first 1 
        // for(int a=0;a<n;a++){
        //     if(arr[a]==1) {
        //         i=a;
        //         break;
        //     }
        // }

       for(int j=i;j<n;j++){
            if(arr[j]==0) zeros++;

            while(zeros>1){
                if(arr[i]==0)   zeros--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
       }

        return maxlen-1;
    }
}