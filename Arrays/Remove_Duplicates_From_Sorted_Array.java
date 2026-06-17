//Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0,end=1;
        while(end<nums.length){
            if(nums[start]!=nums[end]){
                nums[start+1]=nums[end];
                start++;
            }
            end++;
        }
        return start+1;
    }
}