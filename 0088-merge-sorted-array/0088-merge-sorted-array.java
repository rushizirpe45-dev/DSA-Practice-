class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       int i=0;
       int j=0;
       int k=0;
       int[] ans=new int[m+n];
       while(k<m+n && j<n && i<m){
            if(nums1[i]>nums2[j]){
                ans[k++]=nums2[j];
                j++;
            }else{
                ans[k++]=nums1[i];
                i++;
            }
       } 
       if(i!=m){
            for(int a=i;a<m;a++){
                ans[k++]=nums1[a];
            } 
       }else if(j!=n){
            for(int a=j;a<n;a++){
                ans[k++]=nums2[a];
            } 
       }
       
       for(int l=0;l<m+n;l++){
            nums1[l]=ans[l];
       }
       
    }
}