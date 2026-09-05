class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxPre=new int[nums.length];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            maxPre[i]=maxi;
        }

        int[] minSuff=new int[nums.length];
        int mini=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            mini=Math.min(mini,nums[i]);
            minSuff[i]=mini;
        }
        for(int i=0;i<nums.length;i++){
            if((maxPre[i]-minSuff[i])<=k){
                return i;
            }
        }
        return -1;


    }
}