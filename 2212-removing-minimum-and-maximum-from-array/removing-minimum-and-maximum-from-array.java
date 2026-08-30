class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int n=nums.length;
        int maxIdx=0;
        int minIdx=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
                maxIdx=i;
            }
            if(mini>nums[i]){
                mini=nums[i];
                minIdx=i;
            }
        }
        int steps=Integer.MAX_VALUE;
        //remove from front 
        steps=Math.min(steps,Math.max(maxIdx,minIdx)+1);

        //remove from back
        steps=Math.min(steps,n-Math.min(maxIdx,minIdx));

        // remove one from left and one from right
        
        if(minIdx>maxIdx){
            int small=n-minIdx;
            int big=maxIdx+1;
            steps=Math.min(steps,small+big);
        }
        else{
            int small=n-maxIdx;
            int big=minIdx+1;
            steps=Math.min(steps,small+big);
        }
        return steps;
    }
}