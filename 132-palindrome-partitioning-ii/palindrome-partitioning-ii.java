class Solution {
     public boolean isPalindrome(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int solve(int i,String s,int[] dp){
        if(i==s.length()) return 0;
        if(dp[i]!=-1) return dp[i];

        int minPar=Integer.MAX_VALUE;
        for(int k=i;k<s.length();k++){
            if(isPalindrome(i,k,s)){
                int cost=1+solve(k+1,s,dp);
                minPar=Math.min(minPar,cost);
            }
        }
        return dp[i]=minPar;
    }
    public int minCut(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(0,s,dp)-1;
    }
}