class pair{
    int plant;
    int grow;
    pair(int plant,int grow){
        this.plant=plant;
        this.grow=grow;
    }
}
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
      ArrayList<pair> list=new ArrayList<>();
      for(int i=0;i<plantTime.length;i++){
        list.add(new pair(plantTime[i],growTime[i]));
      }
      Collections.sort(list,(a,b)->b.grow-a.grow);

      int maxi=0;
      int prev=0;
      for(int i=0;i<list.size();i++){
        int currPlant=list.get(i).plant;
        int currGrow=list.get(i).grow;

        prev=prev+currPlant;

        int bloomDay=prev+currGrow;
        maxi=Math.max(bloomDay,maxi);
      }
      return maxi;
    }
}