class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int [][] temp=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[j][i]=matrix[i][j];
            }
        }

         for(int i=0;i<m;i++){
            int k=n-1;
            for(int j=0;j<n && k>=0;j++){
                matrix[i][j]=temp[i][k--];
            }
        }
    }
}