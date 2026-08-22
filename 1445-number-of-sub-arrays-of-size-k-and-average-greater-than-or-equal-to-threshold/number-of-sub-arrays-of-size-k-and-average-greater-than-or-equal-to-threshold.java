class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int i=0;
        int j=k-1;
        int cnt=0;
        while(j<arr.length){
            if((sum/k)>=threshold){
                 cnt++;
            }
            sum-=arr[i];
            i++;
            j++;
            if(j<arr.length){
            sum+=arr[j];}
        }
        return cnt;
    }

}