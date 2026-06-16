class Solution {
    public int solve(String word1, String word2,int i,int j,int[][]dp){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j)){
            return solve(word1,word2,i+1,j+1,dp);
        }
        else{
            int insert=1+solve(word1,word2,i,j+1,dp);
            int delete=1+solve(word1,word2,i+1,j,dp);
            int replace=1+solve(word1,word2,i+1,j+1,dp);

            ans=Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j]=ans;

    }
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(word1,word2,0,0,dp);
    }
}