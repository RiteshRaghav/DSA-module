class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int cnt=0;
        long mul=1;
        int i=0;
        int j=0;
        while(j<nums.length){
           mul=(long)(mul*nums[j]);
           while(mul>=k){
              mul=mul/nums[i];
              i++;
           }
           
           
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}