class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0, y=0;
        
        
        for(int i=0;i<s.length(); i++) {
        	if(s.charAt(i) == 112 || s.charAt(i) == 80) p++;
        	else if(s.charAt(i) == 121 || s.charAt(i) == 89) y++;
        }
        
        return p==y ? true : false;
    }
    
}