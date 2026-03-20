class Solution {
    public int findDiff(int r,int c,int k,int[][] grid){
       HashSet<Integer> set=new HashSet<>();
       int idx=0;
        for(int i=r;i<r+k;i++){
            for(int j=c;j<c+k;j++){
               set.add(grid[i][j]);
            }
        }
        int arr[]=new int[set.size()];
        for(int i:set){
            arr[idx++]=i;
        }
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
             int mini=Math.abs(arr[i-1]-arr[i]);
             diff=Math.min(diff,mini);

        }
        if(diff==Integer.MAX_VALUE) return 0;
        return diff;
    }
    public int[][] minAbsDiff(int[][] grid, int k) {
       int m=grid.length;
       int n=grid[0].length;
       int[][] ans=new int[m-k+1][n-k+1];
       for(int i=0;i<m-k+1;i++){
        for(int j=0;j<n-k+1;j++){
            int minDiff=findDiff(i,j,k,grid);
            ans[i][j]=minDiff;
        }
       }
       return ans;
    }
}