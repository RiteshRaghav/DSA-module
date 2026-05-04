class Solution {
    public void rotate(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int s=0;
            int end=matrix[0].length-1;
            while(s<end){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][end];
                matrix[i][end]=temp;
                s++;
                end--;
            }
        }
    }
}