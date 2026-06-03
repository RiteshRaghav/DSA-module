class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
       list.add(intervals[0][0]);
       list.add(intervals[0][1]); 
        res.add(list);
        for(int i=1;i<intervals.length;i++){
            if(res.get(res.size()-1).get(1)>=intervals[i][0]){
                res.get(res.size()-1).set(1,Math.max(res.get(res.size()-1).get(1), intervals[i][1]));
            }
            else{
                list=new ArrayList<>();
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
                res.add(list);
            }
            
        }
        
        
        
        
        int[][] result=new int[res.size()][2];
        for(int j=0;j<res.size();j++){
            result[j][0]=res.get(j).get(0);
            result[j][1]=res.get(j).get(1);
        }
        return result;
    }
}