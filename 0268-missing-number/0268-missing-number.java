class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]!=i){
                return i;
            }
            i++;
        }
        return n;
    }
}