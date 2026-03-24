class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] prefix=new int[m][n];
        int[][] suffix=new int[m][n];

        
        long pre=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                prefix[i][j]=(int)pre;
                pre=(pre*grid[i][j])%12345;
            }
        }

         long suf=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                suffix[i][j]=(int)suf;
                suf=(suf*grid[i][j])%12345;
            }
        }
       int[][] p=new int[grid.length][grid[0].length];
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            p[i][j]=(suffix[i][j]*prefix[i][j])%12345;
        }
       }
          return p;
    }
}