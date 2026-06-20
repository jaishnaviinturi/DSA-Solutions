//Link: https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                while(nums[i]!=0 && i<j){
                    i++;
                }
                if(nums[i]==0){
                    nums[i]=nums[j];
                    nums[j]=0;
                }
            }
            j++;
        }
    }
}
