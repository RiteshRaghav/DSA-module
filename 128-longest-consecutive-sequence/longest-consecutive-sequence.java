class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int maxLen=0;
        for(int i:st){
            if(!st.contains(i-1)){
                int curr=1;
                int num=i+1;
                while(st.contains(num)){
                    curr++;
                    num+=1;

                }
                maxLen=Math.max(maxLen,curr);
            }
        }
        return maxLen;
        
    }
}