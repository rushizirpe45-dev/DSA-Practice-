class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0;
        int j=k-1;
        int ans=0;
        int avg=0,sum=0;

        for(int a=0;a<=k-1;a++){
            sum+=arr[a];
        }
        i++;
        j++;
        if(sum/k>=threshold) ans++;
        while(j<n){
            sum=sum-arr[i-1]+arr[j];
            if(sum/k>=threshold) ans++;
            i++;
            j++;
        }
        return ans;
    }
}