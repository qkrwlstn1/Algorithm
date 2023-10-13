class Solution {
    public String solution(String s) {
        String answer = "";
        char[] stringSort = s.toCharArray();
        char tmp;
        for(int i=0; i<s.length(); i++) {
        	for(int j=i+1; j<s.length(); j++) {
        		if(stringSort[i] < stringSort[j]) {
        			tmp = stringSort[i];
        			stringSort[i] = stringSort[j];
        			stringSort[j] = tmp;
        		}
        	}
        	answer += stringSort[i];
        }
        return answer;
    }
}