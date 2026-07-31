//Link: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8){
            return n;
        }
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int k=0,x=1,sum=0;
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]==0){
                return sum;
            }
             if(k==8){
                x++;
                k=0;
            }
            sum+=x*freq[i];
            k++;
        }
        return sum;
    }
}
