class Solution {
    public int large(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public int small(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int mini=small(nums);
        int maxi=large(nums);
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
         for(int i=mini;i<=maxi;i++){
             if(!st.contains(i)){
                 result.add(i);
             }
         }
        return result;
    }
}