//Link : https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/

class Solution {
    public int maximumLength(int[] nums) {
        Map<Long,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put((long)nums[i],m.getOrDefault((long)nums[i],0)+1);
        }
        int max=1;
        for(long l:m.keySet()){
            if(l==1){
                max=m.get(l)%2==0?Math.max(max,m.get(l)-1):Math.max(max,m.get(l));
            }else if(m.get(l)>1){
            int a=2,sum=2;
            boolean flag=false;
            while(m.containsKey((long)Math.pow(l,a))){
                flag=true;
                if(m.get((long)Math.pow(l,a))==1){
                    sum+=1;
                    break;
                }
                sum+=2;
                a*=2;
                System.out.println(l+" "+sum + " "+ a);
            }
            if (flag) {
                    if (m.containsKey((long) Math.pow(l, a)) && m.get((long) Math.pow(l, a)) == 1) {
                        max = Math.max(max, sum);
                    } else {
                        max = Math.max(max, sum - 1);
                    }
                }
            }
        }       
        return max;       
    }
}
