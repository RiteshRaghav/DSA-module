class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int result=Integer.MAX_VALUE;
        int bestland=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            bestland=Math.min(bestland,landStartTime[i]+landDuration[i]);
        }

        for(int i=0;i<waterStartTime.length;i++){
            if(bestland>=waterStartTime[i]){
                result=Math.min(result,bestland+waterDuration[i]);
            }
            else{
                result=Math.min(result,waterStartTime[i]+waterDuration[i]);
            }
        }
  
         
        int bestwater=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            bestwater=Math.min(bestwater,waterStartTime[i]+waterDuration[i]);
        }

        for(int i=0;i<landStartTime.length;i++){
            if(bestwater>=landStartTime[i]){
                result=Math.min(result,bestwater+landDuration[i]);
            }
            else{
                result=Math.min(result,landStartTime[i]+landDuration[i]);
            }
        }

       return result;
    }
}