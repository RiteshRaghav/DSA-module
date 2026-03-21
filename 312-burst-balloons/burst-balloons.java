class Solution {
    public int solve(int s,int e,int[]arr,int[][] dp){
        if(s>e) return 0;
        if(dp[s][e]!=-1) return dp[s][e];
        int maxCost=Integer.MIN_VALUE;
        for(int i=s;i<=e;i++){
            int cost=arr[s-1]*arr[i]*arr[e+1];
            int totalCost=solve(s,i-1,arr,dp)+solve(i+1,e,arr,dp)+cost;
            maxCost=Math.max(maxCost,totalCost);
        }
         return dp[s][e]=maxCost;
    }
    public int maxCoins(int[] nums) {
        int[] arr=new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=1;i<=nums.length;i++){
            arr[i]=nums[i-1];
        }
        int[][] dp=new int[nums.length+1][nums.length+1];
        for(int i=0;i<=nums.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(1,nums.length,arr,dp);
    }
}