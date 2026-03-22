class Solution {
    public int solve(int idx,int k,int[] arr,int[] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int len=0;
        int maxSum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=idx;i<Math.min(arr.length,idx+k);i++){
            len++;
            maxi=Math.max(maxi,arr[i]);
            int sum=(len*maxi)+solve(i+1,k,arr,dp);
            maxSum=Math.max(maxSum,sum);
        }
        return dp[idx]=maxSum;
    } 
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int[] dp=new int[arr.length];
       Arrays.fill(dp,-1);
       
       return solve(0,k,arr,dp);
    }
}