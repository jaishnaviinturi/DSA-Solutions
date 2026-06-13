//Link: https://leetcode.com/problems/weighted-word-mapping/description/

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[(int)(c-'a')];
            }
            int res=sum%26;
            sb.append((char)('z'-res));
        }
        return sb.toString();
    }
}