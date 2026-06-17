class Solution {
    public int solve(int idx,int[] coins,int amount,int[][] dp){
        if(idx>=coins.length) return (int)1e9;
        if(amount==0) return 0;

        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int skip=solve(idx+1,coins,amount,dp);
        int pick= (int)1e9;
        if(coins[idx]<=amount){
            pick=1+solve(idx,coins,amount-coins[idx],dp);
        }
        return dp[idx][amount]=Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(0,coins,amount,dp);
        if(ans==(int)1e9) return -1;
        return ans;
    }
}