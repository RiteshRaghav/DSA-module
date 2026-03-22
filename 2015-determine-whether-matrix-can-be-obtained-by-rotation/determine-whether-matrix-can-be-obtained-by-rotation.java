class Solution {
    public boolean check(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate(int[][] matrix){
         for(int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       for(int i=0;i<matrix.length;i++){
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e){
            int temp=matrix[i][s];
            matrix[i][s]=matrix[i][e];
            matrix[i][e]=temp;
            s++;
            e--;
        }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int i=0;
        while(i<4){
          rotate(mat);
          if(check(mat,target)){
            return true;
          }
          i++;
        }
        return false;
    }
}