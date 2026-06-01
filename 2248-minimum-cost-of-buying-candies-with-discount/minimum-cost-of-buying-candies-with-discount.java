class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i=cost.length-1;
        int minCost=0;
        while(i>=0){
           if((i-1)>=0){
            minCost+=cost[i]+cost[i-1];
           }
           else{
            minCost+=cost[i];
           }
            i-=3;
        }
        return minCost;
    }
}