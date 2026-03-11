class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
       StringBuilder res=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1') res.append('0');
        else res.append('1');
       }
       return Integer.parseInt(res.toString(),2);
    }
}