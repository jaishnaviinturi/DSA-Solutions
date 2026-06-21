//Link: https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j++;
            }else{
                j=0;
            }
            max=Math.max(max,j);
        }
        return max;
    }
}