class Solution {
   public String solution(String s) {
		int spaceCnt =0;
		
        String answer = "";
        int sString = 0, lString = 0;
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) < 'a') {
        		sString = 32;
        		lString = 0;
        	}else {
        		sString = 0;
        		lString = -32;
        	}
        	if(s.charAt(i) == ' ') {
        		spaceCnt = i+1;
        		answer += " ";
        	}else if((i-spaceCnt) % 2 ==0) {
        		answer += (char)(s.charAt(i) + lString);
        	}else answer +=(char)(s.charAt(i) + sString);
        }
        return answer;
    }
}