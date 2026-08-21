class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=n-1;
            
        int mid=0;
        while(i<=j){
            mid=i+(j-i)/2;
            if(arr[mid]==target) return mid;

            if(arr[mid]>target){
                j=mid-1;
            }

            if(arr[mid]<target){
                i=mid+1;
            }
        }
        return i;
    }
}