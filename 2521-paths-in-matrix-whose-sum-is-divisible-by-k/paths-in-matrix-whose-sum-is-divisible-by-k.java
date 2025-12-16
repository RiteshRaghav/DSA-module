class Solution {
    
    public int solve(int i,int j,int cost,int[][] grid,int k,int[][][] dp){
        if(i>=grid.length || j>=grid[0].length){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            if((cost+grid[i][j])%k==0){
                return 1;
            }
            else return 0;
        }

        if(dp[i][j][cost]!=-1) return dp[i][j][cost];

        int down=solve(i+1,j,(cost+grid[i][j])%k,grid,k,dp);
        int right=solve(i,j+1,(cost+grid[i][j])%k,grid,k,dp);

        return dp[i][j][cost]=(down+right)%1000000007;

    }
    public int numberOfPaths(int[][] grid, int k) {
        int [][][] dp=new int[grid.length][grid[0].length][k];
        for(int i=0;i<dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
               Arrays.fill(dp[i][j], -1);
           }
        }

        return solve(0,0,0,grid,k,dp);
    }
}