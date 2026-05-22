class Solution {
    public int search(int[] nums, int target) {
        

        int n=nums.length;
        int lo=0;
        int high=n-1;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
               
            
                if(nums[high]>=target && target>nums[mid]){
                    lo=mid+1;
                }
                else{
                    high=mid-1;}
                
            }
        }
        return -1;
    }
}