class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int oddCount=0;
        int subCount=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
           if(nums[i]%2!=0){
            oddCount++;
           }
           if(map.containsKey(oddCount-k)){
            subCount+=map.get(oddCount-k);
           }
           if(map.containsKey(oddCount)){
            map.put(oddCount,map.get(oddCount)+1);
           }
           else{
            map.put(oddCount,1);
           }
        }
        return subCount;
    }
}