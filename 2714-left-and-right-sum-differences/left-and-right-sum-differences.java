class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length==1) return new int[]{0};
        
        
        int[] result=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            
            left[i]=left[i-1]+nums[i];
            
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            
            right[i]=right[i+1]+nums[i];
            
        }
        
        result[0]=right[1];
        result[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            result[i]=Math.abs(left[i-1]-right[i+1]);
        }
        return result;
    }
}