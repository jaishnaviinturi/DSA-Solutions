//Link: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/

class Solution {
    public int minimumPushes(String word) {
        int n=word.length(),sum=0;
        if(n<=8){
            return n;
        }
        int x=1;
        while(n>0){
            if(n>8){
                sum+=x*8;
                x++;
                n-=8;
            }else{
                sum+=x*n;
                return sum;
            }
        }
        return sum;
    }
}