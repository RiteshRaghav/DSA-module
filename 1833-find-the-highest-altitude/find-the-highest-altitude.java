class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            if(sum>=0){
                maxAlt=Math.max(maxAlt,sum);
            }
            
        }
        return maxAlt;
    }
}