//Link:https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n'){
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
        if(m.size()<5 || m.get('l')<2 || m.get('o')<2) return 0;
        int min=Integer.MAX_VALUE;
        for(char k:m.keySet()){
            min=Math.min(min,m.get(k));
        }
        while(min*2>m.get('l') || min*2>m.get('o') || min<0){
            min--;
        }
        return min;
    }
}