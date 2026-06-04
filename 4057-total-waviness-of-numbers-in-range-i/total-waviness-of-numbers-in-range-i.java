class Solution {
    public int count(int num){
        ArrayList<Integer> list=new ArrayList<>();
        while(num>0){
            int rem=num%10;
            list.add(rem);
            num=num/10;
        }
        Collections.reverse(list);
        int totalCount=0;
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)){
                totalCount++;
            }
            else if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)){
                totalCount++;
            }
        }
       return totalCount;
    }
    public int totalWaviness(int num1, int num2) {
        int total=0;
        for(int i=num1;i<=num2;i++){
           if(i<100) continue;
            total+=count(i);
        }
        return total;
    }
}