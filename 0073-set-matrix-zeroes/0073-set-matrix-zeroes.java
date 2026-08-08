class Solution {
    public void setZeroes(int[][] arr){
        
        int m=arr.length;
        int n=arr[0].length;

        boolean[] row=new boolean[m];
        boolean[] column=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }

        for(int i=0;i<m;i++){
            if(row[i]){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
            
        }

        for(int i=0;i<n;i++){
            if(column[i]){
                for(int j=0;j<m;j++){
                    arr[j][i]=0;
                }
            }
            
        }
    }
}