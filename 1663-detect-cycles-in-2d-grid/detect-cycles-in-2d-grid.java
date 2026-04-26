class Solution {
   
    public boolean dfs(int i,int j,int r,int c,char curr,boolean[][] visited,char[][] grid){
        
        visited[i][j] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int d = 0; d < 4; d++){
            int ni = i + dx[d];
            int nj = j + dy[d];

            if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length
               && grid[ni][nj] == curr){

                if(!visited[ni][nj]){
                    if(dfs(ni, nj, i, j, curr, visited, grid)) return true;
                }
                else if(ni != r || nj != c){
                    return true; 
                }
            }
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(!visited[i][j] && dfs(i,j,-1,-1,grid[i][j],visited,grid)){
                    return true;
                }
            }
        }
        return false;
    }
}