class Solution {
    public int solve(int idx,int mem,int n,int currProfit,int minProfit,int[] group, int[] profit,int[][][] dp){
      
      if(idx==group.length) return currProfit>=minProfit?1:0;
      currProfit=Math.min(currProfit,minProfit);
       if(dp[idx][mem][currProfit]!=-1) return dp[idx][mem][currProfit];
        int skip=solve(idx+1,mem,n,currProfit,minProfit,group,profit,dp);
        int pick=0;
        if(mem+group[idx]<=n){
            pick=solve(idx+1,mem+group[idx],n,currProfit+profit[idx],minProfit,group,profit,dp);
        }
        
        return dp[idx][mem][currProfit]=(pick+skip)%1000000007;
    }
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp=new int[group.length+1][n+1][101];
        for(int i=0;i<=group.length;i++){
            for(int j=0;j<=n;j++){
               for(int k=0;k<101;k++){
                 dp[i][j][k]=-1;
               }
            }
        }
        
        return solve(0,0,n,0,minProfit,group,profit,dp);
    }
}