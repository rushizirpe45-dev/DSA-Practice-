class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        int k=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                k++;
                arr[j++]=arr[i];
            }
        }

        return k;
        
    }
}