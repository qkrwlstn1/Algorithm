class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()) {
        	if(c == ' ') {
        		answer += " ";
        		continue;
        	}else if(c+n > 122 || (c<91 && c+n>90)) c-=26;
        	answer += (char)(c+n);
        	
        }
        return answer;
    }
}