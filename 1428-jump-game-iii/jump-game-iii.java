class Solution {
   public boolean solve(int idx,int arr[],boolean[]visited){
    if(idx<0 || idx>=arr.length || visited[idx]) return false;
    visited[idx]=true;
    if(arr[idx]==0) return true;

    return solve(idx+arr[idx],arr,visited) || solve(idx-arr[idx],arr,visited);
   }
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];
        return solve(start,arr,visited);
    }
}