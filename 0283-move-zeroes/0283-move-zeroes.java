class Solution {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void moveZeroes(int[] arr) {
        
        int i=0;
        int j=1;
        int n=arr.length;

        while(j<n){
            if(arr[i]==0){
                if(arr[j]==0 && j<n-1) j++;
                swap(arr,i,j);
                if(arr[i]!=0) i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
}