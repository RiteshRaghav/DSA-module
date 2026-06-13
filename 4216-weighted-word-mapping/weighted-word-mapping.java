class Solution {
    public int calc(String s,int[] weights){
        int w=0;
        for(int i=0;i<s.length();i++){
           w+=weights[s.charAt(i)-'a'];
        }
        return w%26;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<words.length;i++){
            int w=calc(words[i],weights);

            sb.append((char)('z'-w));
        }
        return sb.toString();
    }

}