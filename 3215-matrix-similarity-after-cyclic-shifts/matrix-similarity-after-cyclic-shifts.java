class Solution {
    public void LeftcyclicShift(int[] arr){
        int first=arr[0]; 
      int n=arr.length;
       for(int i=0;i<arr.length-1;i++){
             arr[i]=arr[i+1];   
        }
        arr[n-1]=first;
    }
    public void rightShift(int[] arr){
      
      int n=arr.length;
      int last=arr[n-1]; 
       for(int i=n-1;i>0;i--){
             arr[i]=arr[i-1];   
        }
        arr[0]=last;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] similar=new int[m][n];
        for(int i=0;i<m;i++){
             int[] dummy = mat[i].clone();
            for(int j=0;j<k;j++){
                if(i%2==0) LeftcyclicShift(dummy);
                else rightShift(dummy);
            }
            similar[i]=dummy.clone();
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=similar[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}