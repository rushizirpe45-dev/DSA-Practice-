class Solution {
    public void swap(int[] arr ,int a,int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        if(n<=1) return ;

        k=k%n;
        int j=n-k-1;
        while( i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        i=n-k;
        j=n-1;
        while( i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        i=0;
        j=n-1;
        while( i<j){
            swap(arr,i,j);
            i++;
            j--;
        }     
    }
}