class Solution {
    public int solve(int idx1,int idx2,String word1, String word2,int[][]dp){
        if(idx1>=word1.length() || idx2>=word2.length()) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(word1.charAt(idx1)==word2.charAt(idx2)){
            return dp[idx1][idx2]=1+solve(idx1+1,idx2+1,word1,word2,dp);
        }

        return dp[idx1][idx2]=Math.max(solve(idx1+1,idx2,word1,word2,dp),solve(idx1,idx2+1,word1,word2,dp));
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=solve(0,0,word1,word2,dp);
         return n+m-2*ans;
    }
}