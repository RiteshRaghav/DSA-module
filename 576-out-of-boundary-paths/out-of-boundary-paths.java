class Solution {
    public int solve(int move,int m,int n,int max,int i,int j,int[][][] dp){
        if(i>=m || i<0 || j>=n || j<0) return 1;

        if(move==max) return 0;
       if(dp[i][j][move]!=-1)  return dp[i][j][move];
       long down=solve(move+1,m,n,max,i+1,j,dp);
        long up=solve(move+1,m,n,max,i-1,j,dp);
        long left=solve(move+1,m,n,max,i,j-1,dp);
        long right=solve(move+1,m,n,max,i,j+1,dp);

        return dp[i][j][move]=(int)((down+up+left+right)%1000000007);
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
      int[][][]dp=new int[m][n][maxMove+1];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           Arrays.fill(dp[i][j],-1);    
        }
      }
      return solve(0,m,n,maxMove,startRow,startColumn,dp);  
    }
}