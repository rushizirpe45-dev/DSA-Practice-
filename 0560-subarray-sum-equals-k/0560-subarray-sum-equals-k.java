class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        
        for(int j=0;j<n;j++) {
            int sum=0;  
            for(int i=j;i<n;i++){
                sum+=nums[i];
                if(sum==k) {
                    ans++;
                }
            }  
        }
        return ans;

    }
}