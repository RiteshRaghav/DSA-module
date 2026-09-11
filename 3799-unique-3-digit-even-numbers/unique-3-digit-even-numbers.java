class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        HashSet<Integer> st=new HashSet<>();
        st.add(0);
        for(int i=0;i<digits.length;i++){
            if(digits[i] == 0) continue;
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j || i==k || j==k) continue;
                    int nums=(digits[i]*100)+(digits[j]*10)+digits[k];
                    if(nums>=100 && nums<=999 && nums%2==0 && !st.contains(nums)) {
                        st.add(nums);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}