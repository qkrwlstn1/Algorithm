class Solution {
    boolean solution(String s) {
        int idx =0;
        for(int i=0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		idx++;
        	}else idx--;
        	
        	if(idx < 0) return false;
        }
		
        return idx !=0 ? false : true;
    }
}