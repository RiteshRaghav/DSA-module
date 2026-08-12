class Solution {
    public int missingInteger(int[] nums) {
       HashSet<Integer> st = new HashSet<>();
       for(int i:nums){
        st.add(i);
       }
        
       
            int count=1;
            int sum=nums[0];
            for(int j=0;j<nums.length-1;j++){
                 if(nums[j]==nums[j+1]-1){
                    count++;
                    sum+=nums[j+1];
                 }
                 else break;

            }
              
        while(true){
            if(!st.contains(sum)){
                return sum;
            }
            sum++;
        }
    }
}