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

/*Best Solution:
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        // Count frequencies of the required characters
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': b++; break;
                case 'a': a++; break;
                case 'l': l++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }
        
        // 'l' and 'o' are needed twice per word, so divide their counts by 2
        l = l / 2;
        o = o / 2;
        
        // The answer is the limiting factor among all required letters
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}*/