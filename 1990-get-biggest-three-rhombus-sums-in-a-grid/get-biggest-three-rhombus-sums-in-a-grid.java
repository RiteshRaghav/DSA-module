class Solution {
    public int find(int[][] grid,int i,int j,int k){
    int n=grid.length;
    int m=grid[0].length;

    if(i + 2*k >= n || j + k >= m || j - k < 0) return -1;

    int sum = 0;

    int r=i,c=j;

    for(int l=0;l<k;l++)
        sum+=grid[r+l][c-l];

    r=i+k;
    c=j-k;

    for(int l=0;l<k;l++)
        sum+=grid[r+l][c+l];

    r=i+2*k;
    c=j;

    for(int l=0;l<k;l++)
        sum+=grid[r-l][c+l];

    r=i+k;
    c=j+k;

    for(int l=0;l<k;l++)
        sum+=grid[r-l][c-l];

    return sum;
}

    public int[] getBiggestThree(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(set.add(grid[i][j])){
                    pq.add(grid[i][j]);

                    if(pq.size()>3) pq.remove();
                }
                for(int k=1;k<Math.min(row,col);k++){
                    int ele=find(grid,i,j,k);
                    if(ele==-1) break;
                    if(set.add(ele)){
                      pq.add(ele);

                    if(pq.size()>3) pq.remove();
                     }
                }
            }
        }
        int n=pq.size();
        int[] res=new int[n] ;  

        for(int i=n-1;i>=0;i--){
            res[i]=pq.remove();
        }
        return res;
    }
}