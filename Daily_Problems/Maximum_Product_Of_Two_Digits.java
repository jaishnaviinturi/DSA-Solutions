//Link: https://leetcode.com/problems/maximum-product-of-two-digits/

class Solution {
    public int maxProduct(int n) {
        int max=0,secondmax=0;
        while(n!=0){
            if((n%10)>max){
                secondmax=max;
                max=n%10;
            }else if((n%10)>secondmax){
                secondmax=n%10;
            }
            n/=10;
        }
        return max*secondmax;
    }
}