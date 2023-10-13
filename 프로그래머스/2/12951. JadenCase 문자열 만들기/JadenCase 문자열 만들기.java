class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
		if(s.charAt(0) >= 'a') answer.append((char)(s.charAt(0) -32));
		else answer.append(s.charAt(0));
		
		for(int i=1; i<s.length(); i++) {
			
			if(s.charAt(i-1) == ' ' && s.charAt(i) > 'Z') answer.append((char)(s.charAt(i) -32));
			else if(s.charAt(i-1) != ' ' && '9' < s.charAt(i) && s.charAt(i) < 'a') answer.append((char)(s.charAt(i) +32));
			else answer.append((char)(s.charAt(i)));
		}
        
		
		
		return answer.toString();
    }
}