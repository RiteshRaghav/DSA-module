class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
          int result=Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
            int curr=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
               
                
                result=Math.min(result,Math.max(curr,waterStartTime[j])+waterDuration[j]);
            }
          }
          for(int i=0;i<m;i++){
            int curr=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++){
                result=Math.min(result,Math.max(curr,landStartTime[j])+landDuration[j]);
            }
          }
          return result;
        
        /*int[][] land=new int[landStartTime.length][2];
        int[][] water=new int[waterStartTime.length][2];

        for(int i=0;i<land.length;i++){
            land[i][0]=landStartTime[i];
            land[i][1]=landDuration[i];
        }
         for(int i=0;i<water.length;i++){
            water[i][0]=waterStartTime[i];
            water[i][1]=waterDuration[i];
        }

        Arrays.sort(land,(a,b)->a[0]-b[0]);
        Arrays.sort(water,(a,b)->a[0]-b[0]);

       int mini=Integer.MAX_VALUE;
       int sum1=land[0][0]+land[0][1];
        int sum2=water[0][0]+water[0][1];
       
               if(sum1>=water[0][0]){
                    mini=Math.min(mini,sum1+water[0][1]);
               }
               if(sum2>=land[0][0]){
                   mini=Math.min(mini,sum2+land[0][1]);
               }
               if(land[0][0]<water[0][0]){
                  
               }
               /*if(sum1>=sum2){
                     mini=Math.min(sum1,mini);
               }
               if(sum2>=sum1){
                     mini=Math.min(sum2,mini);
               }
               else{
                     mini=Math.min(mini,sum2+sum1);
               }
        
           return mini;*/

           
    }   
}