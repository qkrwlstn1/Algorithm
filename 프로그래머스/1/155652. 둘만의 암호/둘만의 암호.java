class Solution {
  public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {//s.길이
        	char temp = s.charAt(i);
        	for(int j=0; j<index; j++){//index
        		temp++;
        		if(temp > 122) temp -=26;
        		for(int q=0; q<skip.length(); q++) {//s랑skip 문자 비교
        			if(temp == skip.charAt(q)) {
        				temp++;
        				if(temp > 122) temp -=26;
        				q=-1;
        			}
        		}
        	}
        	answer += temp;
        }
        return answer;
    }
}