class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<obstacles.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(obstacles[i][0]).append("-").append(obstacles[i][1]);
            set.add(sb.toString());    
        }

        int[] dir=new int[]{0,1};
        int x=0;
        int y=0;
        int maxDist=0;

        for(int i=0;i<commands.length;i++){
            if(commands[i]==-2){
                int temp=dir[0];
                dir[0]=-dir[1];
                dir[1]=temp;
            }
            else if(commands[i]==-1){
                 int temp=dir[0];
                dir[0]=dir[1];
                dir[1]=-temp;
            }
            else{
                for(int j=0;j<commands[i];j++){
                    int newX=x+dir[0];
                    int newY=y+dir[1];

                    StringBuilder sb=new StringBuilder();
                    sb.append(newX).append("-").append(newY);
                    if(set.contains(sb.toString())){
                        break;
                    }
                    x=newX;
                    y=newY;
                }
            }
            maxDist=Math.max(maxDist,x*x+y*y);
        }
        return maxDist;
    }
}