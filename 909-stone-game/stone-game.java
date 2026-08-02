class Solution {
    public boolean solve(int idx1,int idx2,int s1,int s2,boolean canTake,int[]piles,Boolean[][][]dp){
        if(idx1>idx2){
            return s1>s2;
        }
        if(canTake){
           if(dp[idx1][idx2][0]!=null) return dp[idx1][idx2][0];
        }
        else{
           if(dp[idx1][idx2][1]!=null) return dp[idx1][idx2][1]; 
        }
        boolean takeLeft=false;
        boolean takeRight=false;
        if(canTake){
            takeLeft=solve(idx1+1,idx2,s1+piles[idx1],s2,false,piles,dp);
            takeRight=solve(idx1,idx2-1,s1+piles[idx2],s2,false,piles,dp);
        }
        else{
            takeLeft=solve(idx1+1,idx2,s1,s2+piles[idx1],true,piles,dp);
            takeRight=solve(idx1,idx2-1,s1,s2+piles[idx2],true,piles,dp);
        }
        if(canTake){
        return dp[idx1][idx2][0]=takeLeft||takeRight;}

         return dp[idx1][idx2][1]=takeLeft||takeRight;
    }
    public boolean stoneGame(int[] piles) {
        int n=piles.length-1;
        Boolean[][][] dp=new Boolean[n+1][n+1][2];
        

        return solve(0,n,0,0,true,piles,dp);

    }
}