//Link: https://leetcode.com/problems/find-the-highest-altitude/description

class Solution {
    public int largestAltitude(int[] gain) {
        int sum=gain[0];
        int max=Math.max(0,sum);
        for(int i=1;i<gain.length;i++){
            sum+=gain[i];
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}