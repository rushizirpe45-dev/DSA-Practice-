class Solution {
    public int singleNumber(int[] arr) {
        
        int n=arr.length;
        int Xor=0;
        for(int i=0;i<n;i++){
            Xor=Xor^arr[i];
        }

        return Xor;
    }
}