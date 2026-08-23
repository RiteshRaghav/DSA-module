class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxlen=0;
        int cnt=0;
        while(j<nums.length){
             if(nums[j]==0){
                cnt++;
            
            }
            if(cnt>k){
              if(nums[i]==0){
                cnt--;
              }
              i++;
            }
           
            maxlen=Math.max(maxlen,j-i+1);
            j++;

        }
        return maxlen;
    }
}