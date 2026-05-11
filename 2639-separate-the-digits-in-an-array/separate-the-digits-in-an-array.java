class Solution {
    
    public int[] separateDigits(int[] nums) {
      ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> ele=new ArrayList<>();
            while(nums[i]>0){
                ele.add(nums[i]%10);
                nums[i]=nums[i]/10;
            }
            Collections.reverse(ele);
            res.addAll(ele);
        }
        
        int[] arr=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}