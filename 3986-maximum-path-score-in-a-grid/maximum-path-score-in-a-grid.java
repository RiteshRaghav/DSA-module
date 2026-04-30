class Solution {
    public int solve(int i,int j,int[][] grid,int cost ,int k,int[][][] dp){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return Integer.MIN_VALUE;

        

        
        int newCost=0;
        if(grid[i][j]==0){
            newCost=cost+0;
        }
        else{
             newCost=cost+1;
        }
        if(newCost>k) return Integer.MIN_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
         if(dp[i][j][cost]!=-1) return dp[i][j][cost];
        int right=solve(i,j+1,grid,newCost,k,dp);;
        int down=solve(i+1,j,grid,newCost,k,dp);
        if(right!=Integer.MIN_VALUE){
          right+=grid[i][j];
        }
        if(down!=Integer.MIN_VALUE){
          down+=grid[i][j];
        }
     
  
      return dp[i][j][cost]=Math.max(right,down);

    }
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][][] dp=new int[m][n][k+1];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
            
        }

        int ans =solve(0,0,grid,0,k,dp);
        if(ans==Integer.MIN_VALUE) return -1;

        return ans;
    }
}