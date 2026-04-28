class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;

        int[] arr=new int[m*n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[idx++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int index=(arr.length)/2;
        int target=arr[index];
        int result=0;
        for(int i:arr){
            if(i%x!=target%x) return -1;

            result+=Math.abs(target-i)/x;
        }
        return result;
    }
}