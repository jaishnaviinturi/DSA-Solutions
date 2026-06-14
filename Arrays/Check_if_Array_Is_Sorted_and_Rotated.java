//Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
        //bool res=true;
        int[] a=new int[nums.length];
        int z=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                for(int j=i+1;j<nums.length;j++){
                    a[z++]=nums[j];
                }
                for(int j=0;j<i+1;j++){
                    a[z++]=nums[j];
                }
                Arrays.sort(nums);
                return Arrays.equals(nums,a);
            }

        }
        return true;
    }
}

/*
Best Solution:
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){

            if(nums[i] > nums[(i + 1) % n]){
                count++;
            }
        }

        return count <= 1;
    }
}
*/