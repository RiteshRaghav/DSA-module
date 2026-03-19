class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int Xsum[][]=new int[n+1][m+1];
        int Ysum[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(grid[i-1][j-1]=='X'){
                    Xsum[i][j]=Xsum[i-1][j]+Xsum[i][j-1]-Xsum[i-1][j-1]+1;
                     Ysum[i][j]=Ysum[i-1][j]+Ysum[i][j-1]-Ysum[i-1][j-1];
                }
                else if(grid[i-1][j-1]=='Y'){
                    Ysum[i][j]=Ysum[i-1][j]+Ysum[i][j-1]-Ysum[i-1][j-1]+1;
                    Xsum[i][j]=Xsum[i-1][j]+Xsum[i][j-1]-Xsum[i-1][j-1];
                }
                else{
                     Xsum[i][j]=Xsum[i-1][j]+Xsum[i][j-1]-Xsum[i-1][j-1];
                     Ysum[i][j]=Ysum[i-1][j]+Ysum[i][j-1]-Ysum[i-1][j-1];
                }
            }
        }
      
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                
                if(Xsum[i][j]==Ysum[i][j] && Xsum[i][j]>0){
                    count++;
                }
            }
        }
        return count;
    }
}