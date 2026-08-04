class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg[k++]=arr[i];
            }else{
                pos[j++]=arr[i];            
            }
        }
        int i=0;
        j=0;
        while(i<n){
            arr[i]=pos[j];
            arr[i+1]=neg[j];
            i=i+2;
            j++;
        }

        return arr;

    }
}