//Link: https://leetcode.com/problems/process-string-with-special-operations-i/

class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                res.append(c);
            }else if(c=='*'){
                if(res.length()>0) res.deleteCharAt(res.length()-1);
            }else if(c=='#'){
                res.append(res);
            }else if(c=='%'){
                res.reverse();
            }
        }
        return res.toString();     
    }
}