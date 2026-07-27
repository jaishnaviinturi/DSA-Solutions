//Link:https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return (max-1)*(smax-1);
    }
}