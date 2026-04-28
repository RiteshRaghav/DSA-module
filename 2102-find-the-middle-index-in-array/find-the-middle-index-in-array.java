class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0;i<n;i++){
            int sum1=0;
            int sum2=0;
            if(i==0){ 
                sum1=0;
                sum2=prefix[n-1]-prefix[i];
            }
           else if(i==n-1){ 
                sum2=0;
                sum1=prefix[i-1];
            }
            else{
                 sum1=prefix[i-1];
                 sum2=prefix[n-1]-prefix[i];
            }
            if(sum1==sum2) return i;


        }
        return -1;

    }
}