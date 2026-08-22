class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int r=cardPoints.length-1;
        int maxi=sum;
        int rSum=0;
        for(int j=k-1;j>=0;j--){
           sum-=cardPoints[j];
           rSum+=cardPoints[r];
           maxi=Math.max(maxi,sum+rSum);
           r--;
        }
        return maxi;
    }
}