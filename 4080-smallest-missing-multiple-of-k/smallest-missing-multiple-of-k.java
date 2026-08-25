class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int i=1;
        while(true){
            int mul=i*k;
            if(!st.contains(mul)){
                return mul;
            }
            i++;
        }
    }
}