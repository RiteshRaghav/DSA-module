class Solution {
    public long maxTotalValue(int[] arr, int k) {
        
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(arr[i],maxi);
            mini=Math.min(arr[i],mini);
        }
        return (long)(maxi-mini)*k;
    }
}