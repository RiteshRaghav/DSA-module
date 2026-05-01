class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int f=0;
        int sum=0;
    
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        f+=i*nums[i];
       }
    int result=f;
       for(int k=0;k<nums.length;k++){
           int newF=f+sum-nums.length*nums[nums.length-1-k];

           result=Math.max(result,newF);
           f=newF;       
       }
    
     return result;
    }
}