class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        int mini=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[lo]<=nums[mid]){
                mini=Math.min(mini,nums[lo]);
                lo=mid+1;
            }else{
                mini=Math.min(mini,nums[mid]);
                hi=mid-1;
            }
        
        
        }
        return mini;
    }
}