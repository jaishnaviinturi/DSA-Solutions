//Link: https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE,thirdmax=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                thirdmax=secondmax;
                secondmax=max;
                max=nums[i];
            }else if(nums[i]>secondmax){
                thirdmax=secondmax;
                secondmax=nums[i];
            }else if(nums[i]>thirdmax){
                thirdmax=nums[i];
            }
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<=min2){
                min2=nums[i];
            }
        }
        return Math.max(max*secondmax*thirdmax,max*min1*min2);
    }
}