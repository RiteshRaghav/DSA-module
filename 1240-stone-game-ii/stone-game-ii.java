class Solution {
    public int solve(int person,int idx,int m,int[] piles,int[][][] dp){
        if(idx>=piles.length) return 0;
        if(dp[person][idx][m]!=-1) return dp[person][idx][m];
        int result=(person==1)?-1:Integer.MAX_VALUE;
        int stone=0;
        for(int i=1;i<=Math.min(2*m,piles.length-idx);i++){
            stone+=piles[idx+i-1];
            if(person==1){
                result=Math.max(result,stone+solve(0,idx+i,Math.max(m,i),piles,dp));
            }
            else{
                result=Math.min(result,solve(1,idx+i,Math.max(m,i),piles,dp));
            }
        }
        return dp[person][idx][m]=result;
    }
    public int stoneGameII(int[] piles) {
        int[][][] dp=new int[2][piles.length+1][piles.length+1];
        for(int i=0;i<2;i++){
            for(int j=0;j<piles.length+1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(1,0,1,piles,dp);
    }
}