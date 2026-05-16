class Solution {
    public int findMin(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i:nums){
            mini=Math.min(mini,i);
        }
        return mini;
    }
}