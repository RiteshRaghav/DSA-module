class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int r1=x;
        int r2=x+k-1;
        while(r1<r2){
            for(int i=y;i<y+k;i++){
                int temp=grid[r1][i];
                grid[r1][i]=grid[r2][i];
                grid[r2][i]=temp;

            }
            r1++;
            r2--;
        }
             return grid;
    }
}