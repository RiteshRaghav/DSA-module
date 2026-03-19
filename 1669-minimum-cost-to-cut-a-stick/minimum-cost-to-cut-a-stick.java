class Solution {
   public int solve(int i,int j,int[] arr,int[][]dp){
     if(i>j) return 0;
     if(dp[i][j]!=-1) return dp[i][j];
     int minCost=Integer.MAX_VALUE;
     for(int k=i;k<=j;k++){
        int len=arr[j+1]-arr[i-1];
        int cost=solve(i,k-1,arr,dp)+solve(k+1,j,arr,dp)+len;
        minCost=Math.min(minCost,cost);
     }
     return dp[i][j]=minCost;
   }
    public int minCost(int n, int[] cuts) {
        int[] arr=new int[cuts.length+2];
        int i=0;
        for(i=0;i<cuts.length;i++){
            arr[i]=cuts[i];
        }
        arr[i++]=0;
        arr[i]=n;
        Arrays.sort(arr);
        int[][] dp=new int[arr.length-1][arr.length-1];
        for(int j=0;j<arr.length-1;j++){
            Arrays.fill(dp[j],-1);
        }

        return solve(1,arr.length-2,arr,dp);
    }
}